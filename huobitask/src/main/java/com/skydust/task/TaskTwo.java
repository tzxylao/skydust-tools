package com.skydust.task;

import com.alibaba.fastjson.JSON;
import com.skydust.bean.DealOrder;
import com.skydust.bean.TickerDetail;
import com.skydust.service.HuobiMain;
import com.skydust.service.HuobiService;
import com.skydust.service.KlineService;
import com.skydust.util.SetSystemProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class TaskTwo extends TaskOne {
    //最新10条订单
    protected List<DealOrder> dealOrders;
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private int minute_bak;

    public static void main(String[] args) throws Exception {
        HuobiService service = new HuobiService();
        String newDealOrders = service.getNewDealOrders(2, HuobiMain.NEW_DEAL_ORDERS);
        List<DealOrder> dealOrders = JSON.parseArray(newDealOrders, DealOrder.class);
        System.out.println(dealOrders);

        List<List<Object>> klineData = KlineService.getKlineData(2 + "");
        TaskTwo two = new TaskTwo();
        two.prepared(service);
        System.out.println(two.accountInfo);
    }

    /**
     * @param service
     * @throws Exception
     */
    @Override
    protected void handleTrade(HuobiService service) throws Exception {
        Calendar c = Calendar.getInstance();
        int minute = c.get(Calendar.MINUTE);
        if (minute % 1 == 0) {
            if (minute != minute_bak) {
                minute_bak = minute;
                log.info(String.format("运行正常！"));
            }
        }
        prepared(service);
        List<List<Object>> klineData = KlineService.getKlineData(3 + "");
        boolean downFlag_1 = judgeRatio(klineData, 0, BigDecimal.ZERO, 1, 1, "down", 0.0, 0.0);
        boolean upFlag_1 = judgeRatio(klineData, 0, BigDecimal.ZERO, 1, 1, "up", 0.0, 0.0);

//        klineData = KlineService.getKlineData(4 + "");
//        boolean downFlag_2 = judgeRatio(klineData, 0, BigDecimal.ZERO, 1, 2, "down", -0.002, 0.0005);
//        boolean downFlag_3 = judgeRatio(klineData, 0, BigDecimal.ZERO, 2, 1, "down", -0.001, 0.002);
//
//
//        boolean upFlag_2 = judgeRatio(klineData, 0, BigDecimal.ZERO, 1, 2, "up", -0.002, 0.0005);
//        boolean upFlag_3 = judgeRatio(klineData, 0, BigDecimal.ZERO, 2, 1, "up", -0.001, 0.002);
//
//        klineData = KlineService.getKlineData(5 + "");
//        boolean downFlag_4 = judgeRatio(klineData, 0, BigDecimal.ZERO, 2, 2, "down", -0.001, 0.001);
//        boolean upFlag_4 = judgeRatio(klineData, 0, BigDecimal.ZERO, 2, 2, "up", -0.001, 0.001);

        //实时行情数据
        TickerDetail ticker = tickerLTC.getTicker();

        //可用人民币
        Double available_cny_display = accountInfo.getAvailable_cny_display();
        //可用ltc
        Double available_ltc_display = accountInfo.getAvailable_ltc_display();

        //这天最高价
        Double high = ticker.getHigh();
        //这天最低价
        Double low = ticker.getLow();
        //最新价格
        Double last = ticker.getLast();
        //开盘价
        Double open = ticker.getOpen();
        double diff = last - open;
        double ratio = diff / open;
        //表示凹谷出现，买
        if (downFlag_1) {
//            if (ratio > -0.025) {
//                log.info("跌涨比：" + ratio + "，可涨幅度太小，不买");
//                log.info("kline:" + JSON.toJSONString(klineData));
//                return;
//            }

            if (available_cny_display < 1) {
                log.info("资金不足，还剩：" + available_cny_display + "，不能买入");
                log.info("跌涨比：" + ratio);
                log.info("kline:" + JSON.toJSONString(klineData));
                return;
            }
            Double sellPrice = Double.parseDouble(SetSystemProperty.getKeyValue("sell_price"));
            if (sellPrice != 0 && last < sellPrice) {
                buyByMarket(service, ticker, available_cny_display);
            }
        }
        if (ratio > 0.1) {
            sellByMarket(service, ticker, last, available_ltc_display);
        }
        //表示凸峰出现，卖
        if (upFlag_1) {
//            if (ratio < -0.06) {
//                log.info("跌涨比：" + ratio + "，还有涨幅空间，不卖");
//                log.info("kline:" + JSON.toJSONString(klineData));
//                return;
//            }

            if (available_ltc_display == 0) {
                log.info("持有ltc已为0，无ltc可卖");
                log.info("跌涨比：" + ratio);
                log.info("kline:" + JSON.toJSONString(klineData));
                return;
            }
            //记录的上次买价，总金额
            String price = SetSystemProperty.getKeyValue("buy_price");
            if (last * available_ltc_display * 0.995 > Double.parseDouble(price)) {
                sellByMarket(service, ticker, last, available_ltc_display);
            }
        }

    }

    private void sellByMarket(HuobiService service, TickerDetail ticker, Double last, Double available_ltc_display) throws Exception {
        // 市价卖出
        String sellRet = service.sellMarket(2, available_ltc_display + "", null, null, HuobiMain.SELL_MARKET);
        //记录卖价单价
        SetSystemProperty.writeProperties("sell_price", last + "");
        log.info("市价卖出：" + sellRet);
        log.info("行情数据：" + JSON.toJSONString(ticker));
    }

    private void buyByMarket(HuobiService service, TickerDetail ticker, Double available_cny_display) throws Exception {
        // 市价买入
        String buyMarket = service.buyMarket(2, available_cny_display + "", null, null, HuobiMain.BUY_MARKET);
        //记录上次买价
        SetSystemProperty.writeProperties("buy_price", available_cny_display + "");
        log.info("市价买入：" + buyMarket);
        log.info("行情数据：" + JSON.toJSONString(ticker));
    }

    /**
     * 判断曲线是否满足条件
     *
     * @param klineData 曲线数据
     * @param i         遍历位置开始位置
     * @param pre       默认给0
     * @param downCount 向下斜几次
     * @param upCount   下上斜几次
     * @param action    表示判断凹谷还是凸峰 down表示先向下斜凹谷，up表示先向上斜凸峰
     * @return
     */
    public boolean judgeRatio(List<List<Object>> klineData, int i, BigDecimal pre, int downCount, int upCount, String action, Double ratioDown, Double ratioUp) {
        BigDecimal after = (BigDecimal) klineData.get(i).get(4);
        i++;
        if (pre.compareTo(BigDecimal.ZERO) == 0) {
            return judgeRatio(klineData, i, after, downCount, upCount, action, ratioDown, ratioUp);
        }
        BigDecimal ratio = (after.subtract(pre).divide(pre, 12, BigDecimal.ROUND_HALF_UP));
        //表示先向下，后向上
        if (action.equals("down")) {
            //向下斜
            if (ratio.doubleValue() < ratioDown) {
                if (downCount == 0) {
                    return false;
                }
                downCount--;
            } else if (ratio.doubleValue() > ratioUp && downCount == 0) {//开始向上
                upCount--;
                if (upCount == 0) {
                    return true;
                }
            } else {
                return false;
            }
            return judgeRatio(klineData, i, after, downCount, upCount, action, ratioDown, ratioUp);
        }
        if (action.equals("up")) {
            //向上斜
            if (ratio.doubleValue() > ratioUp) {
                if (upCount == 0) {
                    return false;
                }
                upCount--;
            } else if (ratio.doubleValue() < ratioDown && upCount == 0) {//开始向下
                downCount--;
                if (downCount == 0) {
                    return true;
                }
            } else {
                return false;
            }
            return judgeRatio(klineData, i, after, downCount, upCount, action, ratioDown, ratioUp);
        }
        return false;
    }
}

package com.skydust.task;

import com.alibaba.fastjson.JSON;
import com.skydust.bean.AccountInfo;
import com.skydust.bean.TickerDetail;
import com.skydust.bean.TickerLTC;
import com.skydust.service.HuobiMain;
import com.skydust.service.HuobiService;
import com.skydust.util.UrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.TimerTask;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class TaskOne extends TimerTask {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) throws Exception {
        HuobiService service = new HuobiService();
        String account = service.getAccountInfo(HuobiMain.ACCOUNT_INFO);
        System.out.println(account);
    }

    @Override
    public void run() {
        HuobiService service = new HuobiService();
        try {
            handleTrade(service);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                handleTrade(service);
            } catch (Exception e1) {
            }
        }
    }

    private void handleTrade(HuobiService service) throws Exception {
//        log.info("-----账户数据-----");
        String account = service.getAccountInfo(HuobiMain.ACCOUNT_INFO);
//        log.info(account);
        AccountInfo accountInfo = JSON.parseObject(account, AccountInfo.class);
        //可用人民币
        Double available_cny_display = accountInfo.getAvailable_cny_display();
        //可用ltc
        Double available_ltc_display = accountInfo.getAvailable_ltc_display();

        //实时行情数据
//        log.info("-----实时行情数据-----");
        String tickerLtc = UrlUtils.loadJson("http://api.huobi.com/staticmarket/ticker_ltc_json.js");
        TickerLTC tickerLTC = JSON.parseObject(tickerLtc, TickerLTC.class);
//        log.info(tickerLtc);
        TickerDetail ticker = tickerLTC.getTicker();
        //这天最高价
        Double high = ticker.getHigh();
        //这天最低价
        Double low = ticker.getLow();
        //最新价格
        Double last = ticker.getLast();
        //最新卖价
        Double sell = ticker.getSell();
        //最新买价
        Double buy = ticker.getBuy();
        double diffMax = high - low;
        double diffLow = sell - low;
        double ratio = diffLow / diffMax;
        //买
        if (ratio <= 0.25) {
            // 市价买入
            double amount = available_cny_display;
            String buyMarket = service.buyMarket(2, amount + "", null, null, HuobiMain.BUY_MARKET);
            log.info("-----账户数据-----");
            log.info(account);
            log.info("-----实时行情数据-----");
            log.info(tickerLtc);
            log.info("-----买入结果-----");
            log.info("buy:" + buyMarket);
        }

        //卖
        if (ratio >= 0.85) {
            // 市价卖出
            double sellCny = available_ltc_display * (1 - ratio);
            if (sellCny < 0.01) {
                //太小了就都卖掉
                sellCny = available_ltc_display;
            }
            double amount = sellCny / sell;
            BigDecimal bg = new BigDecimal(amount);
            amount = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            // 市价卖出
            String sellVal = service.sellMarket(2, amount + "", null, null, HuobiMain.SELL_MARKET);
            log.info("-----账户数据-----");
            log.info(account);
            log.info("-----实时行情数据-----");
            log.info(tickerLtc);
            log.info("-----卖出结果-----");
            log.info("sell:" + sellVal);
        }

    }
}

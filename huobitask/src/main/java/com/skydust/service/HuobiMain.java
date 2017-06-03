/*
 * Huobi.com Inc.
 *Copyright (c) 2014 火币天下网络技术有限公司. 
 *All Rights Reserved
 */
package com.skydust.service;

import com.alibaba.fastjson.JSON;
import com.skydust.bean.DepthLTC;
import com.skydust.bean.DetailLTC;
import com.skydust.bean.TickerLTC;
import com.skydust.util.UrlUtils;

/**
 * @author yanjg 2014年11月22日
 */
public class HuobiMain {
    public static String BUY = "buy";
    public static String BUY_MARKET = "buy_market";
    public static String CANCEL_ORDER = "cancel_order";
    public static String ACCOUNT_INFO = "get_account_info";
    public static String NEW_DEAL_ORDERS = "get_new_deal_orders";
    public static String ORDER_ID_BY_TRADE_ID = "get_order_id_by_trade_id";
    public static String GET_ORDERS = "get_orders";
    public static String ORDER_INFO = "order_info";
    public static String SELL = "sell";
    public static String SELL_MARKET = "sell_market";

    public static void main(String[] args) {
        HuobiService service = new HuobiService();
        try {
            // 提交限价单接口 1btc 2ltc
            System.out.println(service.buy(1, "2281.52", "0.001", null, null, BUY));
            // 提交市价单接口
            System.out.println(service.buyMarket(1, "2", null, null, BUY_MARKET));
            // 取消订单接口
            System.out.println(service.cancelOrder(1, 160801, CANCEL_ORDER));
            // 获取账号详情
            System.out.println(service.getAccountInfo(ACCOUNT_INFO));
            // 查询个人最新10条成交订单
            System.out.println(service.getNewDealOrders(1, NEW_DEAL_ORDERS));
            // 根据trade_id查询oder_id
            System.out.println(service.getOrderIdByTradeId(1, 2, ORDER_ID_BY_TRADE_ID));
            // 获取所有正在进行的委托
            System.out.println(service.getOrders(1, GET_ORDERS));
            // 获取订单详情
            System.out.println(service.getOrderInfo(1, 160802, ORDER_INFO));
            // 市价卖出
            System.out.println(service.sell(1, "2555.52", "0.1", null, null, SELL));
            // 市价卖出
            System.out.println(service.sellMarket(1, "2", null, null, SELL_MARKET));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void getRealData() {
        //买卖盘实时成交数据
        String detailLtc = UrlUtils.loadJson("http://api.huobi.com/staticmarket/detail_ltc_json.js");
        DetailLTC detailLTC = JSON.parseObject(detailLtc, DetailLTC.class);
        System.out.println("-----买卖盘实时成交数据-----");
        System.out.println(detailLTC);
        //实时行情数据
        String tickerLtc = UrlUtils.loadJson("http://api.huobi.com/staticmarket/ticker_ltc_json.js");
        TickerLTC tickerLTC = JSON.parseObject(tickerLtc, TickerLTC.class);
        System.out.println("-----实时行情数据-----");
        System.out.println(tickerLTC);
        //深度数据（价格和积累量）
        String DepthLtc = UrlUtils.loadJson("http://api.huobi.com/staticmarket/depth_ltc_100.js");
        DepthLTC depthLTC = JSON.parseObject(DepthLtc, DepthLTC.class);
        System.out.println("-----深度数据-----");
        System.out.println(depthLTC);
    }

}

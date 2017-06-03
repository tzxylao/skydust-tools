package com.skydust.bean;

import java.util.List;

/**
 * 深度数据 价格和积累量
 * Created by laoliangliang on 17/6/3.
 */
public class DepthLTC {
    //卖，价值，积累量
    private List<List<Double>> asks;

    //买，价格，积累量
    private List<List<Double>> bids;

    //类型
    private String symbol;

    public List<List<Double>> getAsks() {
        return asks;
    }

    public void setAsks(List<List<Double>> asks) {
        this.asks = asks;
    }

    public List<List<Double>> getBids() {
        return bids;
    }

    public void setBids(List<List<Double>> bids) {
        this.bids = bids;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "DepthLTC{" +
                "asks=" + asks +
                ", bids=" + bids +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}

package com.skydust.bean;

import java.util.List;

/**
 * 买卖盘实时成交数据
 * Created by laoliangliang on 17/6/3.
 */
public class DetailLTC {

    //总量（人民币）
    private Double total;

    //涨幅
    private Double level;

    //成交量
    private Double amount;

    //收盘价
    private Double p_last;

    //最低
    private Double p_low;

    //最高
    private Double p_high;

    //开盘
    private Double p_open;

    //最新
    private Double p_new;

    //类型
    private String symbol;

    //买5
    private List<SummaryPrice> top_buy;

    //卖5
    private List<SummaryPrice> top_sell;

    //卖10
    private List<SummaryPrice> sells;

    //买10
    private List<SummaryPrice> buys;

    //实时成交
    private List<TradeDetail> trades;

    private String amp;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getP_last() {
        return p_last;
    }

    public void setP_last(Double p_last) {
        this.p_last = p_last;
    }

    public Double getP_low() {
        return p_low;
    }

    public void setP_low(Double p_low) {
        this.p_low = p_low;
    }

    public Double getP_high() {
        return p_high;
    }

    public void setP_high(Double p_high) {
        this.p_high = p_high;
    }

    public Double getP_open() {
        return p_open;
    }

    public void setP_open(Double p_open) {
        this.p_open = p_open;
    }

    public Double getP_new() {
        return p_new;
    }

    public void setP_new(Double p_new) {
        this.p_new = p_new;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<SummaryPrice> getTop_buy() {
        return top_buy;
    }

    public void setTop_buy(List<SummaryPrice> top_buy) {
        this.top_buy = top_buy;
    }

    public List<SummaryPrice> getTop_sell() {
        return top_sell;
    }

    public void setTop_sell(List<SummaryPrice> top_sell) {
        this.top_sell = top_sell;
    }

    public List<SummaryPrice> getSells() {
        return sells;
    }

    public void setSells(List<SummaryPrice> sells) {
        this.sells = sells;
    }

    public List<SummaryPrice> getBuys() {
        return buys;
    }

    public void setBuys(List<SummaryPrice> buys) {
        this.buys = buys;
    }

    public List<TradeDetail> getTrades() {
        return trades;
    }

    public void setTrades(List<TradeDetail> trades) {
        this.trades = trades;
    }

    public String getAmp() {
        return amp;
    }

    public void setAmp(String amp) {
        this.amp = amp;
    }

    @Override
    public String toString() {
        return "DetailLTC{" +
                "total=" + total +
                ", level=" + level +
                ", amount=" + amount +
                ", p_last=" + p_last +
                ", p_low=" + p_low +
                ", p_high=" + p_high +
                ", p_open=" + p_open +
                ", p_new=" + p_new +
                ", symbol='" + symbol + '\'' +
                ", top_buy=" + top_buy +
                ", top_sell=" + top_sell +
                ", sells=" + sells +
                ", buys=" + buys +
                ", trades=" + trades +
                ", amp='" + amp + '\'' +
                '}';
    }
}

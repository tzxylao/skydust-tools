package com.skydust.bean;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class TickerDetail {
    private String symbol;

    private Double open;

    private Double last;

    private Double low;

    private Double high;

    private Double vol;

    private Double buy;

    private Double sell;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getVol() {
        return vol;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "TickerDetail{" +
                "symbol='" + symbol + '\'' +
                ", open=" + open +
                ", last=" + last +
                ", low=" + low +
                ", high=" + high +
                ", vol=" + vol +
                ", buy=" + buy +
                ", sell=" + sell +
                '}';
    }
}

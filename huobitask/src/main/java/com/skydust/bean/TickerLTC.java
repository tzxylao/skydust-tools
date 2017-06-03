package com.skydust.bean;

/**
 * 实时行情数据
 * Created by laoliangliang on 17/6/3.
 */
public class TickerLTC {
    private String time;

    private TickerDetail ticker;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TickerDetail getTicker() {
        return ticker;
    }

    public void setTicker(TickerDetail ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return "TickerLTC{" +
                "time='" + time + '\'' +
                ", ticker=" + ticker +
                '}';
    }
}

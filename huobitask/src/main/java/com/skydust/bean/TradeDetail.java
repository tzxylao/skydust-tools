package com.skydust.bean;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class TradeDetail {

    private String id;

    private Double price;

    private String time;

    private Double amount;

    private String direction;

    private String tradeId;

    private String ts;

    private String type;

    private String en_type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEn_type() {
        return en_type;
    }

    public void setEn_type(String en_type) {
        this.en_type = en_type;
    }

    @Override
    public String toString() {
        return "TradeDetail{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", time=" + time +
                ", amount=" + amount +
                ", direction='" + direction + '\'' +
                ", tradeId='" + tradeId + '\'' +
                ", ts='" + ts + '\'' +
                ", type='" + type + '\'' +
                ", en_type='" + en_type + '\'' +
                '}';
    }
}

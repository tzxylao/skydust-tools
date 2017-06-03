package com.skydust.bean;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class SummaryPrice {

    private Double price;

    private Double amount;

    private Integer level;

    private Double accu;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getAccu() {
        return accu;
    }

    public void setAccu(Double accu) {
        this.accu = accu;
    }

    @Override
    public String toString() {
        return "SummaryPrice{" +
                "price=" + price +
                ", amount=" + amount +
                ", level=" + level +
                ", accu=" + accu +
                '}';
    }
}

package com.skydust.bean;

/**
 * Created by laoliangliang on 17/6/3.
 */
public class AccountInfo {
    //可用金额
    private Double available_cny_display;

    //可用比特币
    private Double available_btc_display;

    //可用莱特币
    private Double available_ltc_display;

    //总金额
    private Double total;

    //净资产折合
    private Double net_asset;

    //冻结人民币金额
    private Double frozen_cny_display;

    //冻结btc份额
    private Double frozen_btc_display;

    //冻结ltc份额
    private Double frozen_ltc_display;

    //申请人民币数量
    private Double loan_cny_display;

    //申请莱特币数量
    private Double loan_ltc_display;

    //申请比特币数量
    private Double loan_btc_display;

    public Double getAvailable_cny_display() {
        return available_cny_display;
    }

    public void setAvailable_cny_display(Double available_cny_display) {
        this.available_cny_display = available_cny_display;
    }

    public Double getAvailable_btc_display() {
        return available_btc_display;
    }

    public void setAvailable_btc_display(Double available_btc_display) {
        this.available_btc_display = available_btc_display;
    }

    public Double getAvailable_ltc_display() {
        return available_ltc_display;
    }

    public void setAvailable_ltc_display(Double available_ltc_display) {
        this.available_ltc_display = available_ltc_display;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getNet_asset() {
        return net_asset;
    }

    public void setNet_asset(Double net_asset) {
        this.net_asset = net_asset;
    }

    public Double getFrozen_cny_display() {
        return frozen_cny_display;
    }

    public void setFrozen_cny_display(Double frozen_cny_display) {
        this.frozen_cny_display = frozen_cny_display;
    }

    public Double getFrozen_btc_display() {
        return frozen_btc_display;
    }

    public void setFrozen_btc_display(Double frozen_btc_display) {
        this.frozen_btc_display = frozen_btc_display;
    }

    public Double getFrozen_ltc_display() {
        return frozen_ltc_display;
    }

    public void setFrozen_ltc_display(Double frozen_ltc_display) {
        this.frozen_ltc_display = frozen_ltc_display;
    }

    public Double getLoan_cny_display() {
        return loan_cny_display;
    }

    public void setLoan_cny_display(Double loan_cny_display) {
        this.loan_cny_display = loan_cny_display;
    }

    public Double getLoan_ltc_display() {
        return loan_ltc_display;
    }

    public void setLoan_ltc_display(Double loan_ltc_display) {
        this.loan_ltc_display = loan_ltc_display;
    }

    public Double getLoan_btc_display() {
        return loan_btc_display;
    }

    public void setLoan_btc_display(Double loan_btc_display) {
        this.loan_btc_display = loan_btc_display;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "available_cny_display=" + available_cny_display +
                ", available_btc_display=" + available_btc_display +
                ", available_ltc_display=" + available_ltc_display +
                ", total=" + total +
                ", net_asset=" + net_asset +
                ", frozen_cny_display=" + frozen_cny_display +
                ", frozen_btc_display=" + frozen_btc_display +
                ", frozen_ltc_display=" + frozen_ltc_display +
                ", loan_cny_display=" + loan_cny_display +
                ", loan_ltc_display=" + loan_ltc_display +
                ", loan_btc_display=" + loan_btc_display +
                '}';
    }
}

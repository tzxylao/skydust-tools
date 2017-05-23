package com.skydust.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 到期债权复投Bean
 * Created by Chenxs on 2017/1/13.
 */

public class AssetsBuy {
    /**
     * 资产id
     */
    private String assets_id;
    /**
     * 债权id
     */
    private String debt_id;
    /**
     * 用户id
     */
    private String user_id;
    /**
     * 产品id
     */
    private String prod_id;
    /**
     * 账户id
     */
    private String acc_id;
    /**
     * 金额：本金+利息
     */
    private BigDecimal amount;
    /**
     * 是否复投
     */
    private Integer is_reinvest;

    /**
     * 标的ID
     */
    private String subject_id;

    /**
     * 放款时间
     */
    private Date loan_time;

    /**
     * 债权期限（天）
     */
    private Integer debt_term;

    /**
     * 债权状态ID
     1：可募集
     2：募集中
     3：已放款
     4：已流标
     5：募集不满放款
     6：还款完成
     7：待放款
     */
    private Integer debt_status_id;

    public Date getLoan_time() {
        return loan_time;
    }

    public AssetsBuy setLoan_time(Date loan_time) {
        this.loan_time = loan_time;
        return this;
    }

    public Integer getDebt_term() {
        return debt_term;
    }

    public AssetsBuy setDebt_term(Integer debt_term) {
        this.debt_term = debt_term;
        return this;
    }

    public Integer getIs_reinvest() {
        return is_reinvest;
    }

    public AssetsBuy setIs_reinvest(Integer is_reinvest) {
        this.is_reinvest = is_reinvest;
        return this;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public AssetsBuy setSubject_id(String subject_id) {
        this.subject_id = subject_id;
        return this;
    }

    public String getAssets_id() {
        return assets_id;
    }

    public AssetsBuy setAssets_id(String assets_id) {
        this.assets_id = assets_id;
        return this;
    }

    public String getDebt_id() {
        return debt_id;
    }

    public AssetsBuy setDebt_id(String debt_id) {
        this.debt_id = debt_id;
        return this;
    }

    public String getUser_id() {
        return user_id;
    }

    public AssetsBuy setUser_id(String user_id) {
        this.user_id = user_id;
        return this;
    }

    public String getProd_id() {
        return prod_id;
    }

    public AssetsBuy setProd_id(String prod_id) {
        this.prod_id = prod_id;
        return this;
    }

    public String getAcc_id() {
        return acc_id;
    }

    public AssetsBuy setAcc_id(String acc_id) {
        this.acc_id = acc_id;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public AssetsBuy setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return "AssetsBuy{" +
                "assets_id='" + assets_id + '\'' +
                ", debt_id='" + debt_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", prod_id='" + prod_id + '\'' +
                ", acc_id='" + acc_id + '\'' +
                ", amount=" + amount +
                ", is_reinvest=" + is_reinvest +
                ", subject_id='" + subject_id + '\'' +
                ", loan_time=" + loan_time +
                ", debt_term=" + debt_term +
                ", debt_status_id=" + debt_status_id +
                '}';
    }
}

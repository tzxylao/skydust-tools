package com.skydust.bean;

import java.math.BigDecimal;

/**
 * Created by dhlzj on 2017/4/21.
 */
public class AssetsVO extends PageVO {

    /**
     * 用户ID
     */
    private String user_id;

    /**
     * 产品ID
     */
    private String prod_id;

    /**
     * 产品大类
     */
    private Integer prod_type;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 资产ID
     */
    private String assets_id;

    /**
     * 账户ID
     */
    private String acc_id;

    /**
     * 是否复投
     */
    private Integer is_reinvest;

    /**
     * 订单id
     */
    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public AssetsVO setOrder_id(String order_id) {
        this.order_id = order_id;
        return this;
    }

    public Integer getIs_reinvest() {
        return is_reinvest;
    }

    public void setIs_reinvest(Integer is_reinvest) {
        this.is_reinvest = is_reinvest;
    }

    public String getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(String acc_id) {
        this.acc_id = acc_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProd_id() {
        return prod_id;
    }

    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getProd_type() {
        return prod_type;
    }

    public void setProd_type(Integer prod_type) {
        this.prod_type = prod_type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAssets_id() {
        return assets_id;
    }

    public void setAssets_id(String assets_id) {
        this.assets_id = assets_id;
    }

    @Override
    public String toString() {
        return "AssetsVO{" +
                "user_id='" + user_id + '\'' +
                ", prod_id='" + prod_id + '\'' +
                ", prod_type=" + prod_type +
                ", amount=" + amount +
                ", assets_id='" + assets_id + '\'' +
                ", acc_id='" + acc_id + '\'' +
                ", is_reinvest=" + is_reinvest +
                ", order_id='" + order_id + '\'' +
                '}';
    }

    public String getExistNullStr() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.order_id == null) {
            stringBuffer.append("order_id is null;");
        }
        if (this.user_id == null) {
            stringBuffer.append("user_id is null;");
        }
        if (this.prod_id == null) {
            stringBuffer.append("prod_id is null;");
        }
        if (this.amount == null) {
            stringBuffer.append("amount is null;");
        }
        if (this.acc_id == null) {
            stringBuffer.append("acc_id is null;");
        }
        return stringBuffer.toString();
    }
}

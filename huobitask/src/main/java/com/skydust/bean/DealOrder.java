package com.skydust.bean;

/**
 * 交易订单
 * Created by laoliangliang on 17/6/4.
 */
public class DealOrder {


    /**
     * id : 557738166
     * type : 3
     * order_price : 0.00
     * order_amount : 229.2000
     * processed_amount : 229.1849
     * last_processed_time : 1496485942
     * order_time : 1496485942
     * status : 2
     */

    private Integer id;
    private Integer type;
    private Double order_price;
    private Double order_amount;
    private Double processed_amount;
    private Integer last_processed_time;
    private Integer order_time;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }

    public Double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Double order_amount) {
        this.order_amount = order_amount;
    }

    public Double getProcessed_amount() {
        return processed_amount;
    }

    public void setProcessed_amount(Double processed_amount) {
        this.processed_amount = processed_amount;
    }

    public Integer getLast_processed_time() {
        return last_processed_time;
    }

    public void setLast_processed_time(Integer last_processed_time) {
        this.last_processed_time = last_processed_time;
    }

    public Integer getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Integer order_time) {
        this.order_time = order_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DealOrder{" +
                "id=" + id +
                ", type=" + type +
                ", order_price=" + order_price +
                ", order_amount=" + order_amount +
                ", processed_amount=" + processed_amount +
                ", last_processed_time=" + last_processed_time +
                ", order_time=" + order_time +
                ", status=" + status +
                '}';
    }
}

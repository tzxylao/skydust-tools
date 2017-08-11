package com.skydust.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 到期债权复投Bean
 * Created by Chenxs on 2017/1/13.
 */
@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
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
     * 1：可募集
     * 2：募集中
     * 3：已放款
     * 4：已流标
     * 5：募集不满放款
     * 6：还款完成
     * 7：待放款
     */
    private Integer debt_status_id;

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

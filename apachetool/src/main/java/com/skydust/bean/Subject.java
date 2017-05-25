package com.skydust.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * simplexwork mysql tools generate.
 * 标的信息表
 *
 * @author sjk
 * @date 	2017-01-13
 * @tags
 */
public class Subject {
	/**
	 * 标的ID
	 */
	private String subject_id;


	/**
	 * 产品ID
	 */
	private String product_id;
	
		
	/**
	 * 债权ID
	 */
	private String debt_id;
	
		
	/**
	 * 开始募集时间
	 */
	private Timestamp raise_time_start;
	
		
	/**
	 * 份额更新ID
	 */
	private Integer share_update_id;
	
		
	/**
	 * 募集周期
	 */
	private Integer raise_term;
	
		
	/**
	 * 募集总金额
	 */
	private BigDecimal raise_amount;
	
		
	/**
	 * 剩余募集金额
	 */
	private BigDecimal raise_surplus_amount;
	
		
	/**
	 * 发标人
	 */
	private String user_id;
	
		
	/**
	 * 是否虚拟;0--非虚拟；1--虚拟；
	 */
	private Integer is_virtual;
	
		
	/**
	 * 标的状态id
	 */
	private Integer subject_status_id;
	
		
	/**
	 * 审核状态【0审核通过；1待审核；2审核不通过；】
	 */
	private Integer auditing_status;
	
		
	/**
	 * 创建时间
	 */
	private String create_time;
	
		
	/**
	 * 更新时间
	 */
	private String update_time;
	
		
	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * inset into 操作时返回的主键id
	 */
	private String increment_id;

	/**
	 * 转让中债权对应标的0-否 1-是
	 */
	private Integer transfer_flag;

	/**
	 * 债权结算表对应标的对应转让金额
	 */
	private BigDecimal transfer_capital_value;

    /**
     * 资产ID
     */
    private String assets_id;

    public String getAssets_id() {
        return assets_id;
    }

    public Subject setAssets_id(String assets_id) {
        this.assets_id = assets_id;
        return this;
    }

    public BigDecimal getTransfer_capital_value() {
		return transfer_capital_value;
	}

	public Subject setTransfer_capital_value(BigDecimal transfer_capital_value) {
		this.transfer_capital_value = transfer_capital_value;
		return this;
	}

	public Integer getTransfer_flag() {
		return transfer_flag;
	}

	public Subject setTransfer_flag(Integer transfer_flag) {
		this.transfer_flag = transfer_flag;
		return this;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public Subject setSubject_id(String subject_id) {
		this.subject_id = subject_id;
		return this;
	}

	public String getProduct_id() {
		return product_id;
	}

	public Subject setProduct_id(String product_id) {
		this.product_id = product_id;
		return this;
	}

	public String getDebt_id() {
		return debt_id;
	}

	public Subject setDebt_id(String debt_id) {
		this.debt_id = debt_id;
		return this;
	}

	public Timestamp getRaise_time_start() {
		return raise_time_start;
	}

	public Subject setRaise_time_start(Timestamp raise_time_start) {
		this.raise_time_start = raise_time_start;
		return this;
	}

	public Integer getShare_update_id() {
		return share_update_id;
	}

	public Subject setShare_update_id(Integer share_update_id) {
		this.share_update_id = share_update_id;
		return this;
	}

	public Integer getRaise_term() {
		return raise_term;
	}

	public Subject setRaise_term(Integer raise_term) {
		this.raise_term = raise_term;
		return this;
	}

	public BigDecimal getRaise_amount() {
		return raise_amount;
	}

	public Subject setRaise_amount(BigDecimal raise_amount) {
		this.raise_amount = raise_amount;
		return this;
	}

	public BigDecimal getRaise_surplus_amount() {
		return raise_surplus_amount;
	}

	public Subject setRaise_surplus_amount(BigDecimal raise_surplus_amount) {
		this.raise_surplus_amount = raise_surplus_amount;
		return this;
	}

	public String getUser_id() {
		return user_id;
	}

	public Subject setUser_id(String user_id) {
		this.user_id = user_id;
		return this;
	}

	public Integer getIs_virtual() {
		return is_virtual;
	}

	public Subject setIs_virtual(Integer is_virtual) {
		this.is_virtual = is_virtual;
		return this;
	}

	public Integer getSubject_status_id() {
		return subject_status_id;
	}

	public Subject setSubject_status_id(Integer subject_status_id) {
		this.subject_status_id = subject_status_id;
		return this;
	}

	public Integer getAuditing_status() {
		return auditing_status;
	}

	public Subject setAuditing_status(Integer auditing_status) {
		this.auditing_status = auditing_status;
		return this;
	}

	public String getCreate_time() {
		return create_time;
	}

	public Subject setCreate_time(String create_time) {
		this.create_time = create_time;
		return this;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public Subject setUpdate_time(String update_time) {
		this.update_time = update_time;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Subject setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getIncrement_id() {
		return increment_id;
	}

	public Subject setIncrement_id(String increment_id) {
		this.increment_id = increment_id;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Subject subject = (Subject) o;

		return subject_id.equals(subject.subject_id);

	}

	@Override
	public int hashCode() {
		return subject_id.hashCode();
	}

	@Override
	public String toString() {
		return "Subject{" +
				"subject_id='" + subject_id + '\'' +
				", product_id='" + product_id + '\'' +
				", debt_id='" + debt_id + '\'' +
				", raise_time_start=" + raise_time_start +
				", share_update_id=" + share_update_id +
				", raise_term=" + raise_term +
				", raise_amount=" + raise_amount +
				", raise_surplus_amount=" + raise_surplus_amount +
				", user_id='" + user_id + '\'' +
				", is_virtual=" + is_virtual +
				", subject_status_id=" + subject_status_id +
				", auditing_status=" + auditing_status +
				", create_time='" + create_time + '\'' +
				", update_time='" + update_time + '\'' +
				", status=" + status +
				", increment_id='" + increment_id + '\'' +
				", transfer_flag=" + transfer_flag +
				", transfer_capital_value=" + transfer_capital_value +
				", assets_id='" + assets_id + '\'' +
				'}';
	}
}

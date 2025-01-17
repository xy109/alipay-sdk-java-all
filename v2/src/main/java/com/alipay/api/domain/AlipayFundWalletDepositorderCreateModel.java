package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户充值创建订单
 *
 * @author auto create
 * @since 1.0, 2022-12-16 21:33:49
 */
public class AlipayFundWalletDepositorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6197132171861935874L;

	/**
	 * 充值的本金金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 膨胀金的生效开始日期
	 */
	@ApiField("effective_end_date")
	private String effectiveEndDate;

	/**
	 * 充值的膨胀金额
	 */
	@ApiField("expand_amount")
	private String expandAmount;

	/**
	 * 标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息，包括收款方id、收款方type、扩展信息
	 */
	@ApiField("payee_info")
	private ParticipantForm payeeInfo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单 有效期
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/**
	 * 膨胀金的生效结束日期
	 */
	@ApiField("valid_date")
	private String validDate;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public String getExpandAmount() {
		return this.expandAmount;
	}
	public void setExpandAmount(String expandAmount) {
		this.expandAmount = expandAmount;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ParticipantForm getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(ParticipantForm payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

	public String getValidDate() {
		return this.validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}

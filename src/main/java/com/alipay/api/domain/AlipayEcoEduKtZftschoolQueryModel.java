package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费直付通进件结果查询接口
 *
 * @author auto create
 * @since 1.0, 2022-02-22 15:35:30
 */
public class AlipayEcoEduKtZftschoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5889896532164691545L;

	/**
	 * 进件单号id，进件接口返回
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * ISV的支付宝唯一标识PID
	 */
	@ApiField("partner_pid")
	private String partnerPid;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerPid() {
		return this.partnerPid;
	}
	public void setPartnerPid(String partnerPid) {
		this.partnerPid = partnerPid;
	}

}

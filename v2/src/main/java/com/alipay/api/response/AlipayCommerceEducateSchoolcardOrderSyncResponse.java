package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolcard.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 17:51:40
 */
public class AlipayCommerceEducateSchoolcardOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4777691332389524691L;

	/** 
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}

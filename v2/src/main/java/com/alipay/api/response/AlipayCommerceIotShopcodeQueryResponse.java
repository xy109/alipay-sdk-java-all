package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.shopcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:08:46
 */
public class AlipayCommerceIotShopcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4139768889167482715L;

	/** 
	 * 投放状态，已投放（on），未投放（off）
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

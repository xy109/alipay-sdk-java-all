package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtestabc.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:38:45
 */
public class AlipayOpenAppXwbtestabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8657391625828995813L;

	/** 
	 * 1
	 */
	@ApiField("xw")
	private String xw;

	public void setXw(String xw) {
		this.xw = xw;
	}
	public String getXw( ) {
		return this.xw;
	}

}

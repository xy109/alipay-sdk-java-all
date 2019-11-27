package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-25 13:55:46
 */
public class AlipayCommerceIotAdvertiserAdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2142595694336827349L;

	/** 
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.practice.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:20:56
 */
public class KoubeiCateringPosPracticeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5613669659784452142L;

	/** 
	 * 做法id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}

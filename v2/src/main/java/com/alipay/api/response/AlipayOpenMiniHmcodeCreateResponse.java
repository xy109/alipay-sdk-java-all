package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.hmcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:45:08
 */
public class AlipayOpenMiniHmcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1822149612926421673L;

	/** 
	 * 异形码图片链接地址
	 */
	@ApiField("hm_code_url")
	private String hmCodeUrl;

	public void setHmCodeUrl(String hmCodeUrl) {
		this.hmCodeUrl = hmCodeUrl;
	}
	public String getHmCodeUrl( ) {
		return this.hmCodeUrl;
	}

}

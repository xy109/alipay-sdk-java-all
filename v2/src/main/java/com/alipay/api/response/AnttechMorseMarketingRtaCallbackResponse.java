package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.callback response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:41:42
 */
public class AnttechMorseMarketingRtaCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 1428635493641573936L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}

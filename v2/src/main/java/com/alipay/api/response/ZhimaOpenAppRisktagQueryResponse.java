package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.risktag.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 00:24:36
 */
public class ZhimaOpenAppRisktagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1477825196951569144L;

	/** 
	 * 响应参数
	 */
	@ApiField("resp")
	private String resp;

	public void setResp(String resp) {
		this.resp = resp;
	}
	public String getResp( ) {
		return this.resp;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeselect.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:21:38
 */
public class AlipayDigitalopUcdpApeselectSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2286626667269952673L;

	/** 
	 * 请求链路标识，用于排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

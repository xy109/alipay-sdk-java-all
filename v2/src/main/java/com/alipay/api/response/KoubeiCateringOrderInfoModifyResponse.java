package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:36:54
 */
public class KoubeiCateringOrderInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1537716968283167414L;

	/** 
	 * 是否需要重试,true-需要重试 ,false-不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}

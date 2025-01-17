package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.wufufuka.aliyun.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:55:51
 */
public class AlipayUserWufufukaAliyunRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6833248191593253823L;

	/** 
	 * 是否需要重试，请求失败情况下，阿里云基于该字段判断该请求是否需要重试
	 */
	@ApiField("retry_flag")
	private Boolean retryFlag;

	public void setRetryFlag(Boolean retryFlag) {
		this.retryFlag = retryFlag;
	}
	public Boolean getRetryFlag( ) {
		return this.retryFlag;
	}

}

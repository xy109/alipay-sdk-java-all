package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.codedeposit response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-04 11:33:38
 */
public class AlipayMarketingActivityOrdervoucherCodedepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 8614725551445335968L;

	/** 
	 * 导入失败的券码数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 导入成功的券码数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}

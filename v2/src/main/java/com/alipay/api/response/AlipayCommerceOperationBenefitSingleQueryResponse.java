package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityBenefit;
import com.alipay.api.domain.PrivilegeBenefit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.benefit.single.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:15:41
 */
public class AlipayCommerceOperationBenefitSingleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6265978946552976454L;

	/** 
	 * 支付宝内券活动对象
	 */
	@ApiField("activity_benefit")
	private ActivityBenefit activityBenefit;

	/** 
	 * 会员权益
	 */
	@ApiField("privilege_benefit")
	private PrivilegeBenefit privilegeBenefit;

	public void setActivityBenefit(ActivityBenefit activityBenefit) {
		this.activityBenefit = activityBenefit;
	}
	public ActivityBenefit getActivityBenefit( ) {
		return this.activityBenefit;
	}

	public void setPrivilegeBenefit(PrivilegeBenefit privilegeBenefit) {
		this.privilegeBenefit = privilegeBenefit;
	}
	public PrivilegeBenefit getPrivilegeBenefit( ) {
		return this.privilegeBenefit;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-28 11:31:17
 */
public class MybankCreditLoanapplyFinleaseConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7879255996272684246L;

	/** 
	 * 是否准入，true表示准则，false表示不准入
	 */
	@ApiField("admit")
	private Boolean admit;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

}

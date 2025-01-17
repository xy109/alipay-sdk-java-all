package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountWf;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.limitamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:41:31
 */
public class MybankCreditSupplychainWfLimitamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7568195145421473838L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 盖帽额度
	 */
	@ApiField("limitamt")
	private AmountWf limitamt;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setLimitamt(AmountWf limitamt) {
		this.limitamt = limitamt;
	}
	public AmountWf getLimitamt( ) {
		return this.limitamt;
	}

}

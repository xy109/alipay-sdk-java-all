package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.issuebatch.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-04 19:37:45
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8415873896991248184L;

	/** 
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
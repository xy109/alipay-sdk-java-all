package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.issuebatch.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:41:41
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8131424821942283347L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.invoice.syncdata.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-07 10:49:09
 */
public class AlipayFundTransInvoiceSyncdataModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5659882324894484719L;

	/** 
	 * 票据详情页url
	 */
	@ApiField("invoice_url")
	private String invoiceUrl;

	public void setInvoiceUrl(String invoiceUrl) {
		this.invoiceUrl = invoiceUrl;
	}
	public String getInvoiceUrl( ) {
		return this.invoiceUrl;
	}

}

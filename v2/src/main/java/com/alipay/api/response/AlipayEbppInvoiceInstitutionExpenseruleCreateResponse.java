package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.institution.expenserule.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:51:39
 */
public class AlipayEbppInvoiceInstitutionExpenseruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5277386329669537684L;

	/** 
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}
	public String getStandardId( ) {
		return this.standardId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.saleleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:54:35
 */
public class KoubeiSalesLeadsSaleleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4237397317387464969L;

	/** 
	 * 生成的销售LeadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}

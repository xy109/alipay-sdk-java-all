package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-23 10:06:50
 */
public class AlipayEbppInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3133781165964238257L;

	/** 
	 * 支付宝返回的发票申请id,该id具有唯一性
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}

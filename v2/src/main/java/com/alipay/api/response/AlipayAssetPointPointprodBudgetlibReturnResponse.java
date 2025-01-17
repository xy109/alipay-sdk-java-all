package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.return response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:46:13
 */
public class AlipayAssetPointPointprodBudgetlibReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 6863194956555142194L;

	/** 
	 * 预算库回收失败时的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}

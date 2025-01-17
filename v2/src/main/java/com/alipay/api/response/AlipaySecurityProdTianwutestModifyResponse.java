package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.tianwutest.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:31:43
 */
public class AlipaySecurityProdTianwutestModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1456659212834911181L;

	/** 
	 * 测试
	 */
	@ApiField("ceshi")
	private String ceshi;

	public void setCeshi(String ceshi) {
		this.ceshi = ceshi;
	}
	public String getCeshi( ) {
		return this.ceshi;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.automat.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:42:46
 */
public class AntMerchantExpandAutomatApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5467165719326456168L;

	/** 
	 * 支付宝设备ID
	 */
	@ApiField("alipay_terminal_id")
	private String alipayTerminalId;

	public void setAlipayTerminalId(String alipayTerminalId) {
		this.alipayTerminalId = alipayTerminalId;
	}
	public String getAlipayTerminalId( ) {
		return this.alipayTerminalId;
	}

}

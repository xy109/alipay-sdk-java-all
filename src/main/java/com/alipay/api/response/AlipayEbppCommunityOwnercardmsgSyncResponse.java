package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercardmsg.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-05 17:00:46
 */
public class AlipayEbppCommunityOwnercardmsgSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6729262315547239171L;

	/** 
	 * 支付宝消息id
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}

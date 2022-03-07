package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.cs.cssocial.yqmessage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayBossCsCssocialYqmessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8292721288419736522L;

	/** 
	 * 返回的舆情数据结果字符串。舆情数据及信息存放在JSON字符串中，如舆情的标题（title）、内容（content）等
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}

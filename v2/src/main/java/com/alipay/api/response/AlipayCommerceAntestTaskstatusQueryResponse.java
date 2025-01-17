package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.taskstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:53:15
 */
public class AlipayCommerceAntestTaskstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2421477781359853693L;

	/** 
	 * 任务状态： INIT 已创建，EXECUTING 执行中，FINISH 已完成，CANCEL 已取消
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

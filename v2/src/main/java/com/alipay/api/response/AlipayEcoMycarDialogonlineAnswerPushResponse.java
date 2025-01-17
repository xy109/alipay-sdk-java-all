package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dialogonline.answer.push response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:10:45
 */
public class AlipayEcoMycarDialogonlineAnswerPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 1231677732239749484L;

	/** 
	 * 技师ID，支付宝对技师的唯一标识
	 */
	@ApiField("answer_id")
	private String answerId;

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerId( ) {
		return this.answerId;
	}

}

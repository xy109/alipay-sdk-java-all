package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.verificationcode.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 08:51:00
 */
public class AnttechOceanbaseVerificationcodeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5263217488223442491L;

	/** 
	 * 验证码类型枚举：MESSAGE_CODE短信验证码；EMAIL_CODE邮件验证码。
	 */
	@ApiField("type")
	private String type;

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}

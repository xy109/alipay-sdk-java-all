package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deductagreement.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-20 12:11:24
 */
public class AlipayEbppInstserviceDeductagreementModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2458556686988149839L;

	/** 
	 * true代表受理成功
false代表受理失败
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 返回结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.modelversion.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:42:56
 */
public class AnttechAiCvTfjsModelversionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8685492126423534143L;

	/** 
	 * jsonString，不涉及商户敏感信息
	 */
	@ApiField("model_version")
	private String modelVersion;

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelVersion( ) {
		return this.modelVersion;
	}

}

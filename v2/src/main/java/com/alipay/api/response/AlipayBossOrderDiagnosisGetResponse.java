package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiagnosisInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.order.diagnosis.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:11:23
 */
public class AlipayBossOrderDiagnosisGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4313343444351416145L;

	/** 
	 * 诊断模型
	 */
	@ApiListField("diagnosis_result")
	@ApiField("diagnosis_info")
	private List<DiagnosisInfo> diagnosisResult;

	public void setDiagnosisResult(List<DiagnosisInfo> diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}
	public List<DiagnosisInfo> getDiagnosisResult( ) {
		return this.diagnosisResult;
	}

}

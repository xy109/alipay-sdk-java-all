package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:21:02
 */
public class AlipayBossContractManagementIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1313928852636739262L;

	/** 
	 * 识别结果
	 */
	@ApiField("result_set")
	private InterTradeConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}

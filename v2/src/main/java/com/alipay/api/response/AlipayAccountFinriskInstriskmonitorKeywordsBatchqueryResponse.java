package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.instriskmonitor.keywords.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:47:59
 */
public class AlipayAccountFinriskInstriskmonitorKeywordsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4111197572344531291L;

	/** 
	 * 返回机构关键词相关信息
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

}

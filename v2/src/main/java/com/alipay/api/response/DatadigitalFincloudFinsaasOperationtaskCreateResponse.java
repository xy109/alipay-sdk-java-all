package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.operationtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:55:00
 */
public class DatadigitalFincloudFinsaasOperationtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123663877526523454L;

	/** 
	 * operation_task_id + 运营任务创建 + 数据库
	 */
	@ApiField("operation_task_id")
	private String operationTaskId;

	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}
	public String getOperationTaskId( ) {
		return this.operationTaskId;
	}

}

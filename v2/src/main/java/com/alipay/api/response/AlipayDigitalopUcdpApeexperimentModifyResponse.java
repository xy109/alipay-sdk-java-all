package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeexperiment.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:45:13
 */
public class AlipayDigitalopUcdpApeexperimentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5635737414994811632L;

	/** 
	 * 操作任务Id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}

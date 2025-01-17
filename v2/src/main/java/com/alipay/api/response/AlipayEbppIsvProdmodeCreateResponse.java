package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.isv.prodmode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:13:10
 */
public class AlipayEbppIsvProdmodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4631449953973988954L;

	/** 
	 * 流程实例ID
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 创建产品模型成功后返回任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}

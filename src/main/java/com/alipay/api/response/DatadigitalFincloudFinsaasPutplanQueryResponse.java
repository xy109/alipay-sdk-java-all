package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChannelPutPlanDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-27 14:51:46
 */
public class DatadigitalFincloudFinsaasPutplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5374371336955612318L;

	/** 
	 * 投放计划详情对象
	 */
	@ApiField("detail")
	private ChannelPutPlanDetailDTO detail;

	public void setDetail(ChannelPutPlanDetailDTO detail) {
		this.detail = detail;
	}
	public ChannelPutPlanDetailDTO getDetail( ) {
		return this.detail;
	}

}

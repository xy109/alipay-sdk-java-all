package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BPaaSServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.bpaas.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:49:49
 */
public class AlipayOpenBpaasServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8584861872254394353L;

	/** 
	 * 服务列表
	 */
	@ApiListField("service_list")
	@ApiField("b_paa_s_service_info")
	private List<BPaaSServiceInfo> serviceList;

	public void setServiceList(List<BPaaSServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}
	public List<BPaaSServiceInfo> getServiceList( ) {
		return this.serviceList;
	}

}

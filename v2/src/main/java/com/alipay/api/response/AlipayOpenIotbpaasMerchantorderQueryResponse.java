package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IoTBPaaSMerchantOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.merchantorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:19:10
 */
public class AlipayOpenIotbpaasMerchantorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1868494326873259692L;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_list")
	@ApiField("io_t_b_paa_s_merchant_order_info")
	private List<IoTBPaaSMerchantOrderInfo> orderList;

	public void setOrderList(List<IoTBPaaSMerchantOrderInfo> orderList) {
		this.orderList = orderList;
	}
	public List<IoTBPaaSMerchantOrderInfo> getOrderList( ) {
		return this.orderList;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.item.external.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:37:59
 */
public class AlipayBusinessItemExternalSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7675518635989884632L;

	/** 
	 * 支付宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 入参中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}

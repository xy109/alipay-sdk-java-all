package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetdelivery.assign.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:44:47
 */
public class AntMerchantExpandAssetdeliveryAssignSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8173213927868743823L;

	/** 
	 * 配送指令反馈处理结果.
	 */
	@ApiListField("delivery_results")
	@ApiField("asset_result")
	private List<AssetResult> deliveryResults;

	public void setDeliveryResults(List<AssetResult> deliveryResults) {
		this.deliveryResults = deliveryResults;
	}
	public List<AssetResult> getDeliveryResults( ) {
		return this.deliveryResults;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 14:19:37
 */
public class AntMerchantExpandAssetinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1854573327382842527L;

	/** 
	 * 物料信息反馈处理结果
	 */
	@ApiListField("info_results")
	@ApiField("asset_result")
	private List<AssetResult> infoResults;

	public void setInfoResults(List<AssetResult> infoResults) {
		this.infoResults = infoResults;
	}
	public List<AssetResult> getInfoResults( ) {
		return this.infoResults;
	}

}

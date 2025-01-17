package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsSellerActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.seller.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:44:40
 */
public class AlipayInsSceneSellerActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7649643397314252726L;

	/** 
	 * 关于签约查询结果的告知
	 */
	@ApiField("ins_seller_activity")
	private InsSellerActivity insSellerActivity;

	public void setInsSellerActivity(InsSellerActivity insSellerActivity) {
		this.insSellerActivity = insSellerActivity;
	}
	public InsSellerActivity getInsSellerActivity( ) {
		return this.insSellerActivity;
	}

}

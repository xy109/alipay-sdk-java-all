package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:06:42
 */
public class AlipayCommerceEducateSceneUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3328155254687142981L;

	/** 
	 * 校园一脸通行开通状态。OPEN：开通，CLOSE：关闭
	 */
	@ApiField("open_status")
	private String openStatus;

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}
	public String getOpenStatus( ) {
		return this.openStatus;
	}

}

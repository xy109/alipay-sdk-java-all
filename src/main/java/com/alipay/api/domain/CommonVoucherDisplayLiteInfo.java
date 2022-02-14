package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示摘要信息
 *
 * @author auto create
 * @since 1.0, 2021-11-22 14:08:50
 */
public class CommonVoucherDisplayLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 1282374845731333241L;

	/**
	 * 商户品牌logo链接
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示
	 */
	@ApiField("brand_name")
	private String brandName;

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}

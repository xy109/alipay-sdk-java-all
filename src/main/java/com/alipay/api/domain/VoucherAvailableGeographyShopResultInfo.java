package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店结果
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:01:34
 */
public class VoucherAvailableGeographyShopResultInfo extends AlipayObject {

	private static final long serialVersionUID = 8322162177225598145L;

	/**
	 * 全部门店结果
	 */
	@ApiField("available_geography_all_shop_result_info")
	private VoucherAvailableGeographyAllShopResultInfo availableGeographyAllShopResultInfo;

	/**
	 * 失败的物理门店详情
	 */
	@ApiListField("fail_available_real_shop_infos")
	@ApiField("voucher_fail_shop_info")
	private List<VoucherFailShopInfo> failAvailableRealShopInfos;

	/**
	 * 失败的可用门店
	 */
	@ApiListField("fail_available_shop_infos")
	@ApiField("voucher_fail_shop_info")
	private List<VoucherFailShopInfo> failAvailableShopInfos;

	/**
	 * 代运营商业关系门店列表，列表中的门店id是调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id 接口参数是列表类型。 限制： 1、real_shop_ids中的门店id必须是代运营商业关系门店id。 2、real_shop_ids如果包含重复的门店id会自动进行去重操作。3、shop_ids、real_shop_ids、order_voucher_merchant_all_shop必须三选一
	 */
	@ApiListField("success_available_real_shop_ids")
	@ApiField("string")
	private List<String> successAvailableRealShopIds;

	/**
	 * 券可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。 限制： 1、shop_ids中的门店id必须是支付宝门店id。 2、shop_ids如果包含重复的门店id会自动进行去重操作。 3、shop_ids、real_shop_ids、order_voucher_merchant_all_shop必须三选一
	 */
	@ApiListField("success_available_shop_ids")
	@ApiField("string")
	private List<String> successAvailableShopIds;

	public VoucherAvailableGeographyAllShopResultInfo getAvailableGeographyAllShopResultInfo() {
		return this.availableGeographyAllShopResultInfo;
	}
	public void setAvailableGeographyAllShopResultInfo(VoucherAvailableGeographyAllShopResultInfo availableGeographyAllShopResultInfo) {
		this.availableGeographyAllShopResultInfo = availableGeographyAllShopResultInfo;
	}

	public List<VoucherFailShopInfo> getFailAvailableRealShopInfos() {
		return this.failAvailableRealShopInfos;
	}
	public void setFailAvailableRealShopInfos(List<VoucherFailShopInfo> failAvailableRealShopInfos) {
		this.failAvailableRealShopInfos = failAvailableRealShopInfos;
	}

	public List<VoucherFailShopInfo> getFailAvailableShopInfos() {
		return this.failAvailableShopInfos;
	}
	public void setFailAvailableShopInfos(List<VoucherFailShopInfo> failAvailableShopInfos) {
		this.failAvailableShopInfos = failAvailableShopInfos;
	}

	public List<String> getSuccessAvailableRealShopIds() {
		return this.successAvailableRealShopIds;
	}
	public void setSuccessAvailableRealShopIds(List<String> successAvailableRealShopIds) {
		this.successAvailableRealShopIds = successAvailableRealShopIds;
	}

	public List<String> getSuccessAvailableShopIds() {
		return this.successAvailableShopIds;
	}
	public void setSuccessAvailableShopIds(List<String> successAvailableShopIds) {
		this.successAvailableShopIds = successAvailableShopIds;
	}

}
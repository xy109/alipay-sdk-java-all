package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停止投放
 *
 * @author auto create
 * @since 1.0, 2022-02-09 15:02:56
 */
public class AlipayMarketingActivityDeliveryStopModel extends AlipayObject {

	private static final long serialVersionUID = 4331184535488352781L;

	/**
	 * 当前服务商停止投放的商户信息。
商户自研模式，则该对象可以不填写。
服务商自研模式，则对象中的bussinessType设置为ISV，默认使用当前操作人的信息作为商户信息；
服务商代运营模式，则对象中的bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * [已废弃]
待停止的投放配置列表。
最大数量限制20个。
	 */
	@ApiListField("delivery_config_list")
	@ApiField("delivery_config")
	private List<DeliveryConfig> deliveryConfigList;

	/**
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public List<DeliveryConfig> getDeliveryConfigList() {
		return this.deliveryConfigList;
	}
	public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
		this.deliveryConfigList = deliveryConfigList;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}

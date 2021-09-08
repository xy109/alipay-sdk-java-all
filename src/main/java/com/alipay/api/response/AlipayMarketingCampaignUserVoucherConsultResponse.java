package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityConsultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.user.voucher.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-12 10:04:34
 */
public class AlipayMarketingCampaignUserVoucherConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2416543646246944516L;

	/** 
	 * 活动券领取咨询结果列表
	 */
	@ApiListField("activity_consult_list")
	@ApiField("activity_consult_info")
	private List<ActivityConsultInfo> activityConsultList;

	public void setActivityConsultList(List<ActivityConsultInfo> activityConsultList) {
		this.activityConsultList = activityConsultList;
	}
	public List<ActivityConsultInfo> getActivityConsultList( ) {
		return this.activityConsultList;
	}

}

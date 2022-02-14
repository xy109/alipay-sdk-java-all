package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MActivityDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.merchant.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-14 12:53:35
 */
public class KoubeiMarketingCampaignMerchantActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4651589397258621923L;

	/** 
	 * 创建成功之后返回活动详情信息，包含活动activity_id和活动当前状态activity_status等信息。
	 */
	@ApiField("activity_detail_info")
	private MActivityDetailInfo activityDetailInfo;

	public void setActivityDetailInfo(MActivityDetailInfo activityDetailInfo) {
		this.activityDetailInfo = activityDetailInfo;
	}
	public MActivityDetailInfo getActivityDetailInfo( ) {
		return this.activityDetailInfo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:58:14
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5325511294547885617L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}

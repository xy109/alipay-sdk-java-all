package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:24:13
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6717725486611464665L;

	/** 
	 * 新评论id
	 */
	@ApiField("newsfeed_id")
	private String newsfeedId;

	public void setNewsfeedId(String newsfeedId) {
		this.newsfeedId = newsfeedId;
	}
	public String getNewsfeedId( ) {
		return this.newsfeedId;
	}

}

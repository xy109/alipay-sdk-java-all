package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板操作项
 *
 * @author auto create
 * @since 1.0, 2021-09-06 21:36:53
 */
public class MemberCardTemplateOperationItem extends AlipayObject {

	private static final long serialVersionUID = 5241355689935211372L;

	/**
	 * 卡模板操作项的文本
	 */
	@ApiField("text")
	private String text;

	/**
	 * 卡模板操作项的跳转链接, 支持 小程序地址 或者 官方h5地址。
	 */
	@ApiField("url")
	private String url;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

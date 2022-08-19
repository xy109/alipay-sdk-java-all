package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号查询
 *
 * @author auto create
 * @since 1.0, 2022-08-11 11:05:36
 */
public class AnttechBlockchainDefinSaasAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1776698921215987541L;

	/**
	 * 账号状态过滤，默认查询所有状态账号；
ACTIVE = 查询激活账号
INIT = 查询未激活账号
	 */
	@ApiField("account_status")
	private String accountStatus;

	/**
	 * 买家外部业务平台会员ID
	 */
	@ApiField("out_member_id")
	private ReferenceId outMemberId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public ReferenceId getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(ReferenceId outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}

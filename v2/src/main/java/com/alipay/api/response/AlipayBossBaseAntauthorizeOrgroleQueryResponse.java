package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrgRoleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.antauthorize.orgrole.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:41:52
 */
public class AlipayBossBaseAntauthorizeOrgroleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4657344113863961241L;

	/** 
	 * 组织节点上人员信息
	 */
	@ApiField("org_role")
	private OrgRoleDTO orgRole;

	public void setOrgRole(OrgRoleDTO orgRole) {
		this.orgRole = orgRole;
	}
	public OrgRoleDTO getOrgRole( ) {
		return this.orgRole;
	}

}

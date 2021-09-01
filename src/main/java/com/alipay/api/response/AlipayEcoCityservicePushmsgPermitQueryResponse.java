package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserPermit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.pushmsg.permit.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:15
 */
public class AlipayEcoCityservicePushmsgPermitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5835972542774782434L;

	/** 
	 * 根据查询条件返回匹配用户列表,包含用户id以及消息推送授权状态
	 */
	@ApiListField("user_permit_list")
	@ApiField("user_permit")
	private List<UserPermit> userPermitList;

	public void setUserPermitList(List<UserPermit> userPermitList) {
		this.userPermitList = userPermitList;
	}
	public List<UserPermit> getUserPermitList( ) {
		return this.userPermitList;
	}

}

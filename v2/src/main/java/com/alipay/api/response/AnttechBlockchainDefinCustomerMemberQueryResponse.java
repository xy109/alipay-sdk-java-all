package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DefiCustMemberDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:49:55
 */
public class AnttechBlockchainDefinCustomerMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8586359877646184138L;

	/** 
	 * 会员对象
	 */
	@ApiListField("member_info_list")
	@ApiField("defi_cust_member_d_t_o")
	private List<DefiCustMemberDTO> memberInfoList;

	public void setMemberInfoList(List<DefiCustMemberDTO> memberInfoList) {
		this.memberInfoList = memberInfoList;
	}
	public List<DefiCustMemberDTO> getMemberInfoList( ) {
		return this.memberInfoList;
	}

}

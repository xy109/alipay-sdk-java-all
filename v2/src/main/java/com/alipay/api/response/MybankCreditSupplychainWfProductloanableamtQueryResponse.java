package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McaStoreLoanableDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.productloanableamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:48:21
 */
public class MybankCreditSupplychainWfProductloanableamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1453577626684295992L;

	/** 
	 * 可贷额度列表
	 */
	@ApiListField("storeloanablelist")
	@ApiField("mca_store_loanable_detail")
	private List<McaStoreLoanableDetail> storeloanablelist;

	public void setStoreloanablelist(List<McaStoreLoanableDetail> storeloanablelist) {
		this.storeloanablelist = storeloanablelist;
	}
	public List<McaStoreLoanableDetail> getStoreloanablelist( ) {
		return this.storeloanablelist;
	}

}

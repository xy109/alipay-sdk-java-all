package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaymentApplyResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.gfsettleprod.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-29 15:45:18
 */
public class AlipayBossProdGfsettleprodApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3647116386542544798L;

	/** 
	 * 付款（开票）申请
	 */
	@ApiListField("result_set")
	@ApiField("payment_apply_response_d_t_o")
	private List<PaymentApplyResponseDTO> resultSet;

	public void setResultSet(List<PaymentApplyResponseDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<PaymentApplyResponseDTO> getResultSet( ) {
		return this.resultSet;
	}

}

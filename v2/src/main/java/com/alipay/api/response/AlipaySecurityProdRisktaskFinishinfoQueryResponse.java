package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskFinishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.risktask.finishinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:01:42
 */
public class AlipaySecurityProdRisktaskFinishinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8154495374862999944L;

	/** 
	 * finish_type 结案类型
finishLabel 结案标签
	 */
	@ApiListField("finish_info_list")
	@ApiField("risk_finish_info")
	private List<RiskFinishInfo> finishInfoList;

	public void setFinishInfoList(List<RiskFinishInfo> finishInfoList) {
		this.finishInfoList = finishInfoList;
	}
	public List<RiskFinishInfo> getFinishInfoList( ) {
		return this.finishInfoList;
	}

}

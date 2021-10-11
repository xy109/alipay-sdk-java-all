package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoxCrowdMatchModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antlbs.crowd.match response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-22 14:50:50
 */
public class AlipayDataDataserviceAntlbsCrowdMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7274816279729914979L;

	/** 
	 * 匹配结果，入参中每个客群码都会返回是否匹配，即使该客群不存在
	 */
	@ApiListField("match_result")
	@ApiField("promox_crowd_match_model")
	private List<PromoxCrowdMatchModel> matchResult;

	public void setMatchResult(List<PromoxCrowdMatchModel> matchResult) {
		this.matchResult = matchResult;
	}
	public List<PromoxCrowdMatchModel> getMatchResult( ) {
		return this.matchResult;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.symbols.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:17:44
 */
public class AlipayFinanceQuotationQuotetradeSymbolsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1434778797577412594L;

	/** 
	 * 股票的唯一代码：symbol=code.market
	 */
	@ApiListField("data")
	@ApiField("string")
	private List<String> data;

	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getData( ) {
		return this.data;
	}

}

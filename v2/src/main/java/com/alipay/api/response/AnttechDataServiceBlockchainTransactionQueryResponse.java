package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BlockChainTransactionApiDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.data.service.blockchain.transaction.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:43:31
 */
public class AnttechDataServiceBlockchainTransactionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7592724133642176892L;

	/** 
	 * 交易列表
	 */
	@ApiListField("transaction_list")
	@ApiField("block_chain_transaction_api_d_o")
	private List<BlockChainTransactionApiDO> transactionList;

	public void setTransactionList(List<BlockChainTransactionApiDO> transactionList) {
		this.transactionList = transactionList;
	}
	public List<BlockChainTransactionApiDO> getTransactionList( ) {
		return this.transactionList;
	}

}

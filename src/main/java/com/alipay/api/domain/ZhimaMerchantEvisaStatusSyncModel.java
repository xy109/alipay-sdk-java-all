package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子签证申请状态信息同步接口
 *
 * @author auto create
 * @since 1.0, 2019-07-05 09:56:54
 */
public class ZhimaMerchantEvisaStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7659964231716444982L;

	/**
	 * 信息同步类型：VERIFY - 材料材料审核状态同步/APPROVE - 签证批准状态同步。
Action type: "VERIFY" for "VerifyUpdateToChannelAPI", and "APPROVE" for "ApproveUpdateToChannelAPI"
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 批准结果列表。
ApprovedInfo list, if action type equals "APPROVE", this field should not be empty.
	 */
	@ApiListField("approved_infos")
	@ApiField("approved_info")
	private List<ApprovedInfo> approvedInfos;

	/**
	 * 信息同步动作发生时间。
DateTime of biz action.
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商户生成唯一的外部接口调用事务号，使用 pid+out_biz_no 做唯一幂等。
Transaction number generated by channel merchant, idempotent with key of "parterId + out_biz_no".
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 场景类型：THA_EVOA。
API scene type, ex. THA_EVOA.
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 审核结果列表。
VerifiedInfo list, if action type equals "VERIFY", this field should not be empty.
	 */
	@ApiListField("verified_infos")
	@ApiField("verified_info")
	private List<VerifiedInfo> verifiedInfos;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public List<ApprovedInfo> getApprovedInfos() {
		return this.approvedInfos;
	}
	public void setApprovedInfos(List<ApprovedInfo> approvedInfos) {
		this.approvedInfos = approvedInfos;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public List<VerifiedInfo> getVerifiedInfos() {
		return this.verifiedInfos;
	}
	public void setVerifiedInfos(List<VerifiedInfo> verifiedInfos) {
		this.verifiedInfos = verifiedInfos;
	}

}

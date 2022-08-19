package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险宠物档案删除
 *
 * @author auto create
 * @since 1.0, 2021-06-30 15:31:52
 */
public class AlipayInsSceneInsassetprodPetprofileDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6275437378811516294L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv学校查询
 *
 * @author auto create
 * @since 1.0, 2021-03-03 23:19:26
 */
public class AlipayOverseasOpenSchoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5467158717832949269L;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}

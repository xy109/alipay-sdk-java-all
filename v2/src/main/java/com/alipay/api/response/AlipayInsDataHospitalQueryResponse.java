package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HospitalDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.hospital.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:09:32
 */
public class AlipayInsDataHospitalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8151762594791366695L;

	/** 
	 * 名称相似度Top10的医院
	 */
	@ApiListField("hospitals")
	@ApiField("hospital_d_t_o")
	private List<HospitalDTO> hospitals;

	public void setHospitals(List<HospitalDTO> hospitals) {
		this.hospitals = hospitals;
	}
	public List<HospitalDTO> getHospitals( ) {
		return this.hospitals;
	}

}

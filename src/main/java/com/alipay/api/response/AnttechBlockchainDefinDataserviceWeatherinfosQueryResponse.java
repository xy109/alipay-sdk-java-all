package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeatherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.weatherinfos.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-01 10:26:49
 */
public class AnttechBlockchainDefinDataserviceWeatherinfosQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8477248852166553774L;

	/** 
	 * 气象信息
	 */
	@ApiListField("weather_infos")
	@ApiField("weather_info")
	private List<WeatherInfo> weatherInfos;

	public void setWeatherInfos(List<WeatherInfo> weatherInfos) {
		this.weatherInfos = weatherInfos;
	}
	public List<WeatherInfo> getWeatherInfos( ) {
		return this.weatherInfos;
	}

}
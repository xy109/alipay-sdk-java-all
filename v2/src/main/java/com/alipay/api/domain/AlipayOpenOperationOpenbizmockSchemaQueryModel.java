package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成schema测试
 *
 * @author auto create
 * @since 1.0, 2022-12-14 15:04:50
 */
public class AlipayOpenOperationOpenbizmockSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8484169865516185797L;

	/**
	 * test
	 */
	@ApiField("a")
	private String a;

	/**
	 * test
	 */
	@ApiField("b")
	private String b;

	/**
	 * test
	 */
	@ApiField("c")
	private String c;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

}

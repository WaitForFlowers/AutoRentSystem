package com.myweb.app.domain;

public class Serial {
	private String brand_code;
	private String SERIAL_CODE;
	private String SERIAL_NAME;
	private String create_date;
	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}
	public String getSERIAL_CODE() {
		return SERIAL_CODE;
	}
	public void setSERIAL_CODE(String sERIAL_CODE) {
		SERIAL_CODE = sERIAL_CODE;
	}
	public String getSERIAL_NAME() {
		return SERIAL_NAME;
	}
	public void setSERIAL_NAME(String sERIAL_NAME) {
		SERIAL_NAME = sERIAL_NAME;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public Serial() {
	}
	public Serial(String brand_code, String sERIAL_CODE, String sERIAL_NAME, String create_date) {
		super();
		this.brand_code = brand_code;
		SERIAL_CODE = sERIAL_CODE;
		SERIAL_NAME = sERIAL_NAME;
		this.create_date = create_date;
	}
	@Override
	public String toString() {
		return "Serial [brand_code=" + brand_code + ", SERIAL_CODE=" + SERIAL_CODE + ", SERIAL_NAME=" + SERIAL_NAME
				+ ", create_date=" + create_date + "]";
	}
}

package com.myweb.app.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Brand {
	
	
	private String id;
	private String brand_code;
	private String brand_name;
	private String brand_pic;
	private String brand_url;
	private Date create_date;
	private String brand_py;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand_code() {
		return brand_code;
	}
	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getBrand_pic() {
		return brand_pic;
	}
	public void setBrand_pic(String brand_pic) {
		this.brand_pic = brand_pic;
	}
	public String getBrand_url() {
		return brand_url;
	}
	public void setBrand_url(String brand_url) {
		this.brand_url = brand_url;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getBrand_py() {
		return brand_py;
	}
	public void setBrand_py(String brand_py) {
		this.brand_py = brand_py;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", brand_code=" + brand_code + ", brand_name=" + brand_name + ", brand_pic="
				+ brand_pic + ", brand_url=" + brand_url + ", create_date=" + create_date + ", brand_py=" + brand_py
				+  ", getId()=" + getId() + ", getBrand_code()="
				+ getBrand_code() + ", getBrand_name()=" + getBrand_name() + ", getBrand_pic()=" + getBrand_pic()
				+ ", getBrand_url()=" + getBrand_url() + ", getCreate_date()=" + getCreate_date() + ", getBrand_py()="
				+ getBrand_py() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

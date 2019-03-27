package com.myweb.app.domain;

import java.util.Date;

public class Lease {
	private String id;
	private String lease_id;
	private String lease_province;
	private String lease_city;
	private String lease_address;
	private int lease_state;
	private Date create_date;
	private String lease_area;
	private String platform_adress_id;
	private String briefName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLease_id() {
		return lease_id;
	}
	public void setLease_id(String lease_id) {
		this.lease_id = lease_id;
	}
	public String getLease_province() {
		return lease_province;
	}
	public void setLease_province(String lease_province) {
		this.lease_province = lease_province;
	}
	public String getLease_city() {
		return lease_city;
	}
	public void setLease_city(String lease_city) {
		this.lease_city = lease_city;
	}
	public String getLease_address() {
		return lease_address;
	}
	public void setLease_address(String lease_address) {
		this.lease_address = lease_address;
	}
	public int getLease_state() {
		return lease_state;
	}
	public void setLease_state(int lease_state) {
		this.lease_state = lease_state;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getLease_area() {
		return lease_area;
	}
	public void setLease_area(String lease_area) {
		this.lease_area = lease_area;
	}
	public String getPlatform_adress_id() {
		return platform_adress_id;
	}
	public void setPlatform_adress_id(String platform_adress_id) {
		this.platform_adress_id = platform_adress_id;
	}
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}

}

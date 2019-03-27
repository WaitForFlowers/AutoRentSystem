package com.myweb.app.domain;

import java.util.Date;

public class Member {
	private String id;
	private String member_name;
	private String login_name;
	private String member_pwd;
	private int gender;
	private String nick_name;
	private String id_card;
	@Override
	public String toString() {
		return "Member [id=" + id + ", member_name=" + member_name + ", login_name=" + login_name + ", member_pwd="
				+ member_pwd + ", gender=" + gender + ", nick_name=" + nick_name + ", id_card=" + id_card
				+ ", mobile_phone=" + mobile_phone + ", email=" + email + ", icon=" + icon + ", birth_day=" + birth_day
				+ ", province=" + province + ", city=" + city + ", area=" + area + ", address=" + address
				+ ", lease_id=" + lease_id + ", member_type=" + member_type + ", CREATE_DATE=" + CREATE_DATE
				+ ", member_state=" + member_state + ", push_user_id=" + push_user_id + ", push_channel_id="
				+ push_channel_id + ", mobile_type=" + mobile_type + ", level=" + level + ", referrer_id=" + referrer_id
				+ ", THIRDUSERID=" + THIRDUSERID + ", THIRDTOKEN=" + THIRDTOKEN + ", THIRDTYPE=" + THIRDTYPE + "]";
	}
	private String mobile_phone;
	private String email;
	private String icon;
	private Date birth_day; 
	private String province;
	private String city;
	private String area;
	private String address;
	private String  lease_id;
	private int member_type;
	private Date CREATE_DATE;
	private int member_state;
	private String push_user_id;
	private String push_channel_id;
	private String mobile_type;
	private String level;
	private String referrer_id;
	private String THIRDUSERID;
	private String THIRDTOKEN;
	private String THIRDTYPE;
	public Member() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
public Date getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLease_id() {
		return lease_id;
	}
	public void setLease_id(String lease_id) {
		this.lease_id = lease_id;
	}
	public int getMember_type() {
		return member_type;
	}
	public void setMember_type(int member_type) {
		this.member_type = member_type;
	}
	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public int getMember_state() {
		return member_state;
	}
	public void setMember_state(int member_state) {
		this.member_state = member_state;
	}
	public String getPush_user_id() {
		return push_user_id;
	}
	public void setPush_user_id(String push_user_id) {
		this.push_user_id = push_user_id;
	}
	public String getPush_channel_id() {
		return push_channel_id;
	}
	public void setPush_channel_id(String push_channel_id) {
		this.push_channel_id = push_channel_id;
	}
	public String getMobile_type() {
		return mobile_type;
	}
	public void setMobile_type(String mobile_type) {
		this.mobile_type = mobile_type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getReferrer_id() {
		return referrer_id;
	}
	public void setReferrer_id(String referrer_id) {
		this.referrer_id = referrer_id;
	}
	public String getTHIRDUSERID() {
		return THIRDUSERID;
	}
	public void setTHIRDUSERID(String tHIRDUSERID) {
		THIRDUSERID = tHIRDUSERID;
	}
	public String getTHIRDTOKEN() {
		return THIRDTOKEN;
	}
	public void setTHIRDTOKEN(String tHIRDTOKEN) {
		THIRDTOKEN = tHIRDTOKEN;
	}
	public String getTHIRDTYPE() {
		return THIRDTYPE;
	}
	public void setTHIRDTYPE(String tHIRDTYPE) {
		THIRDTYPE = tHIRDTYPE;
	}
}

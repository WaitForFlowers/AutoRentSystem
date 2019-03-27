package com.myweb.app.domain;

import java.util.Date;

public class Company_car {
	
	private String id;
	private String lease_id;
	private String car_no;
	private String car_name;
	private String car_type;
	private String car_brand;
	private String car_serial;
	private double normal_price;
	private double holiday_price;
	private double special_price;
	private String gear;
	private String displacement;
	private int seating;
	private int car_quantity;
	private String plate_double;
	private String car_pic;
	private int audit_state;
	private int updown_state;
	private String car_desc;
	private String create_date;
	private int has_navigat;
	
	public Company_car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company_car(String lease_id, String car_no, String car_name, String car_type, String car_brand,
			String car_serial, double normal_price, double holiday_price, double special_price, String gear,
			String displacement, int seating, int car_quantity, String car_pic,
			int updown_state, String car_desc) {
		super();
		this.lease_id = lease_id;
		this.car_no = car_no;
		this.car_name = car_name;
		this.car_type = car_type;
		this.car_brand = car_brand;
		this.car_serial = car_serial;
		this.normal_price = normal_price;
		this.holiday_price = holiday_price;
		this.special_price = special_price;
		this.gear = gear;
		this.displacement = displacement;
		this.seating = seating;
		this.car_quantity = car_quantity;
		this.car_pic = car_pic;
		this.updown_state = updown_state;
		this.car_desc = car_desc;
	}

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
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_serial() {
		return car_serial;
	}
	public void setCar_serial(String car_serial) {
		this.car_serial = car_serial;
	}
	public double getNormal_price() {
		return normal_price;
	}
	public void setNormal_price(double normal_price) {
		this.normal_price = normal_price;
	}
	public double getHoliday_price() {
		return holiday_price;
	}
	public void setHoliday_price(double holiday_price) {
		this.holiday_price = holiday_price;
	}
	public double getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(double special_price) {
		this.special_price = special_price;
	}
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public int getSeating() {
		return seating;
	}
	public void setSeating(int seating) {
		this.seating = seating;
	}
	public int getCar_quantity() {
		return car_quantity;
	}
	public void setCar_quantity(int car_quantity) {
		this.car_quantity = car_quantity;
	}
	public String getPlate_double() {
		return plate_double;
	}
	public void setPlate_double(String plate_double) {
		this.plate_double = plate_double;
	}
	public String getCar_pic() {
		return car_pic;
	}
	public void setCar_pic(String car_pic) {
		this.car_pic = car_pic;
	}
	public int getAudit_state() {
		return audit_state;
	}
	public void setAudit_state(int audit_state) {
		this.audit_state = audit_state;
	}
	public int getUpdown_state() {
		return updown_state;
	}
	public void setUpdown_state(int updown_state) {
		this.updown_state = updown_state;
	}
	public String getCar_desc() {
		return car_desc;
	}
	public void setCar_desc(String car_desc) {
		this.car_desc = car_desc;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public int getHas_navigat() {
		return has_navigat;
	}
	public void setHas_navigat(int has_navigat) {
		this.has_navigat = has_navigat;
	}
	@Override
	public String toString() {
		return "Company_car [id=" + id + ", lease_id=" + lease_id + ", car_no=" + car_no + ", car_name=" + car_name
				+ ", car_type=" + car_type + ", car_brand=" + car_brand + ", car_serial=" + car_serial
				+ ", normal_price=" + normal_price + ", holiday_price=" + holiday_price + ", special_price="
				+ special_price + ", gear=" + gear + ", displacement=" + displacement + ", seating=" + seating
				+ ", car_quantity=" + car_quantity + ", plate_double=" + plate_double + ", car_pic=" + car_pic
				+ ", audit_state=" + audit_state + ", updown_state=" + updown_state + ", car_desc=" + car_desc
				+ ", create_date=" + create_date + ", has_navigat=" + has_navigat + "]";
	}
	
	
	

}

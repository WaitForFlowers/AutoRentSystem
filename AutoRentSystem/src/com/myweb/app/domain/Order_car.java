package com.myweb.app.domain;

import java.util.Date;

public class Order_car {
	private String id;
	private String member_id;
	private String lease_id;
	private String lease_nmae;
	private String order_no;
	private String car_id;
	private String car_name;
	private String car_no;
	private String car_type;
	private String car_type_name;
	private String car_brand;
	private String car_brand_name;
	private String car_serial;
	private String car_serial_name;
	private String gear;
	private String gear_name;
	private String displacement;
	private int seating;
	private String plate_double;
	private String car_pic;
	private Date order_start_time;
	private Date order_end_time;
	private String tack_address_id;
	private String tack_address;
	private String return_address_id;
	private String return_address;
	private double normal_price;
	private double holiday_price;
	private double special_price;
	private String feeDetail;
	public Order_car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order_car(String id, String member_id, String lease_id, String lease_nmae, String order_no, String car_id,
			String car_name, String car_no, String car_type, String car_type_name, String car_brand,
			String car_brand_name, String car_serial, String car_serial_name, String gear, String gear_name,
			String displacement, int seating, String plate_double, String car_pic, Date order_start_time,
			Date order_end_time, String tack_address_id, String tack_address, String return_address_id,
			String return_address, double normal_price, double holiday_price, double special_price, String feeDetail) {
		super();
		this.id = id;
		this.member_id = member_id;
		this.lease_id = lease_id;
		this.lease_nmae = lease_nmae;
		this.order_no = order_no;
		this.car_id = car_id;
		this.car_name = car_name;
		this.car_no = car_no;
		this.car_type = car_type;
		this.car_type_name = car_type_name;
		this.car_brand = car_brand;
		this.car_brand_name = car_brand_name;
		this.car_serial = car_serial;
		this.car_serial_name = car_serial_name;
		this.gear = gear;
		this.gear_name = gear_name;
		this.displacement = displacement;
		this.seating = seating;
		this.plate_double = plate_double;
		this.car_pic = car_pic;
		this.order_start_time = order_start_time;
		this.order_end_time = order_end_time;
		this.tack_address_id = tack_address_id;
		this.tack_address = tack_address;
		this.return_address_id = return_address_id;
		this.return_address = return_address;
		this.normal_price = normal_price;
		this.holiday_price = holiday_price;
		this.special_price = special_price;
		this.feeDetail = feeDetail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getLease_id() {
		return lease_id;
	}
	public void setLease_id(String lease_id) {
		this.lease_id = lease_id;
	}
	public String getLease_nmae() {
		return lease_nmae;
	}
	public void setLease_nmae(String lease_nmae) {
		this.lease_nmae = lease_nmae;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_type_name() {
		return car_type_name;
	}
	public void setCar_type_name(String car_type_name) {
		this.car_type_name = car_type_name;
	}
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_brand_name() {
		return car_brand_name;
	}
	public void setCar_brand_name(String car_brand_name) {
		this.car_brand_name = car_brand_name;
	}
	public String getCar_serial() {
		return car_serial;
	}
	public void setCar_serial(String car_serial) {
		this.car_serial = car_serial;
	}
	public String getCar_serial_name() {
		return car_serial_name;
	}
	public void setCar_serial_name(String car_serial_name) {
		this.car_serial_name = car_serial_name;
	}
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	public String getGear_name() {
		return gear_name;
	}
	public void setGear_name(String gear_name) {
		this.gear_name = gear_name;
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
	public Date getOrder_start_time() {
		return order_start_time;
	}
	public void setOrder_start_time(Date order_start_time) {
		this.order_start_time = order_start_time;
	}
	public Date getOrder_end_time() {
		return order_end_time;
	}
	public void setOrder_end_time(Date order_end_time) {
		this.order_end_time = order_end_time;
	}
	public String getTack_address_id() {
		return tack_address_id;
	}
	public void setTack_address_id(String tack_address_id) {
		this.tack_address_id = tack_address_id;
	}
	public String getTack_address() {
		return tack_address;
	}
	public void setTack_address(String tack_address) {
		this.tack_address = tack_address;
	}
	public String getReturn_address_id() {
		return return_address_id;
	}
	public void setReturn_address_id(String return_address_id) {
		this.return_address_id = return_address_id;
	}
	public String getReturn_address() {
		return return_address;
	}
	public void setReturn_address(String return_address) {
		this.return_address = return_address;
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
	public String getFeeDetail() {
		return feeDetail;
	}
	public void setFeeDetail(String feeDetail) {
		this.feeDetail = feeDetail;
	}
	

	@Override
	public String toString() {
		return "Order_car [id=" + id + ", member_id=" + member_id + ", lease_id=" + lease_id + ", lease_nmae="
				+ lease_nmae + ", order_no=" + order_no + ", car_id=" + car_id + ", car_name=" + car_name + ", car_no="
				+ car_no + ", car_type=" + car_type + ", car_type_name=" + car_type_name + ", car_brand=" + car_brand
				+ ", car_brand_name=" + car_brand_name + ", car_serial=" + car_serial + ", car_serial_name="
				+ car_serial_name + ", gear=" + gear + ", gear_name=" + gear_name + ", displacement=" + displacement
				+ ", seating=" + seating + ", plate_double=" + plate_double + ", car_pic=" + car_pic
				+ ", order_start_time=" + order_start_time + ", order_end_time=" + order_end_time + ", tack_address_id="
				+ tack_address_id + ", tack_address=" + tack_address + ", return_address_id=" + return_address_id
				+ ", return_address=" + return_address + ", normal_price=" + normal_price + ", holiday_price="
				+ holiday_price + ", special_price=" + special_price + ", feeDetail=" + feeDetail + "]";
	}
	public void setCar(Company_car car){

		this.lease_id =car.getLease_id();
		this.car_id = car.getId();
		this.car_name = car.getCar_name();
		this.car_no = car.getCar_no();
		this.car_type = car.getCar_type();
		this.car_brand = car.getCar_brand();
		this.car_serial = car.getCar_serial();
		this.gear = car.getGear();
		this.displacement = car.getDisplacement();
		this.seating = car.getSeating();
		this.plate_double = car.getPlate_double();
		this.car_pic = car.getCar_pic();

	}

}

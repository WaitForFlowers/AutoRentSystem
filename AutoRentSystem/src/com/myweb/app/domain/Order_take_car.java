package com.myweb.app.domain;

import java.util.Date;

public class Order_take_car {
	/*`id` varchar(32) NOT NULL,
	   `order_no` varchar(32) default NULL COMMENT '订单编号',
	   `user_real_name` varchar(20) default NULL COMMENT '取车人真实姓名',
	   `user_idcard` varchar(20) default NULL COMMENT '取车人身份证号',
	   `user_phone` varchar(15) default NULL COMMENT '取车人手机号',
	   `take_date` datetime default NULL COMMENT '取车时间',
	   `return_date` datetime default NULL COMMENT '还车时间',*/
	private String id;
	private String order_no;
	private String user_real_name;
	private String user_idcard;
	private String user_phone;
	private Date take_date;
	private Date return_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getUser_real_name() {
		return user_real_name;
	}
	public void setUser_real_name(String user_real_name) {
		this.user_real_name = user_real_name;
	}
	public String getUser_idcard() {
		return user_idcard;
	}
	public void setUser_idcard(String user_idcard) {
		this.user_idcard = user_idcard;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Date getTake_date() {
		return take_date;
	}
	public void setTake_date(Date take_date) {
		this.take_date = take_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	@Override
	public String toString() {
		return "Order_take_car [id=" + id + ", order_no=" + order_no + ", user_real_name=" + user_real_name
				+ ", user_idcard=" + user_idcard + ", user_phone=" + user_phone + ", take_date=" + take_date
				+ ", return_date=" + return_date + "]";
	}
}

package com.myweb.app.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.app.domain.Company_car;
import com.myweb.app.domain.Order;
import com.myweb.app.domain.Order_car;
import com.myweb.app.domain.Order_take_car;
import com.myweb.app.service.OrderService;
import com.myweb.app.service.Order_carService;
import com.myweb.app.service.Order_take_carService;

@Controller
@RequestMapping("/order")
public class FinalOrderController {
	
	
	@Autowired
	private Order_take_carService order_take_carservice;
	@Autowired
	private Order_carService order_carservice;
	@Autowired
	private OrderService  order_service;
	
	@RequestMapping("/allin.do")
	public String add(HttpServletRequest request,HttpServletResponse response,Model model) throws IOException{
		
		
		HttpSession session = request.getSession();
		//�⳵��ȡ��������Ϣ
		Order_car order_car = (Order_car)session.getAttribute("ordercar");
		//�⳵�������Ϣ
		Order_take_car order_take_car = (Order_take_car)session.getAttribute("ordertakecar");
		//������Ϣ
		Company_car company_car = (Company_car)session.getAttribute("car");
		Date date = new Date();
		String id = String.valueOf(date.getTime());
		
		//���⳵����Ϣд��t_order_take_car����
		order_take_car.setTake_date(order_car.getOrder_start_time());
		order_take_car.setReturn_date(order_car.getOrder_end_time());
		
		System.out.println(order_take_car);
	    order_take_carservice.addOrder_take_car(order_take_car);
	    
		//���⳵��ȡ������Ϣ�ͳ��������Ϣд��t_order_car����
	    order_car.setId(id);
		order_car.setLease_id(company_car.getLease_id());
		order_car.setOrder_no(order_take_car.getOrder_no());
		order_car.setCar_id(company_car.getId());
		order_car.setCar_name(company_car.getCar_name());
		order_car.setCar_type(company_car.getCar_type());
		order_car.setCar_brand(company_car.getCar_brand());
		order_car.setCar_serial(company_car.getCar_serial());
		order_car.setNormal_price(company_car.getNormal_price());
		order_car.setHoliday_price(company_car.getHoliday_price());
		order_car.setSpecial_price(company_car.getSpecial_price());
		order_car.setCar_pic(company_car.getCar_pic());
		order_car.setGear(company_car.getGear());
		order_car.setSeating(company_car.getSeating());
		order_car.setDisplacement(company_car.getDisplacement());
		
		System.out.println(order_car);
		order_carservice.addOrder_car(order_car);
		
		//��������ϸ��Ϣд��t_order���У��������,�û����,��Ǯ��,���ɶ���ʱ��ȣ�
		Order order = new Order();
		int pay_free = (int)session.getAttribute("pay_free");
		order.setId(id);//�������
		String member_id = (String)session.getAttribute("member_id");
		order.setMember_id(member_id);//�û����
		order.setPay_fee(pay_free);
		order.setOrder_no(order_take_car.getOrder_no());
		order.setLease_id(company_car.getLease_id());
		order.setCreate_time(new Date());
		int day = (int)session.getAttribute("day");
		int money = (int)session.getAttribute("pay_free");
		model.addAttribute("day", day);
	    model.addAttribute("money", money);
		model.addAttribute("cars",company_car);
		model.addAttribute("order_take_cars",order_take_car); 
		model.addAttribute("ordercars",order_car);
		
		System.out.println(order);
		order_service.addOrder(order);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
	    out.flush();
	    out.println("<script>");
	    out.println("alert('订单提交成功');");
	    out.println("</script>");
		
		
         return "order_list";
	}
	@RequestMapping("/cancel")
	public String cancel(HttpServletRequest request,HttpServletResponse response,Model model) throws IOException{
		HttpSession session = request.getSession();
		//�⳵��ȡ��������Ϣ
		Order_car order_car = (Order_car)session.getAttribute("ordercar");
		//�⳵�������Ϣ
		Order_take_car order_take_car = (Order_take_car)session.getAttribute("ordertakecar");
		//������Ϣ
		Company_car company_car = (Company_car)session.getAttribute("car");
		Date date = new Date();
		String id = String.valueOf(date.getTime());
		
		//���⳵����Ϣд��t_order_take_car����
		order_take_car.setTake_date(order_car.getOrder_start_time());
		order_take_car.setReturn_date(order_car.getOrder_end_time());
		
		System.out.println(order_take_car);
	    //order_take_carservice.addOrder_take_car(order_take_car);
	    
		//���⳵��ȡ������Ϣ�ͳ��������Ϣд��t_order_car����
	    order_car.setId(id);
		order_car.setLease_id(company_car.getLease_id());
		order_car.setOrder_no(order_take_car.getOrder_no());
		order_car.setCar_id(company_car.getId());
		order_car.setCar_name(company_car.getCar_name());
		order_car.setCar_type(company_car.getCar_type());
		order_car.setCar_brand(company_car.getCar_brand());
		order_car.setCar_serial(company_car.getCar_serial());
		order_car.setNormal_price(company_car.getNormal_price());
		order_car.setHoliday_price(company_car.getHoliday_price());
		order_car.setSpecial_price(company_car.getSpecial_price());
		order_car.setCar_pic(company_car.getCar_pic());
		order_car.setGear(company_car.getGear());
		order_car.setSeating(company_car.getSeating());
		order_car.setDisplacement(company_car.getDisplacement());
		
		System.out.println(order_car);
		//order_carservice.addOrder_car(order_car);
		
		//��������ϸ��Ϣд��t_order���У��������,�û����,��Ǯ��,���ɶ���ʱ��ȣ�
		Order order = new Order();
		int pay_free = (int)session.getAttribute("pay_free");
		order.setId(id);//�������
		String member_id = (String)session.getAttribute("member_id");
		order.setMember_id(member_id);//�û����
		order.setPay_fee(pay_free);
		order.setOrder_no(order_take_car.getOrder_no());
		order.setLease_id(company_car.getLease_id());
		order.setCreate_time(new Date());
		int day = (int)session.getAttribute("day");
		int money = (int)session.getAttribute("pay_free");
		model.addAttribute("day", day);
	    model.addAttribute("money", money);
		model.addAttribute("cars",company_car);
		model.addAttribute("order_take_cars",order_take_car); 
		model.addAttribute("ordercars",order_car);
		
		System.out.println(order);
		//order_service.addOrder(order);
		return "order_list";
	}

}


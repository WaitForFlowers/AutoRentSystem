package com.myweb.app.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myweb.app.domain.Company_car;
import com.myweb.app.domain.Order_car;
import com.myweb.app.domain.Order_take_car;

@Controller
@RequestMapping("/order_take_car")
public class Order_listController {
	
	
	@RequestMapping(value = "/add.do", method = RequestMethod.POST)
	public String addOrder_take_car(Order_take_car order_take_car,Model model,HttpServletRequest request){
		Date date = new Date();
		String id = String.valueOf(date.getTime());
		order_take_car.setId(id);
		order_take_car.setOrder_no(id);
		HttpSession session = request.getSession();
		Company_car company_car = (Company_car)session.getAttribute("car");
		Order_car order_car = (Order_car)session.getAttribute("ordercar");
		
		session.setAttribute("ordertakecar",order_take_car);
		
		Date start = order_car.getOrder_start_time();
		Date end = order_car.getOrder_end_time();
		int day = (int)(end.getTime()-start.getTime())/(24*3600*1000);
		int money = day*(int)company_car.getNormal_price();
		session.setAttribute("day", day);
		session.setAttribute("pay_free", money);
		
	    model.addAttribute("day", day);
	    model.addAttribute("money", money);
		model.addAttribute("cars",company_car);
		model.addAttribute("order_take_cars",order_take_car); 
		model.addAttribute("ordercars",order_car);
		return "forward:/order_list.jsp";
	}
}

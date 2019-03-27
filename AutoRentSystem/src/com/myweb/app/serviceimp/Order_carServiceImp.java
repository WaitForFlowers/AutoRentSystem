package com.myweb.app.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Order_car;
import com.myweb.app.mapper.Order_carMapper;
import com.myweb.app.service.Order_carService;

@Service
public class Order_carServiceImp implements Order_carService{
	
	@Autowired
	private Order_carMapper order_carmapper;
	
	public void addOrder_car(Order_car order_car){
		
		order_carmapper.addOrder_car(order_car);
	}

}

package com.myweb.app.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Order_take_car;
import com.myweb.app.mapper.Order_take_carMapper;
import com.myweb.app.service.Order_take_carService;


@Service
public class Order_take_carServiceImp implements Order_take_carService{
	
	@Autowired
    private Order_take_carMapper order_take_carmapper ;
    
	@Override
	public void addOrder_take_car(Order_take_car order_take_car) {
		order_take_carmapper.addOrder_take_car(order_take_car);
		
	}
	

}

package com.myweb.app.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Order;
import com.myweb.app.mapper.OrderMapper;
import com.myweb.app.service.OrderService;

@Service
public class OrderServiceImp implements OrderService{
	
	@Autowired
	private OrderMapper ordermapper;
	
	public void addOrder(Order order){
		
		ordermapper.addOrder(order);
	}

}

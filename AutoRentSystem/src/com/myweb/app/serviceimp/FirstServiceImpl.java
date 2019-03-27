package com.myweb.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Brand;
import com.myweb.app.mapper.FirstMapper;
import com.myweb.app.service.FirstService;

@Service
public class FirstServiceImpl implements FirstService{
	@Autowired
	private FirstMapper f;
	@Override
	public List<String> sel(String brand) {
		List<String> list = f.sel(brand);
		//System.out.println("FirstServiceImpl brand:"+brand);
		return list;
	}
	
}

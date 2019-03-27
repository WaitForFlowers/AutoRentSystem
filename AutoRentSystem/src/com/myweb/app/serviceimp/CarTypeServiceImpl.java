package com.myweb.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.mapper.CarTypeMapper;
import com.myweb.app.service.CarTypeService;
import com.myweb.app.service.SerialService;

@Service
public class CarTypeServiceImpl implements CarTypeService{

	@Autowired
	private CarTypeMapper cartypeMapper;
	@Override
	public List<String> selectCTName(){
		return cartypeMapper.selectCTName();
	}
	@Override
	public String selectTCodeByName(String type) {

		return cartypeMapper.selectTCodeByName(type);
	}
}

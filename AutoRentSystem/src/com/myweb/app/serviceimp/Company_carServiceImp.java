package com.myweb.app.serviceimp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Company_car;
import com.myweb.app.mapper.Company_carMapper;
import com.myweb.app.service.Company_carService;


@Service
public class Company_carServiceImp implements Company_carService{
	@Autowired
	private Company_carMapper carMapper;
	@Override
	public List<Company_car> selectAllCar(){
		return carMapper.selectAllCar();
	}
	@Override
	public List<Company_car> selectBySelect(String brand,String serial,String type) {

		return carMapper.selectBySelect(brand,serial,type);
	}
	@Override
	public Company_car findCompany_carById(String id) {
		// TODO Auto-generated method stub
		return carMapper.findCompany_carById(id);
	}

}

package com.myweb.app.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myweb.app.domain.Company_car;

public interface Company_carService {
	List<Company_car> selectAllCar();
	List<Company_car> selectBySelect(String brand,String serial,String type);
	Company_car findCompany_carById(String id);
}

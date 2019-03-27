package com.myweb.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myweb.app.domain.Company_car;

public interface Company_carMapper {
	List<Company_car> selectAllCar();
	Company_car findCompany_carById(String id);
	List<Company_car> selectBySelect(@Param("brand")String brand,@Param("serial")String serial,@Param("type")String type);
}

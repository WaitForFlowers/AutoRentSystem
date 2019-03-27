package com.myweb.app.mapper;

import java.util.List;

import com.myweb.app.domain.Brand;

public interface BrandMapper {
	
	void addBrand(Brand brand);
	
	void deleteBrandById(String id);
	
	void updateBrand(Brand brand);
	
	Brand showBrandById(String id);
	
	List<Brand> showAllBrand();
	
	List<Brand> showBrandBycona(String para);
	
	String selectBCodeByName(String brand);

}

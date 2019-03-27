package com.myweb.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Brand;
import com.myweb.app.mapper.BrandMapper;
import com.myweb.app.service.BrandService;

@Service
public class BrandServiceImp implements BrandService{
	@Autowired
	private BrandMapper brandMapper;

	@Override
	public void addBrand(Brand brand) {
		brandMapper.addBrand(brand);
		
	}

	@Override
	public void deleteBrandById(String id) {
		brandMapper.deleteBrandById(id);
		
	}

	@Override
	public void updateBrand(Brand brand) {
		brandMapper.updateBrand(brand);
	}

	@Override
	public Brand showBrandById(String id) {
		return brandMapper.showBrandById(id);
		
	}

	@Override
	public List<Brand> showAllBrand() {
		return brandMapper.showAllBrand();
	}
	
	@Override
	public List<Brand> showBrandBycona(String para){
		return brandMapper.showBrandBycona(para);
	}

	@Override
	public String selectBCodeByName(String brand) {
		
		return brandMapper.selectBCodeByName(brand);
	}
	
//	public static void main(String[] args){
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		BrandServiceImp bean = context.getBean("brandServiceImp",BrandServiceImp.class);
//		List<Brand> allcompany = bean.showAllBrand();
//		for(int i=0;i<allcompany.size();i++){
//			System.out.println(allcompany.get(i));
//		}
//	}
}

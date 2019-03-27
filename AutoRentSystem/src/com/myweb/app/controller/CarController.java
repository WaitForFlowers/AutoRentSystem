package com.myweb.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myweb.app.domain.Brand;
import com.myweb.app.domain.Company_car;
import com.myweb.app.service.BrandService;
import com.myweb.app.service.Company_carService;
import com.myweb.app.service.FirstService;
import com.myweb.app.service.CarTypeService;
import com.myweb.app.service.SerialService;


@Controller
@RequestMapping(value="/rent")
public class CarController {
	@Autowired
	private FirstService f;
	@Autowired
	private BrandService brandService;
	@Autowired
	private SerialService serialService;
	@Autowired
	private CarTypeService cartypeService;
	
	@Autowired
	private Company_carService ccService;
	
	@RequestMapping(value="/list.do")
	public String findallcarinfo(@RequestParam(defaultValue = "1", required = true, value = "pageNo") Integer pageNo,
			Model model,HttpServletRequest request){  //查询所有车辆以及品牌信息跳转至list.jsp页面（租车初始页面）
		//查询所有品牌名称
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null){
			return "redirect:/index.jsp";
		}else{
			List<Brand> bl= brandService.showAllBrand();
			List<String> ls = new ArrayList<>();
			for(int i=0;i<bl.size();i++){
				ls.add(bl.get(i).getBrand_name());
			}
			model.addAttribute("brandList", ls); 
			
			//查询所有车系名称
			List<String> sl = serialService.selectSName();
			model.addAttribute("serialList", sl);
			
			//查询所有车型
			List<String> tl = cartypeService.selectCTName();
			model.addAttribute("typeList", tl);
			
			//查询所有车辆
			Integer pageSize = 8;// 每页显示记录数
			PageHelper.startPage(pageNo, pageSize);
			List<Company_car> cl = ccService.selectAllCar();
			model.addAttribute("carList", cl);
			PageInfo<Company_car> pageInfo = new PageInfo<Company_car>(cl);
			model.addAttribute("pageInfo", pageInfo);

			//System.out.println(model);
			
			//System.out.println("######################################");
			//List<Company_car> cc = ccService.selectBySelect("hyundai",null,null);
			//System.out.println(cc);

			return "forward:/list.jsp";
		}
		
	}
	
	@RequestMapping(value="/findlist.do")  //根据点击品牌，车系，车型查找
	public String findlist(String brand,String serial,String type,Model model) {
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7"+brand+","+serial+","+type+",");
		
		String bcode = brandService.selectBCodeByName(brand);
		String scode = serialService.selectSCodeByName(serial);
		String tcode = cartypeService.selectTCodeByName(type);
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7"+bcode+","+scode+","+tcode+",");
		List<Company_car> cc = ccService.selectBySelect(bcode,scode,tcode);
		//System.out.println(cc);
	    model.addAttribute("carList", cc);
		
	  //查询所有品牌名称
	  		List<Brand> bl= brandService.showAllBrand();
	  		List<String> ls = new ArrayList<>();
	  		for(int i=0;i<bl.size();i++){
	  			ls.add(bl.get(i).getBrand_name());
	  		}
	  		model.addAttribute("brandList", ls); 
	  		
	  		//查询所有车系名称
	  		List<String> sl = serialService.selectSName();
	  		model.addAttribute("serialList", sl);
	  		
	  		//查询所有车型
	  		List<String> tl = cartypeService.selectCTName();
	  		model.addAttribute("typeList", tl);
	  		return "forward:/list.jsp";
	  		
	}
	
	@RequestMapping(value="/findone.do/{id}")  //点击租车查询车辆信息并存入session中
	public String findone(@PathVariable String id,HttpServletRequest request){
		//System.out.println(id);
	    String s = id.substring(0, id.indexOf(".do"));
	    //System.out.println(s);
		Company_car cc=ccService.findCompany_carById(s);
		//System.out.println(cc);
		HttpSession session = request.getSession();
		session.setAttribute("car", cc);
		//System.out.println(cc);
		return "forward:/rentinfor/list_rent.do";
	}
	@ResponseBody
	@RequestMapping(value="brand.do")
	public void brandSelect(String brand,HttpServletResponse response) {
		//System.out.println("brand: "+brand);
		String m = brand;
		List<String> list=f.sel(m);
		//System.out.println("list.size()"+list.size());
		//for (String s : list) {
		//	System.out.println(s);
		//}
		response.setContentType("text/html;charset=UTF-8");
		ObjectMapper om = new ObjectMapper();
			try {
				
				response.getWriter().println(om.writeValueAsString(list));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void test(){
//		List<Company_car> cc = ccService.selectBySelect("大众",null,null );
//		System.out.println(cc);
		List<Brand> bl= brandService.showAllBrand();
		List<String> ls = new ArrayList<>();
		for(int i=0;i<bl.size();i++){
			ls.add(bl.get(i).getBrand_name());
		}
		//System.out.println(ls);
	}
}

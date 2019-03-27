package com.myweb.app.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myweb.app.domain.Area;
import com.myweb.app.domain.Company_car;
import com.myweb.app.domain.Order_car;
import com.myweb.app.service.LeaseService;

@Controller
@RequestMapping(value="/rentinfor")
public class RentInforController {
	
	@Autowired
	private LeaseService leaseservice;
	
	@RequestMapping(value="/list_rent.do")
	public String onload(HttpServletRequest request,Model model){
		
		HttpSession session=request.getSession();
		Company_car car = (Company_car) session.getAttribute("car");
//		Company_car car = new Company_car("7e8eae25293f4977b48697afe2d7b6ce","01e224351b1242c9bdc327389d5b6243","现代伊兰特"
//				,"SATHREE","hyundai","ELANTRA",220.00,280.00,650.00,"ZD","1.6T",5,3,"hyunda_ylt.jpg",0,"黑色");
		String leaseid=car.getLease_id();
	
		System.out.println(leaseid+"su");
		List<Area> citys = leaseservice.selectCity(leaseid);
		List<String> names =leaseservice.selectLease_address(leaseid, (citys.get(0)).getT_no());
		//session.setAttribute("car", car);
		
		
		model.addAttribute("car", car);
		model.addAttribute("citys",citys);
		model.addAttribute("names",names);
		return "forward:/rent_car_info.jsp";
	}
  @RequestMapping(value="selectbriefname.do",produces="application/json;charset=utf-8")
  @ResponseBody
  public String selectAddress(HttpServletRequest request,Model model) throws JsonGenerationException, JsonMappingException, IOException{
	  ObjectMapper objectMapper = new ObjectMapper();
	  
	  HttpSession session=request.getSession();
	  Company_car car = (Company_car) session.getAttribute("car");
//	  Company_car car = new Company_car("7e8eae25293f4977b48697afe2d7b6ce","01e224351b1242c9bdc327389d5b6243","现代伊兰特"
//				,"SATHREE","hyundai","ELANTRA",220.00,280.00,650.00,"ZD","1.6T",5,3,"hyunda_ylt.jpg",0,"黑色");
	  String leaseid=car.getLease_id();
	  String city = request.getParameter("city");
	  List<String> name = leaseservice.selectLease_address(leaseid, city);
	  System.out.println(name);
	  String names = objectMapper.writeValueAsString(name);
	  return names;
  }
  @RequestMapping(value="/ordercar.do")
  public String ordercar(HttpServletRequest request,Order_car order_car,Model model) throws ParseException{
	      
	  
	      System.out.println(order_car);
	      SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	      SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
	      String takeclock = request.getParameter("takeclock");
	      String returnclock = request.getParameter("returnclock");
	      String take_time = st.format(order_car.getOrder_start_time())+" "+takeclock;
	      String return_time = st.format(order_car.getOrder_end_time())+" "+returnclock;
	      
	      order_car.setOrder_start_time(sd.parse(take_time));
	      order_car.setOrder_end_time(sd.parse(return_time));
		  HttpSession session=request.getSession();
		  Company_car car123 = (Company_car) session.getAttribute("car");
		  System.out.println(car123);
//		  Company_car car = new Company_car("7e8eae25293f4977b48697afe2d7b6ce","01e224351b1242c9bdc327389d5b6243","现代伊兰特"
//					,"SATHREE","hyundai","ELANTRA",220.00,280.00,650.00,"ZD","1.6T",5,3,"hyunda_ylt.jpg",0,"黑色");
		  order_car.setCar(car123);
		  session.setAttribute("ordercar", order_car);
		  
		  model.addAttribute("cars",car123);
		  System.out.println(order_car);
	  return "forward:/infor.jsp";
  }
  @InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));//true:允许输入空值，false:不能为空值
	}
}

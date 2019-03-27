package com.myweb.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.app.domain.Login;
import com.myweb.app.serviceimp.LoginServiceImpl;
import com.myweb.app.serviceimp.MemberServiceImp;

@Controller
@RequestMapping(value="/login")
public class LoadController {
	@Autowired
	private LoginServiceImpl ls;
	@Autowired
	private MemberServiceImp ms;
	
	HttpSession session;
	@RequestMapping(value= "/load.do")
    public String loging(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login l = new Login();
		l.setUsername(username);
		Date date = new Date();
		String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
		l.setDate(d);
		//System.out.println(l);
		//System.out.println("*****************"+username);
		System.out.println(password);
		int count = ms.findUser(username, password);
	    session = request.getSession();
		//System.out.println("*****************"+count);
		if(count>0){
			session.setAttribute("username", username);	
			//System.out.println(session.getAttribute("username"));
			ls.addLogin(l);
			return "redirect:/index.jsp";
			
		}
		else{
			return "redirect:/index.jsp";
		}
	}
	@RequestMapping(value= "/remove")
	public String relogin(){    //登录后点击退出
		session.removeAttribute("username");
		return "redirect:/index.jsp";
	}
	
	@RequestMapping(value="/registe.do")
	public String registe(HttpServletRequest request){
		System.out.println("++++++++++++++++++ "+request.getParameter("gender"));
	
		String id = UUID.randomUUID().toString().trim().replaceAll("-", ""); //生成随机32位编号
		//session.setAttribute("member_id", id);
		String mobile_number = request.getParameter("mobile");
		String register = request.getParameter("realname");
		int sex = Integer.parseInt(request.getParameter("gender"));
		String register_password = request.getParameter("password");
		ms.registe(id,mobile_number, register, sex, register_password);
		System.out.println("mobile_number: "+mobile_number);
		System.out.println("register: "+register);
		System.out.println("sex: "+sex);
		System.out.println("register_password: "+register_password);
		return "redirect:/index.jsp";
   }
}

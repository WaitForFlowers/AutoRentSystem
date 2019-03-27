package com.myweb.app.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Login;

import com.myweb.app.mapper.LoginMapper;
import com.myweb.app.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginMapper lm;
	
	@Override
	public void addLogin(Login l) {
		// TODO Auto-generated method stub
		lm.addLogin(l);
	}

	
}

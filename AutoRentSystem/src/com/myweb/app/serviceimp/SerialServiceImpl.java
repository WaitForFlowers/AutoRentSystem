package com.myweb.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.mapper.SerialMapper;
import com.myweb.app.service.SerialService;


@Service
public class SerialServiceImpl implements SerialService {

	@Autowired
	private SerialMapper serialMapper;
	@Override
	 public List<String> selectSName(){
		 return serialMapper.selectSName();
	 }
	@Override
	public String selectSCodeByName(String serial) {
		
		return serialMapper.selectSCodeByName(serial);
	}
}

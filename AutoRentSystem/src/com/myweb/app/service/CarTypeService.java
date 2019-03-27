package com.myweb.app.service;

import java.util.List;

public interface CarTypeService {
	List<String> selectCTName();
	  String selectTCodeByName(String type);
}

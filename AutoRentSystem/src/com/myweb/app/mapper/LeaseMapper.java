package com.myweb.app.mapper;

import java.util.List;
import java.util.Map;

import com.myweb.app.domain.Area;

public interface LeaseMapper {
  
	List<Area> selectCity(String leaseid);

	List<String> selectLease_address(Map map);
}

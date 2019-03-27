package com.myweb.app.service;

import java.util.List;

import com.myweb.app.domain.Area;

public interface LeaseService {

      List<Area> selectCity(String leaseid);
	
     List<String>  selectLease_address(String leaseid,String city);
}

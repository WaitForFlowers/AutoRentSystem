package com.myweb.app.serviceimp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Area;
import com.myweb.app.mapper.LeaseMapper;
import com.myweb.app.service.LeaseService;

@Service
public class LeaseServiceImp implements LeaseService{
  @Autowired
  private LeaseMapper leasemapper;
  @Override
  public List<Area> selectCity(String leaseid) {
	  
    return leasemapper.selectCity(leaseid);
    
  }
  @Override
  public  List<String> selectLease_address(String leaseid,String city) {
	Map map=new HashMap();
	map.put("leaseid",leaseid);
	map.put("city", city);
    return leasemapper.selectLease_address(map);
	  
  }
}

package com.myweb.app.mapper;

import java.util.List;

public interface CarTypeMapper {
   List<String> selectCTName();
   
   String selectTCodeByName(String type);
}

package com.myweb.app.mapper;

import java.util.List;

public interface SerialMapper {
   List<String> selectSName();
   
   String selectSCodeByName(String serial);
}

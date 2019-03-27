package com.myweb.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myweb.app.domain.Member;

public interface MemberMapper {
	List<Member> findAll();

	List<Member> findByPage(int index);

	void addMember(Member m);

	void updateMember(Member member);

	Member showMemberById(String id);

	void deleteById(String id);

	List<Member> searchBox(String condition);

	List<Member> findByType(String type);
	
	int findUser(@Param("username")String username,@Param("password")String password);  //验证登录是否成功
	
	//注册会员
	void registe(@Param("id")String id,@Param("mobile_number")String mobile_number
			,@Param("register")String register,@Param("sex")int sex
			,@Param("register_password")String register_password);
}

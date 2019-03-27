package com.myweb.app.service;

import java.util.List;

import com.myweb.app.domain.Member;

public interface MemberService {
	List<Member> findAll();

	List<Member> findByPage(int index);

	void addMember(Member m);

	void updateMember(Member member);

	Member showMemberById(String id);

	void deleteById(String id);
	
	List<Member> searchBox(String condition);
	
	List<Member> findByType(String type);
	
	int findUser(String username,String password);   //验证登录是否成功
	
	void registe(String id,String mobile_number,String register,int sex,String register_password); //注册会员
}

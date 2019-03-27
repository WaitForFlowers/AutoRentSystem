package com.myweb.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.app.domain.Member;
import com.myweb.app.mapper.MemberMapper;
import com.myweb.app.service.MemberService;

@Service
public class MemberServiceImp implements MemberService {
	@Autowired
	private MemberMapper mm;

	@Override
	public List<Member> findAll() {
		return mm.findAll();
	}
	
	//注册会员
	@Override
	public void registe(String id,String mobile_number, String register, int sex, String register_password) {
		mm.registe(id,mobile_number, register, sex, register_password);
		System.out.println("id: "+id);
	}

	@Override
	public List<Member> findByPage(int index) {
		return mm.findByPage(index);
	}

	@Override
	public void addMember(Member m) {
		mm.addMember(m);

	}

	@Override
	public void updateMember(Member member) {
		mm.updateMember(member);
	}

	@Override
	public Member showMemberById(String id) {
		return mm.showMemberById(id);
	}

	@Override
	public void deleteById(String id) {
		mm.deleteById(id);
	}

	@Override
	public List<Member> searchBox(String condition) {
		return mm.searchBox(condition);
	}

	@Override
	public List<Member> findByType(String type) {
		return mm.findByType(type);
	}

	@Override
	public int findUser(String username, String password) {   //验证登录是否成功
		// TODO Auto-generated method stub
		return mm.findUser(username, password);
	}
}

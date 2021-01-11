package com.mycompany.journal.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.journal.member.mapper.MemberSQLMapper;
import com.mycompany.journal.vo.MemberVo;

@Service
public class MemberServiceImpl {
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	public void signUp(MemberVo vo) {
		
		memberSQLMapper.insert(vo);
		
	}
	
	public MemberVo signIn(MemberVo param) {
		
		MemberVo result = memberSQLMapper.selectByIdAndPw(param);
		
		return result;
	}
}
package com.mycompany.journal.member.mapper;

import com.mycompany.journal.vo.MemberVo;

public interface MemberSQLMapper {
	
	public void insert(MemberVo vo);
	
	public MemberVo selectByIdAndPw(MemberVo vo);
	
	public MemberVo selectByNo(int no);
}
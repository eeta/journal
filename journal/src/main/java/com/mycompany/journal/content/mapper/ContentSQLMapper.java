package com.mycompany.journal.content.mapper;

import java.util.ArrayList;

import com.mycompany.journal.vo.ContentVo;

public interface ContentSQLMapper {
	
	// 글 작성
	public void insert(ContentVo vo);
	
	// 글 목록 보기
	public ArrayList<ContentVo> selectAll();
	
	// 글보기
	public ContentVo selectByNo(int no);
}
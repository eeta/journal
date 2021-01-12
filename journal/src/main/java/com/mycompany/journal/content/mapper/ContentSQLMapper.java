package com.mycompany.journal.content.mapper;

import java.util.ArrayList;

import com.mycompany.journal.vo.ContentVo;

public interface ContentSQLMapper {
	
	public void insert(ContentVo vo);
	
	public ArrayList<ContentVo> selectAll();

}
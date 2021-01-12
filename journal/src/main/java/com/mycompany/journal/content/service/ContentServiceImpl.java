package com.mycompany.journal.content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.journal.content.mapper.ContentSQLMapper;
import com.mycompany.journal.vo.ContentVo;

@Service
public class ContentServiceImpl {
	
	@Autowired
	private ContentSQLMapper contentSQLMapper;
	
	public void writeContent(ContentVo vo) {
		
		contentSQLMapper.insert(vo);
		
	}
}
package com.mycompany.journal.content.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.journal.content.mapper.ContentSQLMapper;
import com.mycompany.journal.member.mapper.MemberSQLMapper;
import com.mycompany.journal.vo.ContentVo;
import com.mycompany.journal.vo.MemberVo;

@Service
public class ContentServiceImpl {
	
	@Autowired
	private ContentSQLMapper contentSQLMapper;
	
	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	public void writeContent(ContentVo vo) {
		
		contentSQLMapper.insert(vo);
		
	}
	
	public ArrayList<HashMap<String, Object>> getContentList() {
		
		ArrayList<HashMap<String, Object>> resultList = new ArrayList<HashMap<String,Object>>();
		
		ArrayList<ContentVo> contentList = contentSQLMapper.selectAll();
		
		for (ContentVo contentVo : contentList) {
			int member_no = contentVo.getMember_no();
			
			MemberVo memberVo = memberSQLMapper.selectByNo(member_no);
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberVo", memberVo);
			map.put("contentVo", contentVo);
			
			resultList.add(map);
		}
		
		return resultList;
	}
	
	public HashMap<String,Object> getContent(int contentNo){
		
		// 출력 데이터 받아 오기
		ContentVo contentVo = contentSQLMapper.selectByNo(contentNo);
		int member_no = contentVo.getMember_no();
		MemberVo memberVo = memberSQLMapper.selectByNo(member_no);
		
		HashMap<String,Object> map = new HashMap<String,Object>(); 
		map.put("memberVo", memberVo);
		map.put("contentVo", contentVo);
		
		return map;
	}
	
}
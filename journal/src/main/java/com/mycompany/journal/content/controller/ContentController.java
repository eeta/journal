package com.mycompany.journal.content.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.journal.content.service.ContentServiceImpl;
import com.mycompany.journal.vo.ContentVo;
import com.mycompany.journal.vo.MemberVo;

@Controller
@RequestMapping("/content/*")
public class ContentController {
	
	@Autowired
	private ContentServiceImpl contentService;
	
	@RequestMapping("main_page.do")
	public String mainPage(Model model) {
		
		ArrayList<HashMap<String, Object>> resultList = contentService.getContentList();
		
		model.addAttribute("resultList", resultList);
		
		return "content/main_page";
	}
	
	@RequestMapping("write_content_page.do")
	public String writeContentPage() {
		
		return "content/write_content_page";
	}
	
	@RequestMapping("write_content_process.do")
	public String writeContentProcess(HttpSession session, ContentVo param) {
		
		MemberVo sessionUser = (MemberVo)session.getAttribute("sessionUser");
		
		int member_no = sessionUser.getMember_no();
		
		param.setMember_no(member_no);
		
		contentService.writeContent(param);
		
		return "redirect:./main_page.do";
	}
	
	@RequestMapping("read_content_page.do")
	public String readContentPage(Model model,int content_no) {
		
		HashMap<String, Object> map = contentService.getContent(content_no);
		
		model.addAttribute("result",map);
		
		return "content/read_content_page";
	}
}
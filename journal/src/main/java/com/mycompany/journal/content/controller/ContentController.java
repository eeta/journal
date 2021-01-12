package com.mycompany.journal.content.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String mainPage() {
		
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
}
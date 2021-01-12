package com.mycompany.journal.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.journal.content.service.ContentServiceImpl;
import com.mycompany.journal.vo.ContentVo;

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
	public String writeContentProcess(ContentVo param) {
		
		contentService.writeContent(param);
		
		return "redirect:./main_page.do";
	}
}
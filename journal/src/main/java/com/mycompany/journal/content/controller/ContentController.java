package com.mycompany.journal.content.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content/*")
public class ContentController {
	
	@RequestMapping("main_page.do")
	public String mainPage() {
		
		return "content/main_page";
	}
}
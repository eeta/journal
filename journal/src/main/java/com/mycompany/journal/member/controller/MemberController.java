package com.mycompany.journal.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@RequestMapping("sign_in_page.do")
	public String signInPage() {
		
		return "member/sign_in_page";
	}
	
	@RequestMapping("sign_up_page.do")
	public String SignUpPage() {
		
		return "member/sign_up_page";
	}
}
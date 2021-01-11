package com.mycompany.journal.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.journal.member.service.MemberServiceImpl;
import com.mycompany.journal.vo.MemberVo;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberServiceImpl memberService;
	
	@RequestMapping("sign_in_page.do")
	public String signInPage() {
		
		return "member/sign_in_page";
	}
	
	@RequestMapping("sign_up_page.do")
	public String signUpPage() {
		
		return "member/sign_up_page";
	}
	
	@RequestMapping("sign_up_process.do")
	public String signUpProcess(MemberVo param) {
		
		memberService.signUp(param);
		
		return "member/sign_up_complete_page";
	}
}
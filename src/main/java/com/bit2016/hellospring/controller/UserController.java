package com.bit2016.hellospring.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

// request mapping(type(class를 뜻함) + method) 
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/joinForm")
	public String joinForm() {
		return "/WEB-INF/views/joinForm.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) {
		System.out.println(vo);
		return "redirect:/user/joinsuccess";		// request.getContextPath();
	}
	
	@ResponseBody
	@RequestMapping("/joinsuccess")
	public String joinSuccess() {
		return "joinSuccess";
	}
}

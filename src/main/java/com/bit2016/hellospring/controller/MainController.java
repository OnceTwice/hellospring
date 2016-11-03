package com.bit2016.hellospring.controller;

import java.io.*;

import javax.servlet.http.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@ResponseBody
	// 메서드 단독 request mapping
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	
	// 비추천
	// 기술이 침투되어 있다.
	@ResponseBody
	@RequestMapping("/main2")
	public String main2(HttpServletRequest request, Writer out) {
		String name = request.getParameter("name");
		return "main " + name;
	}
}

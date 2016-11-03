package com.bit2016.hellospring.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

// request mapping(type 단독)
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "guestbook:list";
	}
	
	@ResponseBody
	@RequestMapping
	public String add() {
		return "guestbook:add";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "guestbook:delete";
	}
}

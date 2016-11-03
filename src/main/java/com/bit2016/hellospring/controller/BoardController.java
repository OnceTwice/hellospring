package com.bit2016.hellospring.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam("name") String name, @RequestParam(value="content", required=true, defaultValue="aasdfiu") String content) {
		return "board:write : " + name + " : " + content;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="no", required=true, defaultValue="-1") int no) {
		return "board:delete : " + no;
	}
	
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") int no) {
		return "board:view : " + no;
	}
}

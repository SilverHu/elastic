package com.elastic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	
	@RequestMapping("/index")
	@ResponseBody
	public Object index(){
		return "hello world!";
	}
}

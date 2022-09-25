package com.durgasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@RequestMapping(value="/hello",method = RequestMethod.POST)
	public String getHelloPage(@RequestParam String uname,ModelMap map) {
		map.addAttribute("user",uname);
		return "sayhello";
	}

}

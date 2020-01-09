package com.das.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		System.out.println("Test Welcome");
		return new ModelAndView("welcome");
	}
}

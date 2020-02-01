package com.das.springboot.springbootdemo.controller;

import com.das.springboot.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@Autowired
	PersonService personService;

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		System.out.println("Test Welcome");
		System.out.println("person list:");
		personService.list().forEach(person -> System.out.println(person.getFirstName()));
		return new ModelAndView("welcome");
	}
}

package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	//http://localhost:8080/mvc
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {		
		String city = "soeul";		
		model.addAttribute("city", city );//Map구조의 데이터 저장 자료구조	
		model.addAttribute("code", "a12345" );//Map구조의 데이터 저장 자료구조	
		
		return "home";//논리적인 view 이름
	}
	
	//http://localhost:8080/mvc/test
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {		
		String msg = "hello world!";		
		model.addAttribute("msg", msg );//Map구조의 데이터 저장 자료구조	
		
		return "test";//논리적인 view 이름
	}
	
}



















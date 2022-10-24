package com.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// 모든 컨트롤러에서 발생하는 예외를 처리하는 클래스
@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("errormsg", "잘 좀 하자.. 리얼");
		mv.setViewName("errorPage");
		return mv;
	}
}

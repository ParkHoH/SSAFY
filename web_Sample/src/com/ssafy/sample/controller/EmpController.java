package com.ssafy.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.sample.model.service.EmpService;

public class EmpController {
	EmpService service;

	public void list(HttpServletRequest request, HttpServletResponse response) {
		service.selectAll();
	}

	public void read(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	
}

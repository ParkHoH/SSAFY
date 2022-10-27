package com.mvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.vo.Board;

//@RestController : @Controller + @ResponseBody(Java -> JSON으로 변환)
@RestController
@RequestMapping("/")
public class RestControllerTest {
	
	@GetMapping("/rest")
	public Board get() {
		Board b = new Board("111", "222", "rr", "2022-10-27", "this is test", "hi", 10);
		return b;
	}
	
	@PostMapping("/rest")
	public String post() {
		return "this is rest-post";
	}
	
	@PutMapping("/rest")
	public String put() {
		return "this is rest-put";
	}
	
	@DeleteMapping("/rest")
	public String delete() {
		return "this is rest-delete";
	}
	
	
}

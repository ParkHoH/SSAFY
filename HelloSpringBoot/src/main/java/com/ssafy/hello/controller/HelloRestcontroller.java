package com.ssafy.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestcontroller {
	@GetMapping("/resthello")
	public String hello() {
		return "Hello Rest Controller";
	}
}

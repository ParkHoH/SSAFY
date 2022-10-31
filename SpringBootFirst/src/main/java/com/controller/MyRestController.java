package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

//	@GetMapping("/hello")
//	public String hello() {
//		return "hello boot";
//	}
	
	@GetMapping("/hello")
	public Map<String, String> hello() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("test1", "value1");
		map.put("test2", "value2");
		map.put("test3", "value3");
		map.put("test4", "value4");
		map.put("test5", "value5");
		return map;
	}
}

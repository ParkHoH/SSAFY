package com.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.CustomerService;
import com.mvc.vo.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "CustomerRestController-Version 1")
public class CustomerRestController {
	@Autowired
	CustomerService service;

	@GetMapping("/customers")
	@ApiOperation(value = "selectAll", notes = "customer table의 모든 데이터입니다.")
	public ResponseEntity<?> selectAll() {
		List<?> list = service.selectAll();
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<Customer>>(service.selectAll(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/customers2")
	public List<Customer> selectAll2() {
		return service.selectAll();
	}
	
	@PostMapping("/customers")
	public Map insert(@RequestBody Customer c) {
		service.insert(c);
		
		Map<String,	String> map = new HashMap<String, String>();
		map.put("result", "등록 성공");
		return map;
	}

	@GetMapping("/customers/{userid}")
	public Customer selectOne(@PathVariable(value = "userid") String userId) {
		return service.selectOne(userId);
	}
	
	@DeleteMapping("/customers/{num}")
	public Map delete(@PathVariable String num) {
		service.delete(num);
		
		Map<String,	String> map = new HashMap<String, String>();
		map.put("result", "삭제 성공");
		return map;
	}

	@PutMapping("/customers")
	public Map update(@RequestBody Customer c) {
		int x = service.update(c);
		
		Map<String,	String> map = new HashMap<String, String>();
		map.put("result", "수정 성공");
		return map;
	}

	@GetMapping("/customers/find/{address}")
	public List<Customer> findByAddress(@PathVariable String address) {
		return service.findByAddress(address);
	}
}

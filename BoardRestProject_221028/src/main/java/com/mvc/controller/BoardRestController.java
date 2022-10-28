package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.BoardService;
import com.mvc.vo.Board;

@RestController
public class BoardRestController {
	
	@Autowired
	BoardService service;// interface type
	
	@GetMapping("/board")
	public ResponseEntity<?> list() {
		List<Board> list = service.selectAll();
		
		if (list != null && !list.isEmpty()) {
			return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/board/{num}")
	public ResponseEntity<?> read(@PathVariable String num) {
		Board b = service.selectOne(num);
		
		if (b != null) {
			return new ResponseEntity<Board>(b, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/board")
	public void insert(@RequestBody Board b) {
		service.insert(b);
	}
}

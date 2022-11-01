package com.todo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.service.TodoService;
import com.todo.vo.TodoDTO;

import io.swagger.annotations.ApiOperation;

@RestController
public class TodoController {
	TodoService ts;
	
	@Autowired
	public TodoController(TodoService ts) {
		this.ts = ts;
	}
 
	@GetMapping("/todo")
	public List<TodoDTO> allList() throws Exception {
		List<TodoDTO> result = ts.allList();
		return result;
	}
	
	@GetMapping("/todo/{num}")
	public TodoDTO findByNum(@PathVariable String num) throws Exception {
		TodoDTO result = ts.findByNum(num);
		return result;
	}
	
	@GetMapping("/todo/{condition}/{word}")
    public ResponseEntity<?> findGet(@PathVariable("condition") String condition, @PathVariable("word") String word) throws Exception {
        Map<String, String> param = new HashMap<>();
        if (condition.equals("num")) {
            param.put(condition, word);
        } else {
            param.put("condition", condition);
            param.put("word", word);
        }

        List<TodoDTO> result = ts.find(param);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

	@PostMapping("/todo")
	public void create(@ModelAttribute TodoDTO param) throws Exception {
		ts.add(param);
	}

	@PutMapping("/todo")
	public void update(@ModelAttribute TodoDTO param) throws Exception {
		ts.modify(param);
	}

	@PutMapping("/complete/{num}")
	public void complete(@PathVariable String num) throws Exception {
		ts.complete(num);
	}
	
	@DeleteMapping("/todo/{num}")
	public void delete(@PathVariable String num) throws Exception {
		ts.delete(num);
	}

	@DeleteMapping("/todos")
	public void deleteAll() throws Exception {
		ts.deleteAll();
	}
}

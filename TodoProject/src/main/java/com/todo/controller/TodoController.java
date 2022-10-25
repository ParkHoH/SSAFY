package com.todo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.todo.service.TodoService;
import com.todo.vo.Todo;

@Controller
public class TodoController {
	TodoService service;
	
	@Autowired
	public TodoController(TodoService service) {
		this.service = service;
	}

	@GetMapping(value = "list")
	public String list(Model model) {
		List<Todo> list =  service.allList();
		model.addAttribute("list", list);
		return "list";
	}
	
	@PostMapping(value = "search")
	public String search(Model model, String condition, String word, HttpServletRequest req) throws Exception {
		List<Todo> list = (condition.equals("id")) ? service.findById(word) : service.findByContent(word);
		model.addAttribute("list", list);
		return "list";
	}
	
	@GetMapping(value = "read")
	public String findByNum(Model model, @RequestParam String num) throws Exception {
		Todo todo = service.findByNum(num);
		model.addAttribute("todo", todo);
		return "read";
	}
	
	@GetMapping(value = "insert")
	public String insertForm() throws Exception {
		return "insert";
	}

	@PostMapping(value = "insert")
	public String insert(@ModelAttribute Todo todo) throws Exception {
		service.add(todo);
		return "redirect:/list";
	}
	
	@GetMapping(value = "modify")
	public String modifyForm(Model model, @RequestParam String num) throws Exception {
		Todo todo = service.findByNum(num);
		model.addAttribute("todo", todo);
		return "modify";
	}

	@PostMapping(value = "modify")
	public String modify(@ModelAttribute Todo todo) throws Exception {
		service.modify(todo);
		return "redirect:/list";
	}

	@GetMapping(value = "delete")
	public String delete(@RequestParam String num) throws Exception {
		service.delete(num);
		return "redirect:/list";
	}

	@GetMapping(value = "complete")
	public String complete(@RequestParam String num, HttpServletRequest req) throws Exception {
		service.complete(num);
		return "redirect:" + req.getHeader("Referer");
	}
	
	@GetMapping(value = "deleteAll")
	public String deleteAll() throws Exception {
		service.deleteAll();
		return "redirect:/list";
	}
}

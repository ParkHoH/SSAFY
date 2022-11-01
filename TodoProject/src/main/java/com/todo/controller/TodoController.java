package com.todo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.service.TodoService;
import com.todo.vo.TodoDTO;

@Controller
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	TodoService ts;
	
	@Autowired
	public TodoController(TodoService ts) {
		this.ts = ts;
	}

	@GetMapping(value = "/")
	public String main(Model model) throws Exception {
		return "redirect:/list";
	}
 
	@GetMapping(value = "/list")
	public String list(Model model) throws Exception {
		List<TodoDTO> result = ts.allList();
		model.addAttribute("list", result);
		return "list";
	}

	@GetMapping(value = "/find")
	public String findGet(@RequestParam Map<String, String> param, Model model) throws Exception {
		List<TodoDTO> result = ts.find(param);
		model.addAttribute("b", result.get(0));
		return "read";
	}

	@PostMapping(value = "/find")
	public String findPost(@RequestParam Map<String, String> param, Model model) throws Exception {
		List<TodoDTO> result = ts.find(param);

		model.addAttribute("list", result);
		return "list";
	}

	@GetMapping(value = "/create")
	public String createForm() {
		return "insert";
	}

	@PostMapping(value = "/create")
	public String create(@ModelAttribute TodoDTO param) throws Exception {
		boolean result = ts.add(param);
		return "redirect:/list";
	}

	@GetMapping(value = "/update")
	public String updateForm(@RequestParam String num, Model model) throws Exception {
		Map<String, String> param = new HashMap<>();
		param.put("num", num);
		TodoDTO result = ts.find(param).get(0);
		model.addAttribute("todo", result);
		return "update";
	}

	@PostMapping(value = "/update")
	public String update(@ModelAttribute TodoDTO param) throws Exception {
		boolean result = ts.modify(param);
		return "redirect:/list";
	}

	@GetMapping(value = "/delete")
	public String delete(String num) throws Exception {
		boolean result = ts.delete(num);
		return "redirect:/list";
	}

	@GetMapping(value = "/complete")
	public String complete(@RequestParam String num) throws Exception {
		boolean result = ts.complete(num);
		return "redirect:/list";
	}
}

package com.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.mvc.service.BoardService;
import com.mvc.vo.Board;

@RestController
public class BoardController {
	
	@Autowired
	BoardService service;// interface type
	
	@GetMapping("/board")
	public ArrayList<Board> list(Model model) {
		ArrayList<Board> list = service.selectAll();
		return list;
	}

	@GetMapping("/board/{num}")
	public Board read(@PathVariable String num, Model model) {
		Board b = service.selectOne(num);
		return b;
	}

//	@GetMapping(value="insert")
//	public String insertForm() {
//		return "insert";
//	}

	@PostMapping("/board")
	public void insert(@ModelAttribute Board b) {//클라이언트로부터 받아올 값들을 vo로 한번에 받아옴.	
		service.insert(b);
	}
	
//	@GetMapping(value="login")
//	public String login() {
//		return "loginForm";
//	}

//	@PostMapping(value="login")
//	public String login2(HttpSession session, String id) {
//		session.setAttribute("id", id);
//		return "redirect:/list";
//	}
//	
//	@GetMapping(value="logout")
//	public String logout(HttpSession session) {
//		session.setAttribute("id", null);
//		return "redirect:/list";
//	}

	@PostMapping("/search/{condition}/{word}")
	public ArrayList<Board> search(Model model, @PathVariable String condition, @PathVariable String word) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("condition", condition);
		map.put("word", word);
		
		ArrayList<Board> list = service.search(map);
		return list;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("errormsg", "잘 좀 하자");
		mv.setViewName("errorPage");
		return mv;
	}
	
//	@GetMapping(value = "redirect")
//	public String redirect(RedirectAttributes attr) {
////		String flag = "seoul-london";
////		attr.addAttribute("flag", flag);
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		
//		attr.addFlashAttribute("list", list);
////		attr.addAttribute(list);
//		
//		return "redirect:/result";
//	}
//	
//	@GetMapping(value = "result")
//	public String result(HttpServletRequest req, Model model) {
////		model.addAttribute("flag", req.getParameter("flag"));
//		Map<String, ?> fmap = RequestContextUtils.getInputFlashMap(req);
//		
//		if (fmap != null) {
//			ArrayList<Integer> list = (ArrayList<Integer>) fmap.get("list");
//			model.addAttribute("list", list);
//		}
//		
////		model.addAttribute("flag", req.getParameter("flag"));
//		return "result";
//	}
	
	@DeleteMapping("/board/{num}")
	public void delete(@PathVariable String num) {
		service.delete(num);
	}

//	@GetMapping(value="modify")
//	public String modify(@RequestParam String num) {
////		service.delete(num);
//		return "redirect:/list";
//	}
}

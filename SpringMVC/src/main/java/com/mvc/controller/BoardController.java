package com.mvc.controller;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//FrontController에게서 요청을 넘겨 받아 Service에게 넘김
//나중에 리턴되는 데이터를 받아서 jsp로 넘겨줘야 함
import com.mvc.model.service.BoardService;
import com.mvc.model.vo.Board;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;// interface type
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<Board> list = service.selectAll();
		model.addAttribute("list", list);
		return "list";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
//	public String read(@RequestParam("num") String num, Model model) { // 아래랑 같은 의미
//	public String read(@RequestParam String num, Model model) { // 아래랑 같은 의미
		public String read(String num, Model model) {
		Board b = service.selectOne(num);
		model.addAttribute("b", b);
		return "read";

	}

	@GetMapping(value="insert")
	public String insertForm() {
		return "insert";		
	}

	@GetMapping(value="login")
	public String login() {
		return "loginForm";
	}
	
	@PostMapping(value="insert")
	public String insertProcess(Board b) {//클라이언트로부터 받아올 값들을 vo로 한번에 받아옴.	
			service.insert(b);
			return "redirect:/list";
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) {
		try {
			String num = request.getParameter("num");
			int x = service.delete(num);

			if (x > 0) {

				request.setAttribute("msg", "글 삭제 성공");
				RequestDispatcher dispatcher = request.getRequestDispatcher("list.bod");
				try {
					dispatcher.forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

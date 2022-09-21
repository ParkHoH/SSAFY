package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 클라이언트로부터 들어오는 요청을 받아서 구분한 뒤 컨트롤러에게 넘김
// http://hocalhost:8080/context-root/list.bod
// http://hocalhost:8080/context-root/read.bod
// http://hocalhost:8080/context-root/insertForm.bod
// http://hocalhost:8080/context-root/insertProcess.bod
@WebServlet("*.bod")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BoardController con;
	
    public BoardFrontController() {
    	con = new BoardController();
    }
    
    private void process(HttpServletRequest request, HttpServletResponse response) {
    	// 1. 클라이언트가 보내는 url 구분
    	String reqString = request.getServletPath();
//    	System.out.println(reqString);
    	
    	if (reqString.equals("/list.bod")) {
    		con.list(request, response);
			
		} else if (reqString.equals("/read.bod")) {

		} else if (reqString.equals("/insertForm.bod")) {
			
		} else if (reqString.equals("/insertProcess.bod")) {
			
		}
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

}

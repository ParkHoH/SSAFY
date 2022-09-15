//package com.ssafy.hello;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//// 추상 클래스는 추상 메서드를 가지고 있어야 하지만, HtppServlet 그냥 원하는 것만 구현하라는 의미이기 때문에 괜찮음
//public class lala extends HttpServlet {
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//	}
//
//	
//	
////	@Override // GenericServlet 를 상속한 경우 사용
////	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
////		// 한글의 경우 인코딩 되어 들어오기 때문에 다시 디코딩할 필요가 있음
////		// 다만 get, post 방식이 각각 디코딩 하는 방식이 다르기 때문에 구분할 필요가 있음
////	}
//
//}

package com.aop.board;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BoardTracker {
	
	@Before("execution(* delete(int)) || execution(* write(String))")
	public void loginCheck() {
		System.out.println("로그인을 체크합니다.");
	}
	
	@Before("execution(* read(int))")
	public void logCheck() {
		System.out.println("로그를 남깁니다.");
	}
	
}

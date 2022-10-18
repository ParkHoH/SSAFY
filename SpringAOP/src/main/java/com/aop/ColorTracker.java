package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Aspect 객체 (Advice: (what) + Pointcut: (when))를 가지고 있음
// pointcut과 일치하는 때가 되면 Advice가 weaving 되어 실행됨

@Aspect
public class ColorTracker {

	@Before("execution(void set*(*))")
	public void colorTrack(JoinPoint jp) { // Advice
		System.out.println("@Before advice 시작!");
		
//		System.out.println("target: " + jp.getTarget().getClass().getName());
//		System.out.println("method: " + jp.getSignature().getName());
//		System.out.println("args: " + jp.getArgs()[0]);
		
		System.out.println("@Before advice 끝!");
	}
	
	@Around("execution(String get*())")
	public Object getTracker(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("@Around advice 시작!");
		
		Object o = jp.proceed(); // 핵심 메서드 호출
		
		System.out.println("@Around advice 끝!");
		
		return o;
	}
	
	/*
	@After("execution(String get*())")
	public void getTracker(JoinPoint jp) {
		System.out.println("@After advice 시작!");
		
		System.out.println("target: " + jp.getTarget().getClass().getName());
		System.out.println("method: " + jp.getSignature().getName());
//		System.out.println("args: " + jp.getArgs()[0]);
		
		System.out.println("@After advice 끝!");
	}
	*/
}

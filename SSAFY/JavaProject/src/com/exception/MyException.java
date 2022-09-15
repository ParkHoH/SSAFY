package com.exception;

// 사용자 정의 예외 클래스. Exception 클래스를 상속 받아야 함.
public class MyException extends Exception {
	String message;
	
	public MyException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyException [message=" + message + "]";
	}
	
}

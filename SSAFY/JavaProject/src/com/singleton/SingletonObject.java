package com.singleton;

// 싱글턴 패턴 클래스: 객체 생성을 한 번만 수정하고 그 이후로는 생성된 객체 공유해서 사용
public class SingletonObject {
	// 싱글턴 패턴 객체 조건
	// 1. field : private static
	// 2. 생성자 : private
	// 3. 메소드 : public static
	private static SingletonObject singleton = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getSingleton() {
		return singleton;
	}
	
}

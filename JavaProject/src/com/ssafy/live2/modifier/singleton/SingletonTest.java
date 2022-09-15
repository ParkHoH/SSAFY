package com.ssafy.live2.modifier.singleton;

class SingletonClass {
	// TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
	private static SingletonClass singleton = new SingletonClass();

	private SingletonClass() {	}

	static SingletonClass getSingleton() {
		return singleton;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	// END:
}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO:SingletonClass를 사용해보세요.
//    	SingletonClass sc = new SingletonClass();
		SingletonClass singleton1 = SingletonClass.getSingleton();
		SingletonClass singleton2 = SingletonClass.getSingleton();

		singleton1.sayHello();
		System.out.println(singleton1 == singleton2);
		// END:
	}
}

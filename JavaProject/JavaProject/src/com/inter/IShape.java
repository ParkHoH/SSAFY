package com.inter;

public interface IShape {
//	double PI = 3.141592; // public static final 생략
	
	double getArea(); // public abstract 생략
	
	double getCircum(); // public abstract 생략
	
	default void hello() {
		System.out.println("hello!");
	}
}

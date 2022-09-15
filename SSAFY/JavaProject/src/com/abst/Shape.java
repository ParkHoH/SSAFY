package com.abst;

public abstract class Shape {
	public abstract double getArea();
	
	public abstract double getCircum();
	
	public void hello() { // 추상 클래스 내에 있는 제대로 된 메서드
		System.out.println("hello!");
	}
}

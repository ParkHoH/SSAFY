package com.abst;

public class Circle extends Shape {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
	
	@Override
	public double getCircum() {
		return 2 * r * Math.PI;
	}
}

package com.object;

public class Circle {

	int radius;
	
	// default constructor
	public Circle() {
		this(0);
	}
	
	// constructor with parameters
	public Circle(int radius) {
		this.radius = radius;
		System.out.println("생성자 호출!");
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircum() {
		return 2 * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("circle1");
		System.out.println("- 넓이: " + circle1.getArea());
		System.out.println("- 둘레: " + circle1.getCircum());

		System.out.println("------------");
		
		Circle circle2 = new Circle(5);
		System.out.println("circle2");
		System.out.println("- 넓이: " + circle2.getArea());
		System.out.println("- 둘레: " + circle2.getCircum());
	}

}

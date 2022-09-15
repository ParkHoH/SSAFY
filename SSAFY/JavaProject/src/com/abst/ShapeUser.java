package com.abst;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
//		Shape s = new Shape(); // 불가능
		s[0] = new Circle(7);
		s[1] = new Rect(5, 6);
		s[2] = new Circle(8);

		for (Shape shape : s) {
			System.out.println(shape.getClass().getName());
			shape.hello();
			System.out.println("면적: " + String.format("%.3f", shape.getArea()));
			System.out.println("둘레: " + String.format("%.3f", shape.getCircum()));
			System.out.println("---------------");
		}
		
	}

}

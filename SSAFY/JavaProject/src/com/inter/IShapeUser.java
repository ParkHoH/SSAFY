package com.inter;

import com.object.Circle;

public class IShapeUser {

	public static void main(String[] args) {
		IShape[] iShape = new IShape[2]; // interface type
		iShape[0] = new ICircle(3);
		iShape[1] = new IRect(4, 5);
		
		for (IShape is : iShape) {
			System.out.println(is.getClass().getSimpleName());
			is.hello();
			System.out.println("면적: " + String.format("%.2f", is.getArea()));
			System.out.println("둘레: " + String.format("%.2f", is.getCircum()));
			System.out.println("---------------");
		}

	}

}

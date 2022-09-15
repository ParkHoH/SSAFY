package com.generic;

import com.abst.Circle;
import com.abst.Rect;
import com.abst.Shape;

public class GenericShape<X extends Shape> { // Shape 클래스를 상속하고 있는 자식 클래스만 가능
	private int num;
	private X what;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public X getWhat() {
		return what;
	}

	public void setWhat(X what) {
		this.what = what;
	}

	public static void main(String[] args) {
		GenericShape<Circle> circle = new GenericShape<>();
		GenericShape<Rect> rect = new GenericShape<>();
//		GenericShape<String> str = new GenericShape<>(); // 상속 관계가 존재하지 않기 때문에 불가능

		circle.setWhat(new Circle(3));
		rect.setWhat(new Rect(3, 4));

		System.out.println(circle.getWhat().getArea());
		System.out.println(rect.getWhat().getArea());

	}

}

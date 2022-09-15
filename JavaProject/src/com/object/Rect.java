package com.object;

public class Rect {

	int width;
	int height;
	
	public Rect() {}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}

	public int getCircum() {
		return 2 * width + 2 * height;
	}
	
	public static void main(String[] args) {
		Rect rect1 = new Rect();
		rect1.width = 3;
		rect1.height = 4;
		System.out.println("rect1");
		System.out.println("- 넓이: " + rect1.getArea());
		System.out.println("- 둘레: " + rect1.getCircum());

		System.out.println("------------");
		
		Rect rect2 = new Rect(5, 6);
		System.out.println("rect2");
		System.out.println("- 넓이: " + rect2.getArea());
		System.out.println("- 둘레: " + rect2.getCircum());
	}
	
}

package com.abst;

public class Rect extends Shape {
	int width;
	int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircum() {
		return 2 * width + 2 * height;
	}
}

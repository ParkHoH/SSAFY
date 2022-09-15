package com.inter;

public class IRect implements IShape {
	int width = 0;
	int height = 0;
	
	public IRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircum() {
		return 2 * (width + height);
	}
}

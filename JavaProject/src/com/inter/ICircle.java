package com.inter;

interface Seoul{}
class Boat{}

public class ICircle extends Boat implements IShape, Seoul {
	int r;
	
	public ICircle(int r) {
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

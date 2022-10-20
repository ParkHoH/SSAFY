package com.smart.phone;

public class Gallaxy implements SmartPhone{
	String model, color;
	int price;
	
	public Gallaxy(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void info() {
		System.out.println("Gallaxy: [model: " + model + ", price: " + price + ", color: " + color);
	}

}

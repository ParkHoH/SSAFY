package com.smart.phone;

public class IPhone implements SmartPhone{
	String model, color;
	int price;
	
	public IPhone(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void info() {
		System.out.println("IPhone: [model: " + model + ", price: " + price + ", color: " + color);
	}
}

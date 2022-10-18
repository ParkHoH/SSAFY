package com.coffee;

public class Coffeebean implements CoffeeShop{
	Americano americano;
	CaffeLatte caffelatte;
	
	public void setAmericano(Americano americano) {
		this.americano = americano;
	}
	
	public void setCaffelatte(CaffeLatte caffelatte) {
		this.caffelatte = caffelatte;
	}

	@Override
	public void info() {
		System.out.println(getClass().getName());
		americano.info();
		caffelatte.info();
	}

}

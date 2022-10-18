package com.coffee;

public class Starbucks implements CoffeeShop{
	// 주입 받아야 됨
	Americano americano;
	CaffeLatte caffelatte;
	
	public Starbucks(Americano americano, CaffeLatte caffelatte) {
		this.americano = americano;
		this.caffelatte = caffelatte;
	}

	@Override
	public void info() {
		System.out.println(getClass().getName());
		americano.info();
		caffelatte.info();
	}

}

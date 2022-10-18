package com.coffee.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Coffeebean implements CoffeeShop{
	// @Resource : 이름 기준으로 주입
	@Resource(name = "coffee3")
	Americano americano;
	
	@Resource(name = "coffee2")
	CaffeLatte caffelatte;
	
	@Override
	public void info() {
		System.out.println(getClass().getName());
		americano.info();
		caffelatte.info();
	}

}

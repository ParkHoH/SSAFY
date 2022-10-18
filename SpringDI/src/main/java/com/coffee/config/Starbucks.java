package com.coffee.config;

import org.springframework.stereotype.Component;

// @Component: xml 문서 안의 <bean> 태그를 대신해서 객체를 생성해줌
// @Component 사용 시 id를 지정하지 않으면 클래스명이 id가 되고 첫 번째 글자는 소문자로 바뀜
@Component
public class Starbucks implements CoffeeShop{
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

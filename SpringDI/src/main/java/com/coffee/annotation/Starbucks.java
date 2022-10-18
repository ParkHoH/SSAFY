package com.coffee.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component: xml 문서 안의 <bean> 태그를 대신해서 객체를 생성해줌
// @Component 사용 시 id를 지정하지 않으면 클래스명이 id가 되고 첫 번째 글자는 소문자로 바뀜
@Component
public class Starbucks implements CoffeeShop{
	// @Autowired: type 기준으로 주입됨. type -> 이름 -> Qualifier
	@Autowired
//	@Qualifier("coffee1")
	Americano americano;
	
	@Autowired
	@Qualifier("coffee4")
	CaffeLatte caffelatte;

	@Override
	public void info() {
		System.out.println(getClass().getName());
		americano.info();
		caffelatte.info();
	}

}

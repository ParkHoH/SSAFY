package com.coffee.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeApp {

	public static void main(String[] args) {
		// class path: src/main/resources
		// AnnotationConfigApplicationContext: 파라메터로 주어진 자바 클래스를 읽어서 필요한 객체 생성해줌
		ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeConfig.class);
		
		CoffeeShop starbucks = context.getBean("starbucks", CoffeeShop.class);
		CoffeeShop coffeebean = context.getBean("coffeebean", CoffeeShop.class);
		
		starbucks.info();
		System.out.println("----------------");
		coffeebean.info();
	}
}

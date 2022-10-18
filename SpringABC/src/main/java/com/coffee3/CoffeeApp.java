package com.coffee3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee.xml");
//		Coffee cof = context.getBean("coffee1", Coffee.class);
//		Coffee cof = (Coffee)context.getBean("coffee1"); <- 이렇게 써도 됨
//		cof.info();
	}

}

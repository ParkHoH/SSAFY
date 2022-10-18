package com.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee.xml");
		Coffee cof = context.getBean("coffee1", Coffee.class);
		Coffee cof2 = context.getBean("coffee2", Coffee.class);
		
//		cof.info();
//		cof2.info();
		
		CoffeeShop starbucks = context.getBean("starbucks", CoffeeShop.class);
		CoffeeShop coffeebean = context.getBean("coffeebean", CoffeeShop.class);
		
		starbucks.info();
		System.out.println("----------------");
		coffeebean.info();
	}
}

package com.coffee.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee2.xml");
		
		CoffeeShop starbucks = context.getBean("starbucks", CoffeeShop.class);
		CoffeeShop coffeebean = context.getBean("coffeebean", CoffeeShop.class);
		
		starbucks.info();
		System.out.println("----------------");
		coffeebean.info();
	}
}

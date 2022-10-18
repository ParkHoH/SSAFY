package com.animal.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zoo2.xml");
		
		Zoo seoulZoo = context.getBean("seoulZoo", Zoo.class);
		Zoo londonZoo = context.getBean("londonZoo", Zoo.class);
		
		seoulZoo.info();
		System.out.println("-----------");
		londonZoo.info();
	}
}

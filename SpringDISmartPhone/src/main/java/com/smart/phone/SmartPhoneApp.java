package com.smart.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartPhoneApp {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("smartphone.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("smartphone.xml");
		
		ElecShop delightShop = context.getBean("delightShop", ElecShop.class);
		ElecShop hiMart = context.getBean("hiMart", ElecShop.class);
		
		delightShop.productList();
		System.out.println("-----");
		hiMart.productList();
	}
}

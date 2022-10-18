package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		MyCollection m = context.getBean("col", MyCollection.class);
		
		m.arrayInfo();
		System.out.println("-----");
		m.listInfo();
		System.out.println("-----");
		m.setInfo();
		System.out.println("-----");
		m.mapInfo();
	}

}

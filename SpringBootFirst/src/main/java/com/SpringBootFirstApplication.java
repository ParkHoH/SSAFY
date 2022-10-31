package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootFirstApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
//		String[] names = context.getBeanDefinitionNames();
//		
//		for (String n : names) {
//			System.out.println(n);
//		}
	}

}

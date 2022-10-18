package com.coffee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration: xml 문서를 대신해서 필요한 객체를 생성해줌

@Configuration
public class CoffeeConfig {
	
	// @Bean: <bean> 태그를 대신함. <bean id="getAmericano" class="">
	@Bean
	public Americano americano() {
		Americano americano = new Americano(3000);
		americano.setOrigin("kenya");
		
		return americano;
	}
	
	@Bean
	public CaffeLatte caffeLatte() {
		CaffeLatte caffeLatte = new CaffeLatte(5000);
		caffeLatte.setOrigin("columbia");
		
		return caffeLatte;
	}

	@Bean
	public Starbucks starbucks() {
		return new Starbucks(americano(), caffeLatte());
	}

	@Bean
	public Coffeebean coffeebean() {
		Coffeebean coffeebean = new Coffeebean();
		coffeebean.setAmericano(americano());
		coffeebean.setCaffelatte(caffeLatte());
		
		return coffeebean;
	}
}

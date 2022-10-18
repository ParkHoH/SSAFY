package com.animal.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LondonZoo implements Zoo{
	@Autowired
	@Qualifier("tiger2")
	Tiger tiger;
	
	@Autowired
	@Qualifier("lion2")
	Lion lion;
	
	@Override
	public void info() {
		System.out.println("LondonZoo 입니다.");
		tiger.info();
		lion.info();
	}
}

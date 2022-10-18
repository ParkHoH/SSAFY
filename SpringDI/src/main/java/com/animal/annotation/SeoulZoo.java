package com.animal.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeoulZoo implements Zoo{
	@Resource(name = "tiger1")
	Tiger tiger;
	
	@Resource(name = "lion1")
	Lion lion;
	
	@Override
	public void info() {
		System.out.println("SeoulZoo 입니다.");
		tiger.info();
		lion.info();
	}
}

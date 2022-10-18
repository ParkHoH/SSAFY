package com.animal;

public class SeoulZoo implements Zoo{
	Tiger tiger;
	Lion lion;
	
	public SeoulZoo(Tiger tiger) {
		this.tiger = tiger;
	}
	
	public void setLion(Lion lion) {
		this.lion = lion;
	}

	@Override
	public void info() {
		System.out.println("SeoulZoo 입니다.");
		tiger.info();
		lion.info();
	}
}

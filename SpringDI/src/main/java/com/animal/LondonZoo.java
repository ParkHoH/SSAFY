package com.animal;

public class LondonZoo implements Zoo{
	Tiger tiger;
	Lion lion;
	
	public LondonZoo(Tiger tiger) {
		this.tiger = tiger;
	}
	
	public void setLion(Lion lion) {
		this.lion = lion;
	}

	@Override
	public void info() {
		System.out.println("LondonZoo 입니다.");
		tiger.info();
		lion.info();
	}
}

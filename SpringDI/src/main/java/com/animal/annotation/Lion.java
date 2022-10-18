package com.animal.annotation;

public class Lion implements Animal{
	int age;
	String name;
	
	public Lion(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void info() {
		System.out.print("Lion : [");
		System.out.print("이름: " + name + ", ");
		System.out.print("나이: " + age);
		System.out.println("]");
	}

}

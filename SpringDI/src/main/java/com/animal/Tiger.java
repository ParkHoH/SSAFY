package com.animal;

public class Tiger implements Animal{
	int age;
	String name;
	
	public Tiger(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void info() {
		System.out.print("Tiger : [");
		System.out.print("이름: " + name + ", ");
		System.out.print("나이: " + age);
		System.out.println("]");
	}

}

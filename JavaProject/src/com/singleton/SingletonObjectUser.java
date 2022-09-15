package com.singleton;

public class SingletonObjectUser {

	public static void main(String[] args) {
		SingletonObject s1 = SingletonObject.getSingleton();
		System.out.println(s1);
	}

}

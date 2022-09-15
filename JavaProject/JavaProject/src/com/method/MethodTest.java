package com.method;

public class MethodTest {

	public static void hello() {
		System.out.println("hello!!!");
	}

	// 이름을 파라메터로 받아서 이름 뒤에 "bye!"를 연결해 리턴하는 메소드
	public String bye(String name) {
		return name + " bye!";
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void sum2(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		hello();
		
		System.out.println("-----------");
		
		MethodTest mt = new MethodTest();
		String result = mt.bye("hohyun");
		System.out.println(result);
		
		System.out.println("-----------");
		
		System.out.println(sum(3, 4));
		System.out.println(sum(3, 4, 5));
		
		System.out.println("-----------");

		sum2(1, 2);
	}

}

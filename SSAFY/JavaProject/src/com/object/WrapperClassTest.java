package com.object;

import java.util.Arrays;

public class WrapperClassTest {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		
//		for (String x : args) {
//			System.out.println(x);
//		}
		
		int no = Integer.parseInt("234");
		double db = Double.parseDouble("3.56");
		
		int num = 88; // 기본형
		Integer num2 = new Integer(num); // 참조형, boxing
		System.out.println(num2 + 10); 
		// 원래는 연산이 안 되지만, auto-unboxing 이 일어남
		// 참조형 -> 기본형으로 변환이 돼서 연산이 일어남
		
		// auto-boxing
		Integer i = 99;
		Double d = 2.3;
		Float f = 2.34f;
		Character c = 'a';
		
		int a = 0;
		System.out.println(Integer.toString(a));
		
		String b = "a";
		System.out.println(String.valueOf(b));
	}

}

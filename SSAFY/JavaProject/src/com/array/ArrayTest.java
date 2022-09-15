package com.array;
// this is git test

public class ArrayTest {
	// 모든 배열은 생성하면 기본값을 가지고 있음
	// 정수형 배열 => 0 / 실수형 배열: 0.0 / 논리형 배열: false / 객체형 배열: null
	
	public static void main(String[] args) {
		// 객체형 배열
		String[] names = new String[3];
		System.out.println(names[2]); // null
		
		// 실수형 배열
		double [] point = new double[2]; // 선언, 생성 한번에
		System.out.println(point[0]); // 0.0
		
		// 정수형 배열
		int a = 9; // 기본형. 선언만 해도 사용 가능
		int[] score; // 1. 배열의 선언. 아직 사용 불가.
		score = new int[3]; // 2. 배열의 생성(*) 필수
		System.out.println(score[0]); // 0
		
		score[0] = 90;  // 3. 배열의 사용
		score[1] = 50;
		score[2] = 68;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}
}

package com.test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//		번호: 562
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		for (int i = 0; i < 10; i++) {
			list[i] = sc.nextInt();
		}
		
		int result1 = 0;
		double result2 = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) 
				result2 += list[i];
			else
				result1 += list[i];
		}
		
		System.out.println("sum : " + result1);
		System.out.println("avg : " + String.format("%.1f", result2 / 5));
		
		
//		번호: 559
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
//		double result = score[a-1] + score[b-1];
//		System.out.println(String.format("%.1f", result));
		
		
//     번호: 555
//		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for (int n : num) {
//			System.out.print(n + " ");
//		}
	}
}

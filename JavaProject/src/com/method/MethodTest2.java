package com.method;

import java.util.Arrays;

public class MethodTest2 {
	
	// 1번
	public static String getGreeting(String name) {
		return name + " be happy!";
	}
	
	// 2번
	public static boolean reverse(boolean bool) {
		return !bool;
	}
	
	// 3번
	public static String result(boolean a, boolean b) {
		return (a && b) ? "ok" : "cancel";
//		if (a == true && b == true)
//			return "ok";
//		else
//			return "cancel";
	}
	
	// 4번
	public static void loopString(int count, String msg) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}
	
	// 5번
	public static double getArea(int radius) {
		return radius * radius * Math.PI;
	}
	
	// 6번
	public static void printCircum(int radius) {
		System.out.println(2 * radius * Math.PI);
	}
	
	// 7번
	public static int[] makeArray(int len) {
		int[] arr = new int[len];
		return arr;
	}
	
	// 8번
	public static void total(int[] arr) {
		int result = 0;
		
		for (int x : arr) {
			result += x;
		}
		
		System.out.println(result);
	}
	
	// 9번
	public static int[] swap(int[] arr, int i, int  j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
	
	// 10번
	public static int findMax(int[] arr) {
		int maxValue =arr[0];
		int maxIdx = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	}
	
	public static void main(String[] args) {
		System.out.println(getGreeting("hohyun"));
		
		System.out.println("------------");
		
		System.out.println(reverse(true));
		System.out.println(reverse(false));
		
		System.out.println("------------");
		
		System.out.println(result(true, true));
		System.out.println(result(false, true));
		System.out.println(result(false, false));
		
		System.out.println("------------");
		
		loopString(2, "2번 반복하라");
		loopString(3, "3번 반복하라");
		
		System.out.println("------------");
		
		System.out.println(getArea(3));
		
		System.out.println("------------");
		
		printCircum(3);
		
		System.out.println("------------");
		
		System.out.println(Arrays.toString(makeArray(3)));
				
		System.out.println("------------");
		
		total(new int[] {1, 3, 5});
		
		System.out.println("------------");
		
		System.out.println(Arrays.toString(swap(new int[] {1, 3, 5}, 0, 2)));
		
		System.out.println("------------");
		
		System.out.println(findMax(new int[] {1, 3, 6, 2}));
	}

}

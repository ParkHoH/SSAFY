package com.second;

public class SwitchTest2 {
	public static void main(String[] args) {
		int score = 95;
		switch (score) {
			case 90:
				System.out.println("level-1");
				break;
				
			case 80:
				System.out.println("level-2");
				break;
				
			case 70:
				System.out.println("level-3");
				break;
				
			default:
				System.out.println("level-4");
				break;
			}
	}
}

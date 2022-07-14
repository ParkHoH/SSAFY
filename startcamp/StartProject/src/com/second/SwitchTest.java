package com.second;

public class SwitchTest {
	public static void main(String[] args) {
		
		char code = 'A';
		
		switch (code) { // long 을 제외한 정수형. String도 가능.
			case 'A':  
			case 'a':
				System.out.println("level-1");
				break;
				
			case 'B':  
			case 'b':
				System.out.println("level-2");
				break;
				
			case 'C':  
			case 'c':
				System.out.println("level-3");
				break;
				
			default:
				System.out.println("level-4");
				break;
			}
	}
}

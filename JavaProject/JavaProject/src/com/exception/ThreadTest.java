package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// InterruptedException: Non_Runtime Exception. 반드시 try~catch로 처리해주고 가야 함.
public class ThreadTest {

	public static void main(String[] args)  throws InterruptedException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("a.txt");

		System.out.println("------------");
		
		try {
			Thread.sleep(2000);
		
		} catch (InterruptedException e) {
			System.out.println("예외 발생!!!");
			e.printStackTrace(); // 스택에 쌓여있는 오류 정보를 보여달라는 메서드
		}
		
		System.out.println("hello world");
		Thread.sleep(2000);
		System.out.println("hello world");
		
	}

}

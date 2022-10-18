package com.aop.board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("board.xml");
		
		int num = 1;
		Board b = context.getBean("board", Board.class);
		
		b.read(num);
		System.out.println();
		
		b.delete(num);
		System.out.println();
		
		b.write("첫 글 등록!");
	}
}

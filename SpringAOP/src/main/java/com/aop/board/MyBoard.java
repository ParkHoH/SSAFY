package com.aop.board;

public class MyBoard implements Board{
	@Override
	public String read(int num) {
		System.out.println(num + "번 글을 읽습니다.");
		return null;
	}

	@Override
	public void delete(int num) {
		System.out.println(num + "번 글을 지웁니다.");
	}

	@Override
	public void write(String content) {
		System.out.println(content + "로 글을 씁니다.");
	}

}

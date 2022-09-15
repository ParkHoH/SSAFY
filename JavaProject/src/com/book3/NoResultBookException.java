package com.book3;

public class NoResultBookException extends Exception {

	@Override
	public String toString() {
		return "NoResultBookException: 해당 조건을 만족하는 책이 존재하지 않습니다.";
	}

}

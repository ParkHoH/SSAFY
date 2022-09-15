package com.book3;

public class NoSuchBookException extends Exception {

	@Override
	public String toString() {
		return "NoSuchBookExceptio: 해당 책은 존재하지 않습니다.";
	}

}

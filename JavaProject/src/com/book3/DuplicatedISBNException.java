package com.book3;

public class DuplicatedISBNException extends Exception {
	@Override
	public String toString() {
		return "DuplicatedISBNException: 중복된 ISBN입니다.";
	}

}

package com.book;

public class BookManager {
	
	private int MAX_SIZE = 100;
	private int size;
	private Book[] books = new Book[MAX_SIZE];

	void add(Book book) {
		if (size < MAX_SIZE) {
			for (int i = 0; i < books.length; i++) {
				if (books[i] == null) {
					books[i] = book;
					size++;
					break;
				}
			}
		}
	}
	
	
	void remove(String isbn) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null)
				continue;
			
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = null;
				size--;
				break;
			}
		}
	}
	
	
	Book[] getList() {
		Book[] result = new Book[size];
		int idx = 0;
		
		for (Book book : books) {
			if (book != null)
				result[idx++] = book;
		}
		
		return result;
	}
	
	
	Book searchByIsbn(String isbn) {
		for (Book book : books) {
			if (book == null)
				continue;
				
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	
}

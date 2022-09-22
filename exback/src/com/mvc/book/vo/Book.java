package com.mvc.book.vo;

public class Book {
	private int isbn, price;
	private String title, descript, regdate;
	
	public Book(int isbn, String title, int price, String descript, String regdate) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.descript = descript;
		this.regdate = regdate;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}

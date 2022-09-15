package com.book3;

import java.util.ArrayList;

// Book을 관리하기 위해 필요한 메소드가 표시된 인터페이스
public interface IBookManager {
	
	void add(Book book) throws DuplicatedISBNException; // DuplicatedISBNException
	
	void remove(String isbn) throws NoSuchBookException; // NoSuchBookException
	
	Book findByIsbn(String isbn) throws NoSuchBookException; // NoSuchBookException
	
	ArrayList<Book> findByTitle(String title) throws NoResultBookException; // NoResultException
	
	ArrayList<Magagine> getMagazines() throws NoResultBookException; // NoResultException
	
	ArrayList<Novel> getNovels() throws NoResultBookException; // NoResultException
	
	int getTotalPrice();
	
	double getPriceAverage();
	
	// 추가된 메소드
	ArrayList<Magagine> findMagazineByYear(int year) throws NoResultBookException; // NoResultException
	ArrayList<Book> findByPrice(int price1, int price2) throws NoResultBookException; // NoResultException
	ArrayList<Book> findByPublisher(String publisher) throws NoResultBookException; // NoResultException
	
}

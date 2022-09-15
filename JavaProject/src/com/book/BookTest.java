package com.book;

public class BookTest {

	public static void main(String[] args) {
		BookManager bookManager = new BookManager();
		Book book1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기분 문법");
		Book book2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용");
		Book book3 = new Book("35355", "분석 설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		
		bookManager.add(book1);
		bookManager.add(book2);
		bookManager.add(book3);
		
		System.out.println("*******************도서목록*******************");
		
		Book[] result1 = bookManager.getList();
		for (Book book : result1) {
			System.out.println(book.getIsbn() + "  |  " + book.getTitle() + "  |  " + book.getAuthor() + "  |  " + book.getPublisher() + "  |  " + book.getPrice() + "  |  " + book.getDesc());
		}
		
		System.out.println("*******************도서조회:21424*******************");
		
		Book result2 = bookManager.searchByIsbn("21424");
		System.out.println(result2.getIsbn() + "  |  " + result2.getTitle() + "  |  " + result2.getAuthor() + "  |  " + result2.getPublisher() + "  |  " + result2.getPrice() + "  |  " + result2.getDesc());
		
		System.out.println("*******************도서삭제:21424*******************");
		
		bookManager.remove("21424");
		
		System.out.println("*******************도서목록*******************");
		
		Book[] result3 = bookManager.getList();
		for (Book book : result3) {
			System.out.println(book.getIsbn() + "  |  " + book.getTitle() + "  |  " + book.getAuthor() + "  |  " + book.getPublisher() + "  |  " + book.getPrice() + "  |  " + book.getDesc());
		}
		
		System.out.println("-----------------------");
		
		Novel novel = new Novel("1234", "나의 라임", "호현", "출판수", 15000, "설명", "소설");
		Magagine magagine = new Magagine(null, null, null, null, 0, null, 0, 0);
		
		System.out.println(novel);
		System.out.println(magagine);
	}

}

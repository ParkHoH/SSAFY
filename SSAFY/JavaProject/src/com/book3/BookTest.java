package com.book3;

import java.util.ArrayList;
import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		System.out.println("1. add 테스트");
		BookManager bm = BookManager.getSingleton();
		try {
			bm.add(new Magagine("test", null, null, null, 0, null, 0, 0));
//			bm.add(new Magagine("test", null, null, null, 0, null, 0, 0));
			bm.add(new Magagine("test2", "공부 잘 하는 책", null, null, 0, null, 0, 0));
			bm.add(new Magagine("test3", "좋은 하루", null, null, 0, null, 0, 0));
			bm.add(new Novel("test4", "좋은 하루", null, null, 0, null, null));
			bm.add(new Novel("test5", "나쁜 하루", null, null, 0, null, null));
			bm.add(new Novel("소설책 테스트1", "소설 제목1", null, null, 2, null, null));
			bm.add(new Novel("소설책 테스트2", "소설 제목2", null, null, 0, null, null));
			bm.add(new Magagine("잡지 테스트", null, null, null, 0, null, 0, 0));
			bm.add(new Magagine("잡지 테스트2", null, null, null, 0, null, 0, 0));
			bm.add(new Magagine("잡지 테스트2-1", null, null, null, 0, null, 1, 1));
			bm.add(new Magagine("잡지 테스트2-2", null, null, null, 0, null, 1, 1));
			bm.add(new Magagine("잡지 테스트3-1", null, null, null, 1, null, 1, 1));
			bm.add(new Magagine("잡지 테스트3-2", null, null, null, 2, null, 2, 1));
			bm.add(new Magagine("잡지 테스트4-1", null, null, "최고 출판사", 1, null, 1, 1));
			bm.add(new Magagine("잡지 테스트4-2", null, null, "최고 출판사", 2, null, 2, 1));
			System.out.println(bm.findByIsbn("test"));


			System.out.println("-----------------");
	
			System.out.println("2. remove 테스트");
//			bm.remove("test");
			bm.remove("test");
			
			System.out.println("-----------------");
			
			System.out.println("3. isbn 기준 검색 테스트");
			System.out.println(bm.getBooks());
//			System.out.println(bm.findByIsbn("test"));
			System.out.println(bm.findByIsbn("test2"));
	
			System.out.println("-----------------");
	
			System.out.println("4. 제목 기준 검색 테스트");
			ArrayList<Book> arr = bm.findByTitle("하루");
			for (Book book : arr) {
				System.out.println(book);
			}
	
			System.out.println("-----------------");
	
			System.out.println("5. 잡지 검색 테스트");
			ArrayList<Magagine> arr2 = bm.getMagazines();
			for (Magagine magagine : arr2) {
				System.out.println(magagine);
			}

			System.out.println("-----------------");
	
			System.out.println("6. 소설책 검색 테스트");
			ArrayList<Novel> arr3 = bm.getNovels();
			for (Novel novel : arr3) {
				System.out.println(novel);
			}
	
			System.out.println("-----------------");
	
			System.out.println("7 & 8. 책 가격 합 / 평균 테스트");
			System.out.println("현재 데이터의 수: " + bm.getBooks().size());
			System.out.println(bm.getTotalPrice());
			System.out.println(bm.getPriceAverage());
			
			System.out.println("-----------------");
			
			System.out.println("9. 연도 기준 검색 테스트");
			ArrayList<Magagine> arr4 = bm.findMagazineByYear(1);
			
			for (Magagine magagine : arr4) {
				System.out.println(magagine);
			}
			
			System.out.println("-----------------");
			
			System.out.println("10. 가격 기준 검색 테스트");
			ArrayList<Book> arr5 = bm.findByPrice(1, 2);
			
			for (Book book : arr5) 
				System.out.println(book);
			
			
			System.out.println("-----------------");
			
			System.out.println("11. 출판사 기준 검색 테스트");
			ArrayList<Book> arr6 = bm.findByPublisher("최고 출판사");
			
			for (Book book : arr6) 
				System.out.println(book);
			
			
		} catch (DuplicatedISBNException | NoSuchBookException | NoResultBookException e) {
			System.out.println(e);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

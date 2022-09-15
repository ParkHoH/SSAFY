package com.book2;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {

		System.out.println("add 테스트");
		BookManager bm = BookManager.getSingleton();
		bm.add(new Book("test", "재밌는 책", null, null, 0, null));
		bm.add(new Book("test2", "공부 잘 하는 책", null, null, 0, null));
		bm.add(new Book("test3", "좋은 하루", null, null, 0, null));
		bm.add(new Book("test4", "좋은 하루", null, null, 0, null));
		bm.add(new Book("test5", "나쁜 하루", null, null, 0, null));
		System.out.println(bm.findByIsbn("test"));
		
		System.out.println("-----------------");
		
		System.out.println("remove 테스트");
		System.out.println("isbn 기준 검색 테스트");
		bm.remove("test");
		bm.remove("test");
		System.out.println(bm.findByIsbn("test"));
		
		
		System.out.println("-----------------");
		
		System.out.println("제목 기준 검색 테스트");
		System.out.println(Arrays.toString(bm.findByTitle("하루")));

		System.out.println("-----------------");
		
		System.out.println("잡지 검색 테스트");
		bm.add(new Magagine("잡지 테스트", null, null, null, 0, null, 0, 0));
		bm.add(new Magagine("잡지 테스트2", null, null, null, 0, null, 0, 0));
		System.out.println(Arrays.toString(bm.getMagazines()));

		System.out.println("-----------------");
		
		System.out.println("소설책 검색 테스트");
		bm.add(new Novel("소설책 테스트1", "소설 제목1", null, null, 2, null, null));
		bm.add(new Novel("소설책 테스트2", "소설 제목2", null, null, 0, null, null));
		System.out.println(Arrays.toString(bm.getNovels()));
		
		
		System.out.println("-----------------");
		
		System.out.println("책 가격 합 / 평균 테스트");
		System.out.println("현재 데이터의 수: " + bm.getSize());
		System.out.println(bm.getTotalPrice());
		System.out.println(bm.getPriceAverage());
	}

}

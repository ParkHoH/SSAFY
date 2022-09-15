package com.book2;

// 싱글톤
public class BookManager {

	private final static int MAX_SIZE = 100;
	private int size;
	private Book[] books = new Book[MAX_SIZE];

	private static BookManager bm = new BookManager();

	private BookManager() {
	}

	public static BookManager getSingleton() {
		return bm;
	}

	public Book[] getBooks() {
		return books;
	}

	public int getSize() {
		return size;
	}

	// 1. 도서 추가
	public void add(Book book) {
		if (size < MAX_SIZE) {
			BookManager bm = BookManager.getSingleton();
			bm.books[size++] = book;
		}
	}

	// 2. 도서 삭제 : 삭제할 도서를 찾은 경우 해당 도서 위치에 저장된 제일 마지막 도서를 옮겨 놓음
	public void remove(String isbn) {
		for (int i = 0; i < bm.size; i++) {
			if (bm.books[i].getIsbn() == isbn) {
				bm.books[i] = bm.books[--size];
				bm.books[size] = null;
				break;
			}
		}
	}

	// 3. isbn 기준 검색
	public Book findByIsbn(String isbn) {
		for (int i = 0; i < bm.size; i++) {
			if (bm.books[i].getIsbn() == isbn) {
				return bm.books[i];
			}
		}

		return null;
	}

	// 4. 제목 기준 검색: 제목을 포함하는 경우 검색
	public Book[] findByTitle(String title) {
		int cnt = 0;

		for (int i = 0; i < bm.size; i++) {
			if (bm.books[i].getTitle().contains(title))
				cnt++;
		}

		if (cnt > 0) {
			Book[] result = new Book[cnt];
			int idx = 0;
			for (int i = 0; i < bm.size; i++) {
				if (bm.books[i].getTitle().contains(title))
					result[idx++] = bm.books[i];
			}
			return result;

		} else
			return null;
	}

	// 5. 잡지 검색
	public Magagine[] getMagazines() {
		int cnt = 0;

		for (int i = 0; i < bm.size; i++) {
			if (bm.books[i] instanceof Magagine)
				cnt++;
		}

		if (cnt > 0) {
			Magagine[] result = new Magagine[cnt];
			int idx = 0;
			for (int i = 0; i < bm.size; i++) {
				if (bm.books[i] instanceof Magagine)
					result[idx++] = (Magagine)bm.books[i];
			}
			return result;

		} else
			return null;
	}

	// 6. 소설책 검색
	public Novel[] getNovels() {
		int cnt = 0;

		for (int i = 0; i < bm.size; i++) {
			if (bm.books[i] instanceof Novel)
				cnt++;
		}

		if (cnt > 0) {
			Novel[] result = new Novel[cnt];
			int idx = 0;
			for (int i = 0; i < bm.size; i++) {
				if (bm.books[i] instanceof Novel)
					result[idx++] = (Novel)bm.books[i];
			}
			return result;

		} else
			return null;
	}

	// 7. 저장된 모든 책 가격의 합
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < bm.size; i++) 
			sum += bm.books[i].getPrice();
		
		return sum;
	}

	// 8. 저장된 모든 책 가격의 평균
	public double getPriceAverage() {
		int sum = 0;
		for (int i = 0; i < bm.size; i++) 
			sum += bm.books[i].getPrice();

		return (double)sum / bm.size;
	}

}

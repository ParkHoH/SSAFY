package com.book3;

import java.util.ArrayList;

// 싱글톤
// 도서 리스트를 ArrayList로 유지하며 관리하는 클래스
public class BookManager implements IBookManager {

	private final static int MAX_SIZE = 100;
//	private int size;
	private ArrayList<Book> books = new ArrayList<>();

	private static BookManager bm = new BookManager();

	private BookManager() {
	}

	public static BookManager getSingleton() {
		return bm;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	// 1. 도서 추가
	@Override
	public void add(Book book) throws DuplicatedISBNException {
		for (int i = 0; i < bm.books.size(); i++) {
			Book b =  bm.books.get(i);
			if (b.getIsbn() == book.getIsbn())
				throw new DuplicatedISBNException();
		}
		
		BookManager bm = BookManager.getSingleton();
		bm.books.add(book);
	}

	// 2. 도서 삭제 : 삭제할 도서를 찾은 경우 해당 도서 위치에 저장된 제일 마지막 도서를 옮겨 놓음
	@Override
	public void remove(String isbn) throws  NoSuchBookException {
		boolean removed = false;
		
		for (int i = 0; i < bm.books.size(); i++) {
			if (bm.books.get(i).getIsbn() == isbn) {
				bm.books.remove(i);
				removed = true;
				break;
			}
		}
		
		if (removed == false)
			throw new NoSuchBookException();
	}

	// 3. isbn 기준 검색
	@Override
	public Book findByIsbn(String isbn) throws NoSuchBookException{
		boolean exist = false;
		
		Book result = null;
		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b.getIsbn() == isbn) {
				exist = true;
				result = b;
				break;
			}
		}
		
		if (exist == true)
			return result;
		else
			throw new NoSuchBookException();
	}

	// 4. 제목 기준 검색: 제목을 포함하는 경우 검색
	@Override
	public ArrayList<Book> findByTitle(String title) throws NoResultBookException {
		ArrayList<Book> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b.getTitle() != null && b.getTitle().contains(title))
				result.add(b);
		}
		
		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();
	}

	// 5. 잡지 검색
	@Override
	public ArrayList<Magagine> getMagazines() throws NoResultBookException {
		ArrayList<Magagine> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b instanceof Magagine)
				result.add((Magagine) b);
		}

		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();
	}

	// 6. 소설책 검색
	@Override
	public ArrayList<Novel> getNovels() throws NoResultBookException {
		ArrayList<Novel> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b instanceof Novel)
				result.add((Novel) b);
		}

		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();
	}

	// 7. 저장된 모든 책 가격의 합
	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < bm.books.size(); i++)
			sum += bm.books.get(i).getPrice();

		return sum;
	}

	// 8. 저장된 모든 책 가격의 평균
	@Override
	public double getPriceAverage() {
		int sum = 0;
		for (int i = 0; i < bm.books.size(); i++)
			sum += bm.books.get(i).getPrice();

		return (double) sum / bm.books.size();
	}

	// 9. 연도 기준 검색
	@Override
	public ArrayList<Magagine> findMagazineByYear(int year) throws NoResultBookException {
		ArrayList<Magagine> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b instanceof Magagine) {
				Magagine tmp = (Magagine) b;
				if (tmp.getYear() == year)
					result.add(tmp);
			}
		}

		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();

	}

	// 10. 가격 기준 검색
	@Override
	public ArrayList<Book> findByPrice(int price1, int price2) throws NoResultBookException {
		ArrayList<Book> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b.getPrice() == price1 || b.getPrice() == price2) {
				result.add(b);
			}
		}

		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();
	}

	// 11. 출판사 기준 검색
	@Override
	public ArrayList<Book> findByPublisher(String publisher) throws NoResultBookException {
		ArrayList<Book> result = new ArrayList<>();

		for (int i = 0; i < bm.books.size(); i++) {
			Book b = bm.books.get(i);
			if (b.getPublisher() == publisher) {
				result.add(b);
			}
		}

		if (result.size() != 0)
			return result;
		else
			throw new NoResultBookException();

	}
}

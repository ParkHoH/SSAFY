package com.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookSAXHandler extends DefaultHandler {

	List<Book> list;
	Book book;
	String txt;

	public BookSAXHandler() { // 생성자가 없는 경우 null point 에러 발생
		list = new ArrayList<>();
	}

	// element가 시작이 될 때 자동 실행(시작 태그를 만날 때)
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("book")) {
			book = new Book();

		}
	}

	// element가 끝날 될 때 자동 실행(끝 태그를 만날 때)
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (book != null) {
			if (qName.equals("isbn"))
				book.setIsbn(txt);

			else if (qName.equals("title"))
				book.setTitle(txt);
			
			else if (qName.equals("author"))
				book.setAuthor(txt);
			
			else if (qName.equals("publisher"))
				book.setPublisher(txt);
			
			else if (qName.equals("price"))
				book.setPrice(txt);

			else if (qName.equals("book")) { // 책 한 권 정보가 끝남
				list.add(book);
				txt = null;
			}
		}

	}

	// 시작 태그와 끝 태그 사이의 글자를 만나면 자동 실행
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim(); // trim 메서드는 공백 제거
		txt = str;
	}
	
	public List<Book> getList() {
		return list;
	}

}

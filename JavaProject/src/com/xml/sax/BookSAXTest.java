package com.xml.sax;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class BookSAXTest {

	public static void main(String[] args) {
		// SAXParser
		SAXParserFactory factory = SAXParserFactory.newInstance(); // factory 패턴이라고 함(싱글톤이랑은 다름)
//		SAXParserFactory factory2 = SAXParserFactory.newInstance();
//		System.out.println(factory == factory2);
		
		try {
			SAXParser parser = factory.newSAXParser();
			
			// handler: xml 문서를 파싱할 정보를 가지고 잇는 객체
			BookSAXHandler handler = new BookSAXHandler();
			parser.parse("src/com/xml/sax/book.xml", handler);
			
			List<Book> list = handler.getList();
			for (Book book : list) {
				System.out.println(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

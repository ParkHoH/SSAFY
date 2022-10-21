package com.mybatis;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardTest {
	public static void main(String[] args) {
		String conf = "res/Configuration.xml";
		Reader reader;
		
		try {
			reader = Resources.getResourceAsReader(conf);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			
			// 1. selectAll
			List<Board> board = session.selectList("Board.selectAll");
			for (Board b : board) {
				System.out.println(b);
			}
			
			System.out.println("------");
			
			
			// 2. select one
			Board b1 = session.selectOne("Board.selectOne", "25");
			System.out.println(b1);
			
			System.out.println("------");
			
			
			// 2-1. search
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("condition", "title");
			map.put("word", "8");
			List<Board> list = session.selectList("Board.search", map);
			
			for (Board b : list) {
				System.out.println(b);
			}
			
			// 3. insert	
//			Board b2 = new Board("31", "123", "ioio", null, "test_title", "test_content", 0);
//			int num2 = session.insert("Board.insert", b2);
//			System.out.println(num2);
//			session.commit();
//			
//			System.out.println("------");
			
			
			// 4. update countUP
			// 5. delete
			// 6. 번호 기준 제목, 내용 수정
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

package com.mybatis;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerTest {
	public static void main(String[] args) {
		String conf = "res/Configuration.xml";
		Reader reader;
		
		try {
			reader = Resources.getResourceAsReader(conf);
		 	SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		 	SqlSessionFactory factory = builder.build(reader);
//		 	SqlSession session = factory.openSession(true); // auto commit
		 	SqlSession session = factory.openSession(); // auto commit x
			
		 	// 1. selectList(): select 결과가 여러 건일 때
		 	List<Customer> list =  session.selectList("Customer.selectAll");
		 	
		 	for (Customer c : list) {
				System.out.println(c);
			}
		 	
		 	System.out.println("---------");
		 	
		 	// 2. selectOne
		 	Customer c = session.selectOne("Customer.selectOne", "411");
		 	System.out.println(c);
		 	
		 	System.out.println("---------");
		 	
		 	// 3. insert
		 	// ... auto commit 이 아니기 때문에 따로 해줄 필요가 있음
		 	HashMap<String, String> param = new HashMap<String, String>();
		 	param.put("num", "1200");
		 	param.put("name", "hyun");
		 	param.put("address", "Seoul");
		 	
		 	int num = session.insert("Customer.insert", param);
		 	System.out.println(num);
		 	session.commit();
		 	
		 	System.out.println("---------");
		 	
		 	// 4. delete
		 	num = session.delete("Customer.delete", "1200");
		 	System.out.println(num);
		 	session.commit();
		 	
		 	System.out.println("---------");
		 	
		 	// 5. update
		 	num = session.update("Customer.update", "2");
		 	System.out.println(num);
		 	session.commit();
		 	
		 	// 6. 주소로 검색
		 	list = session.selectList("Customer.selectAddress", "seoul");
		 	for (Customer customer : list) {
				System.out.println(customer);
			}
		 	
		} catch (Exception e) {
		}
	}
}

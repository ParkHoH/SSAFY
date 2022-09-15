package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 주소 수정. 번호 입력
public class UsersCreate {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/scottdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "scott";
		String password = "scott";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "CREATE TABLE `users` (";
		query += "  `id` int PRIMARY KEY,";
		query += "  `name` varchar(10) NOT NULL,";
		query += "  `phone` varchar(13) NOT NULL,";
		query += "  `address` varchar(20),";
		query += "  `company` varchar(16))";
		
		//1.Driver 등록
		Class.forName(driver);	
		
		//2. Connection 생성 - network 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.Statement  생성
		Statement stat = con.createStatement();
		
		//4.Query  실행
		boolean b = stat.execute(query);
		
		//5. 결과 처리			
		System.out.println(b + " 테이블 추가!");		
		
		//6. 마무리
		stat.close();
		con.close();
		
	}

}

















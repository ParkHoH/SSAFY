package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 주소 수정. 번호 입력
public class UsersWhere {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/scottdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "scott";
		String password = "scott";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "SELECT * FROM users WHERE address = '강서구'";
		
		//1.Driver 등록
		Class.forName(driver);	
		
		//2. Connection 생성 - network 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.Statement  생성
		Statement stat = con.createStatement();
		
		//4.Query  실행
		ResultSet rs = stat.executeQuery(query);
		
		//5. 결과 처리
		while (rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getString(2) + " ");
			System.out.print(rs.getString(3) + " ");
			System.out.print(rs.getString(4) + " ");
			System.out.print(rs.getString(5) + " ");
			System.out.println();
		}
		
		//6. 마무리
		stat.close();
		con.close();
		
	}

}

















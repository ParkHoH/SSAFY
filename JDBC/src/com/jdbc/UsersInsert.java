package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 주소 수정. 번호 입력
public class UsersInsert {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/scottdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "scott";
		String password = "scott";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "insert into users values (3, 'jun', '01012341234', '중랑구', 'ssafy2')";
		
		//1.Driver 등록
		Class.forName(driver);	
		
		//2. Connection 생성 - network 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.Statement  생성
		Statement stat = con.createStatement();
		
		//4.Query  실행
		int cnt = stat.executeUpdate(query);
		
		//5. 결과 처리
		System.out.println(cnt + "개 처리 완료!");
		
		//6. 마무리
		stat.close();
		con.close();
		
	}

}

















package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 주소 수정. 번호 입력
public class CustomerPreparedInsert {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/scottdb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String user = "scott";
		String password = "scott";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "insert into customer values (?, ?, ?)";
		
		//1.Driver 등록
		Class.forName(driver);	
		
		//2. Connection 생성 - network 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.Statement  생성
//		Statement stat = con.createStatement();
		PreparedStatement pstat = con.prepareStatement(query);
		
		// 3-1. ?에 값 setting
		pstat.setString(1, args[0]); // 첫 번째 물음표
		pstat.setString(2, args[1]); // 두 번째 물음표
		pstat.setString(3, args[2]); // 세 번째 물음표
		
		//4.Query  실행
		int c = pstat.executeUpdate();
		
		//5. 결과 처리			
		System.out.println(c + "개의 레코드 추가!");		
		
		//6. 마무리
		pstat.close();
		con.close();
		
	}

}

















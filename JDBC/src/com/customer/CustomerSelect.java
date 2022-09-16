package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerSelect {

	// Module path에 라이브러리 추가 필요
	public static void main(String[] args) {
		String DBMS = "mysql";
		String url = "jdbc:" + DBMS + "://localhost:33	06/scottdb";
		String user = "scott";
		String password = "scott";
		String driver = "com." + DBMS + ".cj.jdbc.Driver";
		
		try {
			// 1. driver loading: 사용할 DB DRIVER 등록
			Class.forName(driver); // 선언해놓으면 필요한 라이브러리를 자동으로 호출해줌
			
			// 2. Connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con); // 주소값: com.mysql.cj.jdbc.ConnectionImpl@79e4c792
															// driver가 자동으로 주소를 변경해준 결과임
			
			// 3. Statement
			Statement stat = con.createStatement();
			
			// 4. Query 실행 및 결과 처리
			 ResultSet rs = stat.executeQuery("select num, name, address from customer");
			 
			 while (rs.next()) {
				 String num = rs.getString(1);
				 String name = rs.getString(2);
				 String address = rs.getString(3);
				 
				 System.out.println(num + " - " + name + " - " + address);
			 }
			 
			 // 5. 마무리
			 stat.close();
			 con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

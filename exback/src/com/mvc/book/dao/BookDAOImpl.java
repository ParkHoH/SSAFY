package com.mvc.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.book.vo.Book;
import com.mvc.util.DBUtil;

public class BookDAOImpl implements BookDAO{
	DBUtil util;
	
	public BookDAOImpl() {
		util = DBUtil.getInstance();
	}

	public ArrayList<Book> selectAll() {
		ArrayList<Book> books = new ArrayList<Book>();
		
		try {
			String q = "select * from book";
			
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			ResultSet rs = stat.executeQuery();
			
			while (rs.next()) {
				int isbn = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				String descript = rs.getString(4);
				String regdate = rs.getString(5);
				
				Book b = new Book(isbn, title, price, descript, regdate);
				books.add(b);
			}
			
			util.close(rs, stat, con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return books;
	}

	public Book selectOne(String isbn) {
		Book b = null;
		
		try {
			String q = "select * from book where isbn = ?";
			
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			
			stat.setInt(1, Integer.valueOf(isbn));
			
			ResultSet rs = stat.executeQuery();
			
			rs.next();
			String title = rs.getString(2);
			int price = rs.getInt(3);
			String descript = rs.getString(4);
			String regdate = rs.getString(5);
			
			b = new Book(Integer.valueOf(isbn), title, price, descript, regdate);
			util.close(rs, stat, con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}

	public void insert(HttpServletRequest request, HttpServletResponse response) {
		try {
			String q = "insert into book values (?, ?, ?, ?, sysdate())";
			
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			
			String isbn = request.getParameter("isbn");
			String title = request.getParameter("title");
			String price = request.getParameter("price");
			String descript = request.getParameter("descript");
			
			stat.setString(1, isbn);
			stat.setString(2, title);
			stat.setString(3, price);
			stat.setString(4, descript);
			
			stat.executeUpdate();
			util.close(stat, con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void delete(String isbn) {
		try {
			String q = "delete from book where isbn = ?";
			
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, isbn);
			stat.executeUpdate();
			util.close(stat, con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

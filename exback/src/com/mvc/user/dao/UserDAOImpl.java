package com.mvc.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.user.vo.User;
import com.mvc.util.DBUtil;

public class UserDAOImpl implements UserDAO {
	DBUtil util;
	
	public UserDAOImpl() {
		util = DBUtil.getInstance();
	}
	
	public boolean login(User user) {
		boolean flag = false;
		try {
			String q = "select * from user where id = ? and pass = ?";
			
			Connection con = util.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			
			stat.setString(1, user.getId());
			stat.setString(2, user.getPass());
			
			ResultSet rs = stat.executeQuery();
			
			while (rs.next()) {
				flag = true;
				break;
			}
			
			util.close(rs, stat, con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

}

package com.ssafy.sample.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ssafy.sample.dto.Emp;
import com.ssafy.sample.util.DBUtil;

public class EmpDAOImpl implements EmpDAO {
	DBUtil util;
	
	public EmpDAOImpl() {
		util = DBUtil.getInstance();
	}
	
	
	@Override
	public ArrayList<Emp> selectAll() {
		String q = "select emp, fname, deptid from myemp";
		ArrayList<Emp>list = new ArrayList<>();
		
		try {
			Connection con = util.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);
			
			while (rs.next()) {
				String empid = rs.getString(1);
				String fname = rs.getString(1);
				String deptid = rs.getString(1);
				
				Emp e = new Emp(empid, fname, null, null, deptid);
				list.add(e);
			}
			
			util.close(rs, stat, con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Emp selectOne() {
		return null;
	}

	@Override
	public int insert() {
		return 0;
	}

	@Override
	public int delete() {
		return 0;
	}

}

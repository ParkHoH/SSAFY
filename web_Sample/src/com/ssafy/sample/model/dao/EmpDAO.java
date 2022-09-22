package com.ssafy.sample.model.dao;

import java.util.ArrayList;

import com.ssafy.sample.dto.Emp;

// for service!
public interface EmpDAO {
	ArrayList<Emp> selectAll();
	Emp selectOne();
	int insert();
	int delete();
}

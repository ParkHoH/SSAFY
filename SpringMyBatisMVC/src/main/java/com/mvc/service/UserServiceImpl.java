package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.mapper.UserMapper;
import com.mvc.vo.User;

public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper mapper;
	
	public UserServiceImpl() {
//		dao = new UserDAOImpl();
	}
	
	@Override
	public boolean check(User user) {		
		return mapper.check(user);
	}

}

package com.mvc.user.service;

import com.mvc.user.dao.UserDAO;
import com.mvc.user.dao.UserDAOImpl;
import com.mvc.user.vo.User;

public class UserServiceImpl implements UserService {
	UserDAO dao;
	
	public UserServiceImpl() {
		dao = new UserDAOImpl();
	}
	
	public boolean login(User user) {
		return dao.login(user);
	}

}

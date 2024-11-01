package com.ssafit.mvc.model.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ssafit.mvc.model.dao.UserDao;
import com.ssafit.mvc.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.selectAll();
	}

	@Override
	public User getUserById(String id) {
		return userDao.selectById(id);
	}

	@Override
	public boolean addUser(User user) {
		int result = userDao.insertUser(user);
		if(result>0) return true;
		return false;
	}

}

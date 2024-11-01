package com.ssafit.mvc.model.service;

import java.util.List;

import com.ssafit.mvc.model.dto.User;

public interface UserService {
	//모든 회원 조회
	public List<User> getAllUsers();

	public User getUserById(String id);

	public boolean addUser(User user);
}

package com.ssafit.mvc.model.dao;

import java.util.List;

import com.ssafit.mvc.model.dto.User;

public interface UserDao {
	//모든 회원 반환
	public List<User> selectAll();

	public User selectById(String id);

	public int insertUser(User user);
}

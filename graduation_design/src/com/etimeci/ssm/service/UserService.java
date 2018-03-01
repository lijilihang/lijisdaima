package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.User;

public interface UserService {
	public int insertUser(User user);
	public List<User> query(String userName, String trueName);
}

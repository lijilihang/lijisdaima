package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.User;
import com.etimeci.ssm.entity.UserMessage;

public interface UserService {
	public int insertUser(User user);
	public List<User> query(String userName, String trueName);
	public List<UserMessage> queryUserMessage(Integer userId);
}

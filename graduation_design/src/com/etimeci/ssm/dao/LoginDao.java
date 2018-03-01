package com.etimeci.ssm.dao;

import java.util.List;

import com.etimeci.ssm.entity.Login;
import com.etimeci.ssm.entity.UserMessage;

public interface LoginDao {
	public List<UserMessage> selectUserName(UserMessage userMessage);
	
}

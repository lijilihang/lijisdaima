package com.etimeci.ssm.service;

import java.util.List;


import com.etimeci.ssm.entity.UserMessage;

public interface LoginService {
	public List<UserMessage> selectUserName(UserMessage userMessage);

}

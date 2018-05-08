package com.etimeci.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.UserDao;
import com.etimeci.ssm.dao.UserMessageDao;
import com.etimeci.ssm.entity.User;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
    private UserMessageDao userMessageDao;

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> query(String userName, String trueName) {
		return userDao.query(userName,trueName);
	}

    @Override
    public List<UserMessage> queryUserMessage(Integer userId) {
        return userMessageDao.queryUserMessage(userId);
    }
}
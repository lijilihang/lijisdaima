package com.etimeci.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.LoginDao;
import com.etimeci.ssm.dao.SupplierDao;
import com.etimeci.ssm.entity.Login;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	

	@Override
	public List<UserMessage> selectUserName(UserMessage userMessage) {
		// TODO Auto-generated method stub
		return loginDao.selectUserName(userMessage);
	}

}

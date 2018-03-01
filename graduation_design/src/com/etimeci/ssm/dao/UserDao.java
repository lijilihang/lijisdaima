package com.etimeci.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.User;

public interface UserDao {
	public int insertUser(User user);
	
	public List<User> query(@Param("userName") String userName, @Param("trueName") String trueName);
	
}

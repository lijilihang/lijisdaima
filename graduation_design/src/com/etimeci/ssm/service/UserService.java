package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.User;
import com.etimeci.ssm.entity.UserMessage;

public interface UserService {
    public int insertUser(User user);
    public List<User> query(String userName, String trueName);
    public List<UserMessage> queryUserMessage(Integer userId);
    public Boolean updateUserMessage(UserMessage message);
    public String selectUserPasssord(Integer userId);
    public Boolean updatePassword(Integer userId, String newPassword);
    public List<UserMessage> queryRealNameMessage(Integer userId);
    public Boolean updateRealNameMessage(UserMessage message);
}

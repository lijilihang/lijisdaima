package com.etimeci.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.UserMessage;

public interface UserMessageDao {
    public List<UserMessage> queryUserMessage(@Param("userId") Integer userId);
    public Boolean updateUserMessage(UserMessage message);
    public String selectUserPasssord(@Param("userId") Integer userId);
    public Boolean updatePassword(@Param("userId")Integer userId, @Param("newPassword")String newPassword);
    public List<UserMessage> queryRealNameMessage(@Param("userId") Integer userId);
    public Boolean updateRealNameMessage(UserMessage message);
}

package com.etimeci.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.UserMessage;

public interface UserMessageDao {
    public List<UserMessage> queryUserMessage(@Param("userId") Integer userId);
}

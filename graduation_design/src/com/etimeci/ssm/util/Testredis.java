package com.etimeci.ssm.util;

import org.springframework.beans.factory.annotation.Autowired;

public class Testredis {
    @Autowired
    private static RedisCacheManager redisCacheManager;

    public static void main(String[] args) {
        redisCacheManager.set("liji", "123");
        System.out.println(redisCacheManager.get("liji"));

    }

}

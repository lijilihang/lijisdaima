package com.etimeci.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etimeci.ssm.util.RedisCacheManager;

@Controller
public class HelloController {
    @Autowired
    private RedisCacheManager redisCacheManager;

	@RequestMapping("/hello")
	public String hello(){
	    redisCacheManager.set("liji", "123");
	    System.out.println(redisCacheManager.get("liji"));
		return "success";
	}


}

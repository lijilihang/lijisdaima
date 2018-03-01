package com.etimeci.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		
		//1.获取表单参数
		
		//2.调用业务逻辑
		
		System.out.println("HelloController.hello()....");
		return "success";
	}
	
	
}

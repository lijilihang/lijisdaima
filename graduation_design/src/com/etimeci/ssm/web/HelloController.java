package com.etimeci.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		
		//1.��ȡ������
		
		//2.����ҵ���߼�
		
		System.out.println("HelloController.hello()....");
		return "success";
	}
	
	
}

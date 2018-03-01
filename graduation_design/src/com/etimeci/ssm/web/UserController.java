package com.etimeci.ssm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.User;
import com.etimeci.ssm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/goAddUser")
	public String goAddUser(){
		return "sysmgr/user_add";
	}
	
	
	@RequestMapping("/addUser")
	public String addUser(User user){
		//1.���ܲ���
		System.out.println(user);
		//2.����ҵ���߼�
		userService.insertUser(user);
		System.out.println(user);
		return "redirect:/listUser";
	}
	
	@RequestMapping("/listUser")
	public ModelAndView listUser(@RequestParam(required=true,defaultValue="1") Integer page,
			@RequestParam(required=true,defaultValue="2" ) Integer pageSize,
			String userName,
			
			String trueName){
		ModelAndView mv = new ModelAndView();
		
		System.out.println(userName + "====" + trueName);
		
		PageHelper.startPage(page, pageSize);
		List<User> list = userService.query(userName,trueName);
		PageInfo<User> p=new PageInfo<User>(list); //��ҳ��Ϣ
		mv.addObject("userlist", list);
		mv.addObject("page", p);
		mv.addObject("userName", userName);
		mv.addObject("trueName",trueName);
		mv.setViewName("/sysmgr/user_list");
		return mv;
	}
	
	/**
	 * �����¼
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		//1.��¼�ɹ��û���Ϣ����session
		
		return "main";
	}
	@RequestMapping("/main")
	public String main(){
		//1.��¼�ɹ��û���Ϣ����session
		
		return "main";
	}
	
	
	@RequestMapping("/goTop")
	public String top(){
		return "top";
	}
	
	@RequestMapping("/goLeft")
	public String left(){
		return "left";
	}
	@RequestMapping("/goRight")
	public String right(){
		return "right";
	}
	
}

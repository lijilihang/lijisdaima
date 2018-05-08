package com.etimeci.ssm.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.LoginService;
import com.etimeci.ssm.service.UserService;

@Controller
public class UserMessageController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/goUserMessageList")
    public ModelAndView goUserMessageList(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/userMessage/userMessageList");
        return mv;
        //return "userMessage/userMessageList";
    }

    @RequestMapping("/goChangPassword")
    public ModelAndView goChangPassword(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/userMessage/changePassword");
        return mv;
        //return "userMessage/changePassword";
    }

    @RequestMapping("/goRealName")
    public ModelAndView goRealName(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/userMessage/realName");
        return mv;
        //return "userMessage/realName";
    }

    @RequestMapping("/goSetUp")
    public ModelAndView goSetUp(HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/userMessage/setUp");
        return mv;
        //return "userMessage/setUp";
    }

    @RequestMapping("/selectUserMessage")
    @ResponseBody
    public List<UserMessage> selectUserMessage(HttpSession session) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        List<UserMessage> list1 = loginService.selectUserName(userMessage);
        int userId = userMessage.getUmId();
        List<UserMessage> list = userService.queryUserMessage(userId);
        return list;
    }
}

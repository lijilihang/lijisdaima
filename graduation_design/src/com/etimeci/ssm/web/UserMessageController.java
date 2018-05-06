package com.etimeci.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserMessageController {
    @RequestMapping("/goUserMessageList")
    public String goUserMessageList(){
        return "userMessage/userMessageList";
    }

    @RequestMapping("/goChangPassword")
    public String goChangPassword(){
        return "userMessage/changePassword";
    }

    @RequestMapping("/goRealName")
    public String goRealName(){
        return "userMessage/realName";
    }

    @RequestMapping("/goSetUp")
    public String goSetUp(){
        return "userMessage/setUp";
    }
}

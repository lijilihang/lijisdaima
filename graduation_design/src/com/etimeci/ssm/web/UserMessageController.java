package com.etimeci.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
        int userId = userMessage.getUmId();
        List<UserMessage> list = userService.queryUserMessage(userId);
        return list;
    }

    @RequestMapping("/changeImage")
    @ResponseBody
    public List<UserMessage> changeImage(HttpSession session, MultipartFile file) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        int userId = userMessage.getUmId();
        List<UserMessage> list = userService.queryUserMessage(userId);
        return list;
    }

    @RequestMapping("/changeUserMessage")
    @ResponseBody
    public List<Map<String, String>> changeUserMessage(HttpSession session, UserMessage message) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        int userId = userMessage.getUmId();
        message.setUmId(userId);
        Map<String, String> map = new HashMap<String, String>();
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Boolean insert = userService.updateUserMessage(message);
        if (insert == true) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }
        list.add(map);

        return list;
    }

    @RequestMapping("/changePassword")
    @ResponseBody
    public Map<String, String> changePassword(
            HttpSession session,
            @RequestParam(value="oriPassword",required=true,defaultValue="") String oriPassword,
            @RequestParam(value="newPassword",required=true,defaultValue="") String newPassword,
            @RequestParam(value="mateNewPassword",required=true,defaultValue="") String mateNewPassword
                                            ) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        int userId = userMessage.getUmId();
        Map<String, String> map = new HashMap<String, String>();

        if (newPassword.equals(mateNewPassword) && newPassword.length() >= 6) {
            if (userService.selectUserPasssord(userId).equals(oriPassword)) {
                if (userService.updatePassword(userId, newPassword)) {
                    map.put("status", "1");
                } else {
                    map.put("status", "2");
                }
            } else {
                map.put("status", "0");
            }
        } else {
            map.put("status", "3");
        }

        return map;
    }

    @RequestMapping("/getRealNameMessage")
    @ResponseBody
    public List<UserMessage> getRealNameMessage(HttpSession session) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        int userId = userMessage.getUmId();
        List<UserMessage> list = userService.queryRealNameMessage(userId);
        return list;
    }

    @RequestMapping("/changeRealNameMessage")
    @ResponseBody
    public Map<String, String> changeRealNameMessage(HttpSession session, UserMessage message) {
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        int userId = userMessage.getUmId();
        message.setUmId(userId);
        Map<String, String> map = new HashMap<String, String>();
        Boolean insert = userService.updateRealNameMessage(message);
        if (insert == true) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }
}
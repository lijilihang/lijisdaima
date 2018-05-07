package com.etimeci.ssm.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.EchartMapProvance;
import com.etimeci.ssm.entity.Login;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.LoginService;
import com.etimeci.ssm.service.RegisterService;

@Controller
public class RegisterLoginController {

    @Autowired
    private RegisterService registerService;
    @Autowired
    private LoginService loginService;

    // 跳到注册页面
    @RequestMapping("/goRegister")
    public String goRegister() {
        return "registerSystem/register";
    }

    @RequestMapping("/validRegister")
    @ResponseBody
    public Map<String, Integer> validRegister(UserMessage userMessage) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (userMessage.getUmPhone() != "") {
            List list = loginService.selectUserName(userMessage);
            if (list.isEmpty()) {
                map.put("umPhone", 1);
                return map;
            } else {
                map.put("umPhone", 2);
                return map;
            }
        } else {
            map.put("umPhone", 0);
            return map;
        }
    }

    // 注册成功
    @RequestMapping("/register")
    public String Register(UserMessage userMessage, HttpSession session) {
        if (userMessage.getUmPhone() != "" && userMessage.getUmPassword() != ""
                && userMessage.getUmPassword().equals(userMessage.getUmPasswordl())) {
            registerService.registerInsert(userMessage);
            userMessage.setUmPassword("");
            userMessage.setUmPasswordl("");
            session.setAttribute("user", userMessage);

            return "redirect:/goResuccess";
        } else {
            return null;
        }
    }

    @RequestMapping("/goExist") // 用户名已存在，中间页面
    public String goExist() {
        return "registerSystem/exist";
    }

    @RequestMapping("/goResuccess") // 注册成功，中间页面
    public ModelAndView goResuccess(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        UserMessage userMessage = (UserMessage) session.getAttribute("user");
        mv.addObject("userMessage", userMessage);
        mv.setViewName("/diaochawenjuan/index");
        return mv;
    }

    // 调到登陆页面
    @RequestMapping("/goLogin")
    public String goLogin() {
        return "registerSystem/login";
    }

    @RequestMapping(value = "/helloliji") // 测试ajax请求，返回json
    @ResponseBody
    public Map<String, UserMessage> hello(HttpServletResponse response) throws IOException {
        UserMessage u1 = new UserMessage();
        u1.setUmPhone("123456");
        u1.setUmCity("liji");
        UserMessage u2 = new UserMessage();
        u2.setUmPhone("654321");
        u2.setUmCity("jiki");
        Map<String, UserMessage> map = new HashMap<String, UserMessage>();
        map.put("name", u1);
        map.put("city", u2);
        ArrayList<Map<String, UserMessage>> list = new ArrayList<Map<String, UserMessage>>();
        list.add(map);
        return map;
    }

    @RequestMapping(value = "/loginVali") // 登录用户名验证
    @ResponseBody
    public List<UserMessage> loginVali(UserMessage userMessage) throws IOException {
        List<UserMessage> list = loginService.selectUserName(userMessage);
        return list;
    }

    @RequestMapping(value = "/loginValipass") // 登录用户名验证
    @ResponseBody
    public boolean loginValipass(Login login) throws IOException {
        if (login.getUmPhone().equals("18794886718") && login.getUmPassword().equals("123")) {
            return true;
        } else {
            return false;
        }
    }

    // 登录用户名密码验证，并登陆
    @RequestMapping(value = "/loginValidate",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Boolean>> loginValidate(UserMessage userMessage, HttpSession session) throws IOException {
        List<Map<String, Boolean>> list = new ArrayList<Map<String, Boolean>>();
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        if (userMessage.getUmPhone() == "" || userMessage.getUmPassword() == "" || userMessage.getUmVcode() == "") {
            map.put("response", false);
            list.add(map);
            return list;

        } else {
            List<UserMessage> list1 = loginService.selectUserName(userMessage);
            String strRand = (String) session.getAttribute("rand");
            String s = userMessage.getUmVcode();
            if (list1.isEmpty()) {
                map.put("umPhone", false);
                map.put("umPassword", false);
                map.put("vcode", false);
                list.add(map);
                return list;
            } else {
                if (list1.get(0).getUmPassword().equals(userMessage.getUmPassword())) {
                    if (s.toLowerCase().equals(strRand.toLowerCase())) {
                        map.put("umPhone", true);
                        map.put("umPassword", true);
                        map.put("vcode", true);
                        userMessage.setUmPassword("");
                        session.setAttribute("user", userMessage);
                        list.add(map);
                        return list;
                    } else {
                        map.put("umPhone", true);
                        map.put("umPassword", true);
                        map.put("vcode", false);
                        list.add(map);
                        return list;
                    }
                } else {
                    map.put("umPhone", true);
                    map.put("umPassword", false);
                    map.put("vcode", false);
                    list.add(map);
                    return list;
                }
            }
        }
    }

    // 中国地图
    @RequestMapping("/goEchartsMap")
    @ResponseBody
    public List<List<EchartMapProvance>> goEchartsMap() {
        System.out.println("中国地图");
        Map<String, Object> map1 = new HashedMap();
        List<List<EchartMapProvance>> listt = new ArrayList<List<EchartMapProvance>>();
        List<EchartMapProvance> a = registerService.selectMapA();
        List<EchartMapProvance> b = registerService.selectMapB();
        listt.add(a);
        listt.add(b);
        return listt;
    }

    // 修改datatables表
    @RequestMapping("/goUpdateTable")
    @ResponseBody
    public Boolean goUpdateTable(@RequestBody UserMessage userMessage) {
        Boolean result = registerService.updateDataTables(userMessage);
        return result;
    }

    // 删除datatables表
    @RequestMapping("/goDeleteTable")
    @ResponseBody
    public int goDeleteTable(Integer u_id) {
        int result = registerService.deleteDataTables(u_id, "ss");
        return result;
    }

    // 退出登录
    @RequestMapping("/goLayout")
    public ModelAndView goLayout(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        userMessage.setUmPhone("");
        userMessage.setUmEmail("");
        session.setAttribute("userMessage", userMessage);
        mv.setViewName("/registerSystem/login");
        return mv;
    }
}
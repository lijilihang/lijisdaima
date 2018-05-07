package com.etimeci.ssm.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @RequestMapping("/goIndexRegister1")
    public ModelAndView goIndexRegister1(HttpSession session) {
        // registerService.registerInsert(userMessage);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/diaochawenjuan/index");
        return mv;
    }

    @RequestMapping("/goAboutRegister")
    public String goAboutRegister(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/about";
    }

    @RequestMapping("/goContactRegister")
    public String goContactRegister(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/contact";
    }

    @RequestMapping("/goPro_dRegister")
    public String goPro_dRegister(HttpSession session) {
        // registerService.registerInsert(userMessage);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/pro_d";

    }

    @RequestMapping("/goProductRegister")
    public String goProductRegister(HttpSession session) {
        // registerService.registerInsert(userMessage);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/product";

    }

    @RequestMapping("/goServiceRegister")
    public String goServiceRegister(HttpSession session) {
        // registerService.registerInsert(userMessage);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/service";

    }

    @RequestMapping("/goSolutionRegister")
    public String goSolutionRegister(HttpSession session) {
        // registerService.registerInsert(userMessage);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userMessage", session.getAttribute("user"));
        return "diaochawenjuan/solution";
    }
}
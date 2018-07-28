package com.forson.li;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/asd")
    public ModelAndView asd() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }
}

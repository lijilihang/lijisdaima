package com.etimeci.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/websockets")
public class WebSocketController {

    @RequestMapping("/websocketTest1")
    public ModelAndView websocketTest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/webSocket/webSocketTest");
        return mv;
    }

}





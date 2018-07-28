package com.imooc.springvideo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liji
 */

@RestController
public class UserController {
    @RequestMapping("/userRequest")
    public Map<String, String> userRequest() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "2");
        return map;
    }

}

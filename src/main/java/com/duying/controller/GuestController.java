package com.duying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {

    @RequestMapping("/index")
    public String showIndex(){
        System.out.println("执行了");
        return "index";
    }
}

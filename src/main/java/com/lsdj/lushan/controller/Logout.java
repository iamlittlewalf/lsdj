package com.lsdj.lushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Logout {

    @ResponseBody
    @RequestMapping("/logout")
    public String login(){
        return "退出登陆接口";
    }
}

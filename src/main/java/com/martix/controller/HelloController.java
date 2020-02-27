package com.martix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
@Controller //控制器
class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World ! 周平宗";
    }

    @ResponseBody
    @RequestMapping("/springboot")
    public String HelloSpring(){
        return " My first one SpringBoot";
    }
}

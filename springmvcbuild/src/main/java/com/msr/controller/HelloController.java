package com.msr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public  String sayHello(){
        System.out.println("hello");
        return "success";
    }
}

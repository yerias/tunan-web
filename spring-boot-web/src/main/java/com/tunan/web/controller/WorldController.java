package com.tunan.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorldController {


    @RequestMapping("/sayWorld")
    @ResponseBody
    public String sayWorld(){
        return  "hello world";
    }

    @RequestMapping("/sayToo")
    @ResponseBody
    public String sayToo(){
        return  "hello sayToo";
    }
}

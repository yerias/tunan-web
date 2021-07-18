package com.tunan.aspectj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {

    @GetMapping("/save")
    public String save(){
        return "保存成功";
    }
}

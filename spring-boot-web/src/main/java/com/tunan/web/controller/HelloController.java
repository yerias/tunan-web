package com.tunan.web.controller;


import com.tunan.web.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/sayHello")
    public String sayHello(){
        return "我叫图南,开始学习SpringBoot";
    }


    @Autowired
    private Student student;

    @RequestMapping("/student")
    public String student(){
        return student.toString();
    }

}
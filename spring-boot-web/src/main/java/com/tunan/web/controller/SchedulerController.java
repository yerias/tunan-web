package com.tunan.web.controller;


import com.tunan.web.domain.Student;
import com.tunan.web.scheduler.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class SchedulerController {


    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("/async")
    public String async() throws Exception {

        long start = System.currentTimeMillis();

        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();

        long end = System.currentTimeMillis();
        System.out.println("总共 花费时间: " + (end - start));


        return "异步调用";
    }

}
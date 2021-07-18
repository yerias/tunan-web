package com.tunan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 同步
//@EnableScheduling
// 异步
@EnableAsync
public class TunanWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TunanWebApplication.class, args);
    }

}

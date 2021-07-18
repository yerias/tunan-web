package com.tunan.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tunan
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectJApplication {
    public static void main(String[] args) {
        SpringApplication.run(AspectJApplication.class, args);
    }
}

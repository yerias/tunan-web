package com.tunan.aspectj.controller;

import com.tunan.aspectj.AspectJApplication;
import com.tunan.aspectj.dao.TestDao;
import com.tunan.aspectj.dao.TestDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AspectJApplication.class)
public class AOPTest {

    @Autowired
    private TestDao testDaoAdvice;

    @Test
    public void test(){
        testDaoAdvice.save();
    }

}

package com.tunan.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * 声明一个切面
 */
@Aspect
@Component
public class MyAspect {

    // 需要进行切面编程处理的类(切入点)
    @Pointcut("execution( * com.tunan.aspectj.controller.AspectController.*(..))")
    private void myPointCut(){
    };


    /**
     * 切入点的方法: 前置通知
     * @param jp 获取目标对象信息
     */
//    @Before("myPointCut()")
    public void before(JoinPoint jp){
        System.out.print("前置通知: 模拟权限控制");
        System.out.println(",目标类对象: "+jp.getTarget()
        + ", 被增强处理的方法: "+jp.getSignature().getName());
    }

    /**
     * 切入点的方法: 后置返回通知
     * @param jp 获取目标对象信息
     */
//    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp){
        System.out.print("后置返回通知: 模拟删除临时文件");
        System.out.println(",被增强处理的方法: "+jp.getSignature().getName());
    }

    /**
     * 切入点的方法: 环绕通知
     * @param pjp ProceedingJoinPoint是JoinPoint的子接口，代表可以执行的目标方法
     * @return
     * @throws Throwable
     */
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕开始: 执行目标方法前,模拟开启事物");
        Object obj = pjp.proceed();
        System.out.println("环绕结束: 执行目标方法后,模拟关闭事物");
        return obj;
    }

    /**
     * 切入点的方法: 异常通知
     * @param e
     */
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void except(Throwable e){
        System.out.println("异常通知: 程序执行异常"+e.getMessage());
    }

    /**
     * 切入点的方法: 最终(后置)通知
     */
//    @After("myPointCut()")
    public void after(){
        System.out.println("最终通知: 模拟资源释放");
    }
}
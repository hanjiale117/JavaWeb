package com.it117.spring_boot_tlias.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component

public class MyAspect2 {

    @Pointcut("execution(* com.it117.spring_boot_tlias.service.DeptService.*(..))")
    private void pt(){}

    @Before("pt()")
    public void before(){
        log.info("MyAspect2");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        log.info("MyAspect2 around before..." );

        // 1.获取 目标对象的类名
        String stringName = proceedingJoinPoint.getTarget().getClass().getName();
        log.info("获取对象的类名为:{}",stringName);

        // 2.获取 目标方法的方法名
        String methodName = proceedingJoinPoint.getSignature().getName();
        log.info("目标方法的方法名:{}", methodName);

        // 3.获取 传入的参数
        Object[] args = proceedingJoinPoint.getArgs();
        log.info("目标方法运行时传入的参数:{}", Arrays.toString(args));

        // 4.放行 目标方法运行
        Object object = proceedingJoinPoint.proceed();

        // 5.获取 目标方法的返回值
        log.info("目标方法的返回值:{}", object);


        return null;
    }






}

package com.it117.spring_boot_tlias.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class aop {
//    @Pointcut("execution(* com.it117.spring_boot_tlias.service.*.*(..))")
    @Pointcut("execution(* com.it117.spring_boot_tlias.service.DeptService.delete()) ||" +
            "execution(* com.it117.spring_boot_tlias.service.DeptService.list())")
    //这个表达式的意思为只有匹配到第一个或者第二个 都会执行这个aop
    private void pt(){}
//    @Around("execution(* com.it117.spring_boot_tlias.service.*.*(..))") //切入点表达式
    @Around("pt()")
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //1.记录开始时间
        long begin = System.currentTimeMillis();
        System.out.println("1");
        Object result = proceedingJoinPoint.proceed();//运行原始的方法 抛出异常
        //这个result表示的是原始方法的返回值
        long end = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature()+"方法执行耗时:{}ms 2", end-begin);
        log.info(proceedingJoinPoint.getSignature()+"方法执行耗时:{}ms 3", end-begin);
        return result;
    }
    @Before("pt()")
    public void before(){
        System.out.println("before.....");
    }

}

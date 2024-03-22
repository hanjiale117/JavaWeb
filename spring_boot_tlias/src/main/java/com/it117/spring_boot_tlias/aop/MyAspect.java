package com.it117.spring_boot_tlias.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyAspect {
    @Pointcut("@annotation(com.it117.spring_boot_tlias.aop.MyLog)")
    private void pt(){}

    @Before("pt()")
    private void before(){
        log.info("MyAspect.." );
    }
}

package com.it117.spring_boot_tlias.aop;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Retention 用来描述这个注解什么时候生效
@Retention(RetentionPolicy.RUNTIME) //在程序运行时有效
@Target(ElementType.METHOD) // 作用于方法上 指定在哪些地方
public @interface MyLog {

}

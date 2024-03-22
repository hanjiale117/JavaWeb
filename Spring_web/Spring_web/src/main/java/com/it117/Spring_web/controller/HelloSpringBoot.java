package com.it117.Spring_web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
//@RestController 表示这个是请求处理类
@RestController
public class HelloSpringBoot {
//    表示浏览器在获取/hello时就会直接调用这个方法
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world!");
        return "hello world!";
    }

}

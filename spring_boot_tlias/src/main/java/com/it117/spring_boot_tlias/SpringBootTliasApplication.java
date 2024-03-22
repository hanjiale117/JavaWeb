package com.it117.spring_boot_tlias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

// WebFilter是javaweb的功能 而不是springboot的功能 所以需要在启动类加上注解@ServletComponentScan
@ServletComponentScan // 表示支持Servlet组件支持
@SpringBootApplication
public class SpringBootTliasApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTliasApplication.class, args);
    }

}

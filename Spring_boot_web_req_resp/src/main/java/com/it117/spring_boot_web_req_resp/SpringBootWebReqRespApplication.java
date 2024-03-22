package com.it117.spring_boot_web_req_resp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan({"dao","com.it117.spring_boot_web_req_resp"})
@SpringBootApplication
public class SpringBootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebReqRespApplication.class, args);
    }

}

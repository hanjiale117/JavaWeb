package com.itheima.config;

import com.itheima.service.DeptService;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置类
public class commonConfig {

    // 声明第三方Bean
    @Bean // 将当前对象的返回值对象交给IOC容器管理,称为IOC容器的bean
    public SAXReader saxReader(DeptService deptService){ // Bean对象默认为方法名 也就是这个saxReader
        return new SAXReader();
    }

}

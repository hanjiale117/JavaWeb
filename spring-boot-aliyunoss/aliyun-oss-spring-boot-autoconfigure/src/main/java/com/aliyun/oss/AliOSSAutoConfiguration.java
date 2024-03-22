package com.aliyun.oss;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // => @Component
@EnableConfigurationProperties(AliLOSSProperties.class) // 把这个类导入IOC容器 成为IOC容器的Bean
// EnableConfigurationProperties底层的代码自带@Import({EnableConfigurationPropertiesRegistrar.class})
public class AliOSSAutoConfiguration {

    // 将Aliyunoss声明为Bean对象
    @Bean
    public AliOSSUtils aliOSSUtils(AliLOSSProperties aliLOSSProperties){
        // 我们需要那个类 就直接在形参上表明

        AliOSSUtils aliOSSUtils =  new AliOSSUtils();
        aliOSSUtils.setAliLOSSProperties(aliLOSSProperties);
        // 返回值为Bean对象 注入到IOC容器

        return aliOSSUtils;
    }

}

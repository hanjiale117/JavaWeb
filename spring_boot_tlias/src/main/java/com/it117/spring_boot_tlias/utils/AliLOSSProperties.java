package com.it117.spring_boot_tlias.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
//指定前缀
public class AliLOSSProperties {
    private String endpoint ;
    private String accessKeyId ;
    private String accessKeySecret ;
    private String bucketName ;
}

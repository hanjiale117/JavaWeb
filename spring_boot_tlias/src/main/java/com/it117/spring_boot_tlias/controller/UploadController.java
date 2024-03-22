package com.it117.spring_boot_tlias.controller;

import com.it117.spring_boot_tlias.pojo.Result;
import com.it117.spring_boot_tlias.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;



@Slf4j
@RestController
public class UploadController {
    @Autowired
    private AliOSSUtils aliOSSUtils;

    //MultipartFile image 的形参名必须与前端页面中文件提交的name相等
    //如果前端和后端的文件名字不同
    //可以使用注解RequestParam
    //@RequestParam("image")MultipartFile file

    /**
     * 本地存储文件的代码
     * @param image
     * @return
     * @throws IOException
     */
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
//
//        log.info("文件上传:{},{},{}", username,age,image);
//
//        //UUID 通用唯一识别码
//        //将文件储存在E:\\WebFile
//        String originalFilename = image.getOriginalFilename();
//        int index = originalFilename.lastIndexOf(".");
//        String substring = originalFilename.substring(index);
//        String newFileName = UUID.randomUUID().toString()+substring;
//        log.info("新的文件名:{}",newFileName);
//        image.transferTo(new File("E:\\WebFile\\"+newFileName));
//
//        return Result.success();
//    }

    /**
     * 使用工具类进行上传文件
     * @param image
     * @return
     * @throws IOException
     */

    @PostMapping("/upload")
    public Result Upload(MultipartFile image) throws IOException {
        log.info("文件上传:{}", image.getOriginalFilename());

        //调用OSS工具类进行文件上传
        String url = aliOSSUtils.upload(image);
        log.info("文件上传的URL为:{}", url);

        return Result.success(url);
    }




}

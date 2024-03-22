package com.it117.spring_boot_web_req_resp.controller;
import com.it117.spring_boot_web_req_resp.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//@RestController
//public class RequestController {
//
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "OK";
//
//    }
//}

//springboot

//@RestController
//public class RequestController {
//
//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name, Integer age){
//        System.out.println(name+":"+age);
//        return "OK";
//
//    }
//}

@RestController
public class RequestController {

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name",required = false) String username, Integer age){
        System.out.println(username+":"+age);
        return "OK";

    }


    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "ok";
    }


    //使用数组来接受
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
        //[game, girl, food]
    }

    //使用集合来接受
    //默认接受为数组
    //需要加上@RequestParam

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "ok";
        //[1, 2, 3, 4]
    }

    @RequestMapping("/dateParam")
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime );
        return "ok";
        //2024-03-13T11:28:56
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "ok";
        //User{name='Dick', age=25, address=Address{province='beijing', city='shanghai'}}
    }



    //路径参数
    //1.
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer  id){
        System.out.println(id);
        return "ok";
    }

    //2.
    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer  id,@PathVariable String name){
        System.out.println(id+" "+name);
        return "ok";
    }






}

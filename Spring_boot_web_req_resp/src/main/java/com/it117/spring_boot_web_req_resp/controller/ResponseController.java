package com.it117.spring_boot_web_req_resp.controller;

import com.it117.spring_boot_web_req_resp.pojo.Address;
import com.it117.spring_boot_web_req_resp.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ResponseController {

//    @RequestMapping("/hello")
//    public String hello(){
//        System.out.println("hello world");
//        return "Hello world";
//        //作为响应体 返回数据
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr(){
//        Address addr = new Address();
//        addr.setProvince("shanghai");
//        addr.setProvince("beijing");
//        return addr;
//    }
//
//    @RequestMapping("/listArr")
//    public List<Address> addressList(){
//        ArrayList<Address> addresses = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("shanghai");
//        addr.setProvince("beijing");
//
//        Address addr2 = new Address();
//        addr.setProvince("shanghai1");
//        addr.setProvince("beijing2");
//
//        addresses.add(addr);
//        addresses.add(addr2);
//        return addresses;
//
//    }
//
//    @RequestMapping("/hello")
//    public Result hello(){
//        System.out.println("hello world");
////        return new Result(1,"success","Hello world");
//        return Result.success("hello world");
//        //作为响应体 返回数据
//
//        //{   json格式
//        //    "code": 1,
//        //    "msg": "success",
//        //    "data": "hello world"
//        //}
//    }
//
//    @RequestMapping("/getAddr")
//    public Result getAddr(){
//        Address addr = new Address();
//        addr.setProvince("shanghai");
//        addr.setProvince("beijing");
//        return Result.success(addr);
//    }
//
//    @RequestMapping("/listArr")
//    public Result addressList(){
//        ArrayList<Address> addresses = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("shanghai");
//        addr.setCity("beijing");
//
//        Address addr2 = new Address();
//        addr2.setProvince("shanghai1");
//        addr2.setCity("beijing2");
//
//        addresses.add(addr);
//        addresses.add(addr2);
//        return Result.success(addresses);
//
//        //{ json格式
//        //    "code": 1,
//        //    "msg": "success",
//        //    "data": [
//        //        {
//        //            "province": "shanghai",
//        //            "city": "beijing"
//        //        },
//        //        {
//        //            "province": "shanghai1",
//        //            "city": "beijing2"
//        //        }
//        //    ]
//        //}
//    }





}

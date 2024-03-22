package com.it117.spring_boot_web_req_resp.controller;

import com.it117.spring_boot_web_req_resp.pojo.Emp;
import com.it117.spring_boot_web_req_resp.pojo.Result;
import com.it117.spring_boot_web_req_resp.service.EmpService;
import com.it117.spring_boot_web_req_resp.service.impl.EmpServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController
@Controller
public class EmpController {
@Autowired //运行时 IOC容器会提供该类型的bean对象,并赋值给该变量 --依赖注入
    private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list(){

        List<Emp> empList = empService.listEmp();
        //响应数据
        return Result.success(empList);

//        //1.加载并解析xml文件
////        String file = " E:\\JavaWeb\\JavaWebSpringBoot\\Spring_boot_web_req_resp\\src\\main\\resources\\emp.xml";
//        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();//获取文件路径
//        System.out.println(file);
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        //2.对数据进行转换处理
//        empList.stream().forEach(emp -> {
//            //处理gender值
//            String gender = emp.getGender();
//            if ("1".equals(gender)){
//                emp.setGender("man");
//            } else if ("2".equals(gender)) {
//                emp.setGender("woman");
//            }
//
//            //处理job
//
//            String job = emp.getJob();
//            if ("1".equals(job)){
//                emp.setJob("讲师");
//            } else if ("2".equals(job)) {
//                emp.setJob("班主任");
//            }else if ("3".equals(job)) {
//                emp.setJob("就业指导");
//            }
//
//        });

        //响应数据
        //Result
//        return Result.success(empList);

    }
}

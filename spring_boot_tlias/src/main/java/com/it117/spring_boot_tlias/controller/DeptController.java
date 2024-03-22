package com.it117.spring_boot_tlias.controller;

import com.it117.spring_boot_tlias.anno.anno.Log;
import com.it117.spring_boot_tlias.pojo.Dept;
import com.it117.spring_boot_tlias.pojo.Result;
import com.it117.spring_boot_tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 部门管理Controller
 * 优化前的代码
 *
 * @return
 */

//@Slf4j // 这个注解 直接调用log.info的方法
//@RestController //将返回值转换为json返回
//public class DeptController {
//    @Autowired
//    private DeptService deptService; // 注入BEAM对象
//    //输出日志
//    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
//
//    //返回的结果为Result
//    //根据接口API文档去获取请求路径
//    @GetMapping("/depts")
//    //@RequestMapping(value = "/depts",method = RequestMethod.GET) = GetMapping("/depts)
//    //直接使用@GetMapping 就是设定这个请求方式为GET
//    //RequestMethod 为枚举类型
//    /**
//     * public enum RequestMethod {
//     *     GET,
//     *     HEAD,
//     *     POST,
//     *     PUT,
//     *     PATCH,
//     *     DELETE,
//     *     OPTIONS,
//     *     TRACE;
//     *     }
//     */
//    public Result list(){
//        //System.out.println("查询全部的部门数据");
//        //使用专业的输出日志方法
//        //调用service来获取数据
//        List<Dept> deptList = deptService.list();
//
//        log.info("查询全部的部门数据");
//        return Result.success(deptList);
//    }
//
//    //删除部门数据
//    //请求路基:/depts/{id}
//    //请求方式:DELETE
//    //该接口用于根据ID删除部门数据
//    //请求参数为部门的ID
//    //例如:/depts/1 通过请求路径来传递的
//    //为删除操作 不需要返回数据
//    //@pathVariable
//    //通过这个注解
//
//    @DeleteMapping("/depts/{id}")
//    public Result delete(@PathVariable String id){
//
//        log.info("根据ID来删除部门:{}",id);
//        //{}为参数占位符
//        //调用service来删除部门
//        deptService.delete(id);
//        return Result.success();
//    }
//
//
//    /**
//     * 新增部门
//     * @return
//     */
//    //请求参数为json格式
//    @PostMapping("/depts")
//    public Result add(@RequestBody Dept dept){
//        log.info("新增加一个部门:{}",dept);
//        //调用方法
//        deptService.add(dept);
//        return Result.success( );
//    }
//
//
//}


/**
 * 优化后的代码
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list() {
        List<Dept> deptList = deptService.list();
        log.info("查询全部的部门数据");
        return Result.success(deptList);
    }

    @Log
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据ID来删除部门:{}", id);
        deptService.delete(id);
        return Result.success();
    }

    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增加一个部门:{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result GetById(@PathVariable Integer id) {
        log.info("查询部门的{}", id);
        return Result.success(deptService.GetById(id));
    }

    @Log
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门:{}", dept);
        deptService.update(dept);
        return Result.success();
    }


}
package com.it117.spring_boot_tlias.controller;

import com.it117.spring_boot_tlias.anno.anno.Log;
import com.it117.spring_boot_tlias.pojo.Emp;
import com.it117.spring_boot_tlias.pojo.PageBean;
import com.it117.spring_boot_tlias.pojo.Result;
import com.it117.spring_boot_tlias.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理Controller
 */
@SuppressWarnings("all")
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    //@RequestParam(defaultValue = "1") 设置默认值
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        //日期需要指定时间格式
        log.info("分页查询,参数:{},{},{},{},{},{}", page, pageSize, name, gender, begin, end);
        //使用service方法进行测试
        PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
        return Result.success(pageBean);
    }


    @Log
    @DeleteMapping("/{ids}")
    //pathVariable路径参数
    public Result delete(@PathVariable List<Integer> ids) {

        log.info("执行批量删除操作,ids:{}", ids);
        empService.delete(ids);
        return Result.success();
    }

    @Log
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工,emp:{}", emp);
        empService.save(emp);
        return Result.success();
    }


    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据ID查询员工信息:{}", id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    @Log
    @PutMapping
    public Result update(@RequestBody Emp emp) {
        log.info("更新员工的信息:{}", emp);
        empService.update(emp);

        return Result.success();
    }


}

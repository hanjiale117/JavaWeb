package com.it117.spring_boot_tlias.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.it117.spring_boot_tlias.mapper.EmpMapper;
import com.it117.spring_boot_tlias.pojo.Emp;
import com.it117.spring_boot_tlias.pojo.PageBean;
import com.it117.spring_boot_tlias.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@SuppressWarnings("all")
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        //获取记录数
//        Long count = empMapper.count();
//        //获取分页查询的结果列表
//        List<Emp> pageList = empMapper.page((page - 1) * pageSize, pageSize);
//        //封装PageBeam
//        PageBean pageBean = new PageBean(count,pageList);
//        return pageBean;
//    }


    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        //设置分页查询的参数
        //page – 页码
        //pageSize – 每页显示数量
        PageHelper.startPage(page, pageSize);
        //进行查询
        List<Emp> empList = empMapper.list(name, gender, begin, end);
        Page<Emp> pageList = (Page) empList;//分页查询的结果
        //封装page类
        //pageList.getTotal()是获取总记录数
        //pageList.getResult()是获取结果列表
        PageBean pageBean = new PageBean(pageList.getTotal(), pageList.getResult());

        return pageBean;
    }

    @Override
    public void delete(List<Integer> ids) {

        empMapper.delete(ids);
    }


    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());

        empMapper.insert(emp);
    }


    @Override
    public Emp getById(Integer id) {

        return empMapper.getById(id);
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUsernameAndPassword(emp);
    }
}

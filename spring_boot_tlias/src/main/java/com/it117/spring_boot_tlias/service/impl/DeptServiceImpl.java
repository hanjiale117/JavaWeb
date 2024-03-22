package com.it117.spring_boot_tlias.service.impl;

import com.it117.spring_boot_tlias.mapper.DeptMapper;
import com.it117.spring_boot_tlias.mapper.EmpMapper;
import com.it117.spring_boot_tlias.pojo.Dept;
import com.it117.spring_boot_tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Dept> list() {
        // service中调用mapper的接口中的方法
        return deptMapper.list();
    }


    // 一般在执行数据层进行多次的增删改的业务方法上进行添加
    // @Transactional() //用来进行事务管理
    @Transactional(rollbackFor = Exception.class) //表示出现所有异常都会进行回滚
    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
        empMapper.deleteByDeptId(id); // 根据部门id去删除该部门下的员工
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        //传入的对象含 ID NAME
        deptMapper.update(dept);
        //回显数据
    }

    @Override
    public Dept GetById(Integer id) {
        return deptMapper.GetById(id);
    }


}

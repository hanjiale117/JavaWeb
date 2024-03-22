package com.it117.spring_boot_tlias.service;

import com.it117.spring_boot_tlias.pojo.Dept;

import java.util.List;
/**
 * 部门管理
 */
public interface DeptService {

    /**
     * 查询全部的部门数据
     *
     * @return
     */
    List<Dept> list();

    /**
     * 删除方法
     *
     * @param id 删除的部门id
     */
    void delete(Integer id);


    /**
     * 新增部门
     *
     * @param dept 新增的部门的请求体
     */
    public void add(Dept dept);

    /**
     * 传入一个Dept对象
     * 根据传入的ID来寻找这个对象
     * 然后更改名字
     *
     * @param dept
     */
    public void update(Dept dept);


    /**
     * 进行回显
     * 查询部门
     *
     * @param id 查询部门的ID
     */
    public Dept GetById(Integer id);


}

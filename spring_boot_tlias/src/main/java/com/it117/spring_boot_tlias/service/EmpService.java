package com.it117.spring_boot_tlias.service;

import com.it117.spring_boot_tlias.pojo.Emp;
import com.it117.spring_boot_tlias.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
public interface EmpService {
    /**
     * 进行分页查询
     *
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize,
                  String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    void save(Emp emp);

    Emp getById(Integer id);

    void update(Emp emp);

    Emp login(Emp emp);
}

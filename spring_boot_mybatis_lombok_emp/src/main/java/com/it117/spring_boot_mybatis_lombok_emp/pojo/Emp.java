package com.it117.spring_boot_mybatis_lombok_emp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data //数据
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;//图像URL
    private Short job; //职位 1.班主任 2.讲师 3.学工主管 4.教研主管 5.咨询师
    private LocalDate entrydate; // 入职日期 年月日 LocalDate
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

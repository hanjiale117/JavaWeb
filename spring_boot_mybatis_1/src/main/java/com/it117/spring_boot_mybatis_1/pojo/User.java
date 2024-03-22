package com.it117.spring_boot_mybatis_1.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    //准备工作

    //推荐使用包装类型
    private Integer id;

    private String name;
    private Short age;
    private Short gender;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }

    public User(){

    }
    public User(Integer id, String name, Short age, Short gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

}

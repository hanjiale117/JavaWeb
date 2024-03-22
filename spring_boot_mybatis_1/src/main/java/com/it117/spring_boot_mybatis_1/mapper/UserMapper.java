package com.it117.spring_boot_mybatis_1.mapper;

import com.it117.spring_boot_mybatis_1.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //表示这是一个MyBatis的接口
//在运行时 会自动生成该接口的实现类对象(代理对象) 并且将该对象交给IOC容器管理
public interface UserMapper {
    //查询全部的用户信息
    @Select("select * from user")
    public List<User> list();

}

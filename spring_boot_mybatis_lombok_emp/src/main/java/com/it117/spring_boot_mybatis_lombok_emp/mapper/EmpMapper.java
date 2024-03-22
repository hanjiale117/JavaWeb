package com.it117.spring_boot_mybatis_lombok_emp.mapper;

import com.it117.spring_boot_mybatis_lombok_emp.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;


@Mapper // 程序在运行时 自动创建这个代理对象
public interface EmpMapper {


    //根据ID 删除数据
    @Delete("delete from emp where id = #{id}")
//    public int delete(Integer id);
    public void delete(Integer id);
    //delete有返回值 返回值是操作的记录数 删除一行就是返回1
    //获取这个返回值

    //增加员工
    @Options(keyProperty = "id",useGeneratedKeys = true)
    //keyProperty代表 获取的主键最终封装到emp的id属性当中
    //useGeneratedKeys代表 我们需要拿到生成的主键值
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    //更新员工对象
//    @Update("update emp set username = #{username} , name = #{name},gender = #{gender},image=#{image},job=#{job},entrydate= #{entrydate}," +
//            "dept_id= #{deptId},update_time= #{updateTime} " +
//            "where id = #{id}")
//    public void update(Emp emp);


 //   根据ID查询对象
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    //数据封装

  //  方法一: 给字段起名,让别名与实体类属性一致
//  @Select("select id, username, password, name, gender, image, job, entrydate," +
//          " dept_id deptId, create_time createTime, update_time updateTime" +
//          " from emp where id = #{id}")
//  public Emp getById(Integer id);
    //Emp(id=21, username=dick2, password=123456, name=dick2, gender=1, image=3.png, job=1,
    // entrydate=2000-01-01, deptId=1, createTime=2024-03-15T15:11, updateTime=2024-03-15T15:11)

//    //方法二:通过@Results,@Result注解手动映射封装
//
//    @Results({ //进行手动封装
//            @Result(column = "dept_id", property = "deptId"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })
//    @Select("select * from emp where id = #{id}")
//    public Emp getById(Integer id);
    //Emp(id=21, username=dick2, password=123456, name=dick2, gender=1, image=3.png, job=1,
    // entrydate=2000-01-01, deptId=1, createTime=2024-03-15T15:11, updateTime=2024-03-15T15:11)

    //不建议使用上述两种方法
    //方法三: 开启Mybatis的驼峰命名自动映射开关
    //application.properties 配置文件 添加开关
    //开启Mybatis的驼峰命名自动映射方法
    //mybatis.configuration.map-underscore-to-camel-case=true





//    //条件查询
//    @Select("select * from emp where name like '%${name}%'and gender = #{gender} and "+
//    "entrydate between #{begin} and #{end}"
//            +" order by update_time desc")
//    // ${}不会进行预编译
//    // #{}会进行预编译 #{}不能出现在""中 所以使用${}来代替#{}
//    public List<Emp> list (String name, Short gender, LocalDate begin, LocalDate end);
//    条件查询
//    @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and "+
//            "entrydate between #{begin} and #{end}"
//            +" order by update_time desc")
    public List<Emp> list (String name, Short gender, LocalDate begin, LocalDate end);


    //动态更新SQL语句
    //更新员工对象

    public void update(Emp emp);

    public void deleteByIds(List<Integer> ids);
}

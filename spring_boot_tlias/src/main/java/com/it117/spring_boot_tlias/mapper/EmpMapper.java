package com.it117.spring_boot_tlias.mapper;

import com.it117.spring_boot_tlias.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
@Mapper
public interface EmpMapper {
    /**
     * 查询总记录数
     * @return 记录数
     */
//    @Select("select  count(*) from emp")
//    public Long count();
//
//    /**
//     * 分页查询获取列表式
//     * @param start 开始页码
//     * @param pageSize 查询的记录数
//     */
//    @Select("select * from emp limit #{start}, #{pageSize}")
//    public List<Emp> page(Integer start, Integer pageSize);


    /**
     * 员工信息查询插件的使用pageHelper
     *
     * @return 返回为Emp的List
     */
    // @Select("select * from emp")
    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 批量删除的操作
     *
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工
     */
    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);


    /**
     * 查询员工信息
     *
     * @param id 要查询员工的ID
     * @return 返回的是查询员工的信息
     */
    @Select("select * from emp where id = #{id} ")
    Emp getById(Integer id);


    void update(Emp emp);

    /**
     * 根据用户名和密码去查询用户
     * @param emp
     * @return
     */
    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getByUsernameAndPassword(Emp emp);

    /**
     * 根据部门的Id 来删除该部门下的全部员工的数据
     * @param deptId 部门id
     */
    @Delete("delete from emp where dept_id =#{deptId}")
    void deleteByDeptId(Integer deptId);
}

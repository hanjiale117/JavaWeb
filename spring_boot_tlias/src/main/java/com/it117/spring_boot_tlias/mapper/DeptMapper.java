package com.it117.spring_boot_tlias.mapper;

import com.it117.spring_boot_tlias.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {

    //查询全部的部门数据的
    //mapper接口 发送查询的信息 最终将数据发送给Service
    //在发送给Controller
    @Select("select * from dept")
    List<Dept> list();


    /**
     *     删除部门数据
     *     请求路基:/depts/{id}
     *     请求方式:DELETE
     *     该接口用于根据ID删除部门数据
     *     请求参数为部门的ID
     *     例如:/depts/1 通过请求路径来传递的
     *     为删除操作 不需要返回数据
     */


    /**
     * 根据ID来删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    @Insert("insert into dept (name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    public void insert(Dept dept);

    /**
     * 更新部门信息
     * @param dept
     */
    @Update("update dept set name = #{name} , update_time = #{updateTime} where id = #{id} ")
    public void update(Dept dept);

    /**
     * 进行回显
     * @param id 回显部门的ID
     */
    @Select("select * from  dept where  id = #{id}")
    Dept GetById(Integer id);



}

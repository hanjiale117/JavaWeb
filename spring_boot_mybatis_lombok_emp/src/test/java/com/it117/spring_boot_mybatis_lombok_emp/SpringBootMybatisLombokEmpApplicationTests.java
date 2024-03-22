package com.it117.spring_boot_mybatis_lombok_emp;

import com.it117.spring_boot_mybatis_lombok_emp.mapper.EmpMapper;
import com.it117.spring_boot_mybatis_lombok_emp.pojo.Emp;
import org.apache.ibatis.annotations.Options;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootMybatisLombokEmpApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
//        int delete = empMapper.delete(16);
//        System.out.println(delete);
        empMapper.delete(16);
    }

//    @Test
//    public void testInsert(){
//        Emp emp = new Emp();
//        emp.setUsername("dick");
//        emp.setName("dick");
//        emp.setImage("1.png");
//        emp.setGender((short) 1);
//        emp.setJob((short) 1);
//        emp.setEntrydate(LocalDate.of(2000, 1, 1));
//        emp.setCreateTime(LocalDateTime.now());
//        emp.setUpdateTime(LocalDateTime.now());
//        emp.setDeptId(1);
//        empMapper.insert(emp);
//    }


    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("dick3");
        emp.setName("dick3");
        emp.setImage("3.png");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
        empMapper.insert(emp);
        System.out.println(emp.getId());
        //21
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("dick");
        emp.setName("dick");
        emp.setImage("3.png");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
        empMapper.update(emp);
    }



    @Test
    public void testGetById(){
        Emp emp = empMapper.getById(21);
        System.out.println(emp);
    }
    //Emp(id=21, username=dick2, password=123456, name=dick2, gender=1, image=3.png, job=1,
    // entrydate=2000-01-01, deptId=1, createTime=2024-03-15T15:11, updateTime=2024-03-15T15:11)


//    @Test
//    public void testList() {
//        List<Emp> empList = empMapper.list("d", (short) 1,
//                LocalDate.of(20, 1, 1), LocalDate.of(2025, 1, 1));
//        System.out.println(empList);
//    }
    //<==    Columns: id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time
    //<==        Row: 18, dick, 123456, dick, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:01:43, 2024-03-15 15:31:36
    //<==        Row: 22, dick3, 123456, dick3, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:12:03, 2024-03-15 15:12:03
    //<==        Row: 21, dick2, 123456, dick2, 1, 3.png, 1, 2000-01-01, 1, 2024-03-15 15:11:00, 2024-03-15 15:11:00
    //<==      Total: 3

    @Test
    public void testList() {
        List<Emp> empList = empMapper.list("d", (short) 1,
                null, null);
        System.out.println(empList);
    }

    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(12,13,15);
        //基于Array这个类的asList方法进行集合
        empMapper.deleteByIds(ids);
    }
    //==>  Preparing: delete from emp where id in ( ? , ? , ? )
    //==> Parameters: 12(Integer), 13(Integer), 15(Integer)
    //<==    Updates: 3







}

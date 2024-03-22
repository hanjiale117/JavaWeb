package com.it117.spring_boot_web_req_resp.service.impl;

import dao.EmpDao;
import com.it117.spring_boot_web_req_resp.pojo.Emp;
import com.it117.spring_boot_web_req_resp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();

        //2.对数据进行转换处理
        empList.stream().forEach(emp -> {
            //处理gender值
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("man");
            } else if ("2".equals(gender)) {
                emp.setGender("woman");
            }

            //处理job

            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }

        });

        return empList;

    }
}

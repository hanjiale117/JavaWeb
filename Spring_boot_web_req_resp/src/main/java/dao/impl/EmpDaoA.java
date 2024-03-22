package dao.impl;

import dao.EmpDao;
import com.it117.spring_boot_web_req_resp.pojo.Emp;
import com.it117.spring_boot_web_req_resp.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
//@Component //表示当前类交给IOC管理
@Repository
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();//获取文件路径
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}

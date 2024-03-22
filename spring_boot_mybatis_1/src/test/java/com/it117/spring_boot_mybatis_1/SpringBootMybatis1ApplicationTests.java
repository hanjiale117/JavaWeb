package com.it117.spring_boot_mybatis_1;

import com.it117.spring_boot_mybatis_1.mapper.UserMapper;
import com.it117.spring_boot_mybatis_1.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//Springboot整合单元测试的注解
class SpringBootMybatis1ApplicationTests {

	@Autowired
	private UserMapper userMapper;
	//根据依赖注入IOC容器去寻找这个

	@Test
	void contextLoads() {
		List<User> userList = userMapper.list();

		userList.stream().forEach(user -> {
			System.out.println(user);
		});
	}
	//自动加载SpringBoot的环境

}

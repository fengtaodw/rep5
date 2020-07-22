package com.itheima.service;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void play() {
      //1:加载Spring的核心配置文件,加载配置之后，Spring会自动的将配置文件中所有的bean标签对应的类创建
        //并将创建的所有对象放到Spring容器中
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2:从Spring容器中获取我想要的对象.参数是<bean>标签的Id值
        //UserService userService = (UserService) context.getBean("userService");
        UserService userService = context.getBean("userService", UserService.class);
        userService.play();
    }
}
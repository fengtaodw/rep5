package com.itheima.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testUser(){
        //1:加载核心配置文件
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      //2:获取容器中的对象
        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        User user3 = context.getBean("user", User.class);


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
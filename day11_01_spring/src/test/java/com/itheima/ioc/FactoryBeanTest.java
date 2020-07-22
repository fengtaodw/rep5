package com.itheima.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class FactoryBeanTest {

    @Test
    public void getUser() {
        //1:加载核心配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2:获取容器中的对象
        User user = context.getBean("user03", User.class);

        System.out.println(user);
    }
}
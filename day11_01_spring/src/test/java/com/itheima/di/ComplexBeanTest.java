package com.itheima.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ComplexBeanTest {

    @Test
    public void testComplexBean() {
        //1:加载核心配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("complexBean.xml");
        ComplexBean bean = context.getBean("complexBean", ComplexBean.class);

        System.out.println(bean);
    }
}
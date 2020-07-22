package com.itheima.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudent(){
        //创建对象
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        Student student = context.getBean("student", Student.class);
        //调用方法
        student.service();


        //销毁对象
        ((ClassPathXmlApplicationContext) context).close();
    }
}
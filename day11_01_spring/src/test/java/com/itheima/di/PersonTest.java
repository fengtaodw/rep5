package com.itheima.di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PersonTest {

    //通过set方法给对象赋值
    @Test
    public  void personTest(){
        //1:加载核心配置文件件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取对象
        Person person = context.getBean("person", Person.class);
        //打印对象
        System.out.println(person);
    }

    //通过有参构造给对象赋值
    @Test
    public  void personTest2(){
        //1:加载核心配置文件件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取对象
        Person person = context.getBean("person2", Person.class);
        //打印对象
        System.out.println(person);
    }

    //通过p简化来调用set方法给对象赋值
    @Test
    public  void personTest3(){
        //1:加载核心配置文件件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取对象
        Person person = context.getBean("person3", Person.class);
        //打印对象
        System.out.println(person);
    }

    //通过c简化来调用构造方法给对象赋值
    @Test
    public  void personTest4(){
        //1:加载核心配置文件件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取对象
        Person person = context.getBean("person4", Person.class);
        //打印对象
        System.out.println(person);
    }
}
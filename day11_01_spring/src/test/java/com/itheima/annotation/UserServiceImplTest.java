package com.itheima.annotation;

import com.itheima.xxx.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public void findUsers() {

        //1:加载核心配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationbean.xml");

        //2:获取对象1
        //默认情况下，每一个类的id就是当前类的名字，然后第一个字母小写
        UserServiceImpl userServiceImpl = context.getBean("myid", UserServiceImpl.class);
        userServiceImpl.findUsers();

        //3:获取对象2
        // //默认情况下，每一个类的id就是当前类的名字，然后第一个字母小写
        Student student = context.getBean("student", Student.class);
        student.study();

        //3:获取对象2
        // //默认情况下，每一个类的id就是当前类的名字，然后第一个字母小写
        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.teach();
    }
}
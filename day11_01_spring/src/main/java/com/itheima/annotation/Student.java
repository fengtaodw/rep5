package com.itheima.annotation;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void study(){
        System.out.println("学生学习");
    }
}

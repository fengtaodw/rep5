package com.itheima.life;

public class Student {
    public void init(){
        System.out.println("Spring创建对象");
    }

    public void service(){
        System.out.println("Student类的service方法！");
    }
    public void destroy(){
        System.out.println("Spring销毁对象");
    }
}

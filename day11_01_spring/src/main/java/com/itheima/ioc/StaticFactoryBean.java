package com.itheima.ioc;

public class StaticFactoryBean {

    public  static User getUser(){
        return  new User();
    }
}

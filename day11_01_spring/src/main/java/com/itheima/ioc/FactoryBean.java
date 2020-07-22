package com.itheima.ioc;

public class FactoryBean {

    public User getUser(){
        return new User();
    }
}
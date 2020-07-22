package com.itheima.service;

public class UserService {

    //当我们写一个类时，必须包含无参构造，因为Spring反射时，默认找的就是无参构造

    public UserService() {
    }

    public UserService(String username) {
        this.username = username;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void play(){
        System.out.println("UserService类中的play方法：username="+username);
    }
}

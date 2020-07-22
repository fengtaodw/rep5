package com.itheima.ioc;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       //Class clazz =  Class.forName("com.itheima.ioc.User");
       //
       // User user = (User)clazz.newInstance();
       // System.out.println(user);

        User user = getBean(User.class);
        System.out.println(user);

    }

    public static  <T> T  getBean(Class<T> clzz) throws IllegalAccessException, InstantiationException {

        return  (T)clzz.newInstance();
    }
}

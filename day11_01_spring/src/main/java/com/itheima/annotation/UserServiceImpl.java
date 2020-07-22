package com.itheima.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//<bean id = "userServiceImpl" class="com.itheima.annotation.UserServiceImpl">

/*

  理论上以下几个注解作用是一样的，加哪个都可以
   @Component    如果不确定是那一层,统统使用该注解
     注解的参数就是获取对象的id，不加默认就是当前第一个字母小写
   @Repository  建议在数据访问层  dao层的实现类上使用
    注解的参数就是获取对象的id，不加默认就是当前第一个字母小写
   @Service     建议在service层使用
      注解的参数就是获取对象的id，不加默认就是当前第一个字母小写
   @Controller  建议web层使用
     注解的参数就是获取对象的id，不加默认就是当前第一个字母小写
 */
@Component("myid")
@Service
@Controller
@Repository
public class UserServiceImpl implements UserService {
    @Override
    public void findUsers() {
        System.out.println("UserServiceImpl实现类执行了！");
    }
}

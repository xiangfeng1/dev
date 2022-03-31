package com.example.test;

import com.example.controller.UserController;
import com.example.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void test(){
        UserController userController = new UserController();
        List<User> list = userController.findAll();
        System.out.println(list);
    }
    @Test
    public void testContext(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean(User.class);
        UserController userController = applicationContext.getBean(UserController.class);
        System.out.println(user);
        System.out.println(userController);
        List<User> list = userController.findAll();
        System.out.println(list);
    }
}

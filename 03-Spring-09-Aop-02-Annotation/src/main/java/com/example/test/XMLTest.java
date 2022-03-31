package com.example.test;

import com.example.config.AopConfig;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    @Test
    public void testAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

        UserService userService = applicationContext.getBean(UserServiceImpl.class);

        userService.add();
    }
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();

        System.out.println("-------------华丽-------------");

        userService.update();
    }

}

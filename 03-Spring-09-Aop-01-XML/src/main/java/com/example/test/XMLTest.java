package com.example.test;

import com.example.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
   @Test
    public void test(){
       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService = applicationContext.getBean(UserService.class);
       userService.add();
       userService.update();
   }
}

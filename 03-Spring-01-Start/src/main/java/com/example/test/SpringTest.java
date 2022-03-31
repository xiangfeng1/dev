package com.example.test;

import com.example.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test(){
        //获取容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        //获取对象
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.findAll();

    }
}

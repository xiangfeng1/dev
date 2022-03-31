package com.example.test;

import com.example.config.JdbcConfig;
import com.example.entity.User;
import com.example.dao.JDBCTemplateDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class jdbcTemplateTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
        User user = templateDao.findById(1);
        System.out.println(user);

    }
}
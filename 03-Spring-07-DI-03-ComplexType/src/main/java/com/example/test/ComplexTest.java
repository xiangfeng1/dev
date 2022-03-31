package com.example.test;

import com.example.entity.complexType;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        complexType bean = applicationContext.getBean(complexType.class);
        System.out.println(bean);
    }
}

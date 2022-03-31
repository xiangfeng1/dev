package com.example.test;

import com.example.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateTest {
    @Test
    public void testConstrucyor(){
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
    @Test
    public void testFactory(){
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student2 = applicationContext.getBean("student2", Student.class);
        System.out.println(student2);
    }
    @Test
    public void testStatic(){
        //获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student3 = applicationContext.getBean("student3", Student.class);
        System.out.println(student3);
    }
}

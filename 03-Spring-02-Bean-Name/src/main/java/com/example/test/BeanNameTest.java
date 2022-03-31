package com.example.test;

import com.example.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameTest {
@Test
    public void testId(){
    //获取容器
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContest.xml");
    Student student= (Student)applicationContext.getBean("student");
    Student student1= (Student)applicationContext.getBean("没有了");
    System.out.println(student);
    System.out.println(student1);
}
}

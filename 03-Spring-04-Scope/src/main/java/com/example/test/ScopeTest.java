package com.example.test;

import com.example.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = applicationContext.getBean("student", Student.class);
        Student student2 = applicationContext.getBean("student", Student.class);

        System.out.println(student1);
        System.out.println(student2);


    }
}

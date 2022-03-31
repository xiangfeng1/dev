package com.example.test;

import com.example.dao.StudentDao;
import com.example.util.MyBatisUtil;
import com.example.entity.Student;
import org.junit.Test;

import java.util.List;

public class DruidTest {
    @Test
    public void test(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = studentDao.findAll();
        for (Student student:students
             ) {
            System.out.println(student);
        }
        MyBatisUtil.commit();
    }
}

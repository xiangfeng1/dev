package com.example.test;

import com.example.dao.StudentDao;
import com.example.entity.Student;
import com.example.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class DynamicSQLTest {
    @Test
    public void testUpdate(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1);
        student.setAge((byte)20);
        student.setName("李四");
        int affectedRows = studentDao.update(student);
        MyBatisUtil.commit();
    }
    @Test
    public void testFindStudent(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setGender("女");
        student.setAge((byte) 20);
        student.setId(1);
        List<Student> students = studentDao.findByStudent(student);
        for (Student temp : students) {
            System.out.println(temp);
        }
        }
    @Test
    public void testFindKeyword(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = studentDao.findByKeyword("%张%",52);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testFindAll() {
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

}

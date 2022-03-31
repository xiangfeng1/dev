package com.example.test;


import com.example.dao.StudentDao;
import com.example.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyBatisTest {
@Test
    public void testInsert(){
    try {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张强1");
        student.setAge((byte)52);
        student.setGender("男");
        student.setInfo("rfghjkhgf");

        int affecteRows = studentDao.insert(student);
        System.out.println("受影响的行数"+affecteRows);
        session.commit();
        session.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

@Test
    public void testDelete(){
    try {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        int affectedRows=studentDao.delete(21);
        System.out.println("受影响行数："+affectedRows);
        session.commit();
        session.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
    public void testUpdateInfo(){
    try {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setInfo("aaaaaaaaaaaaa");
        student.setId(22);
        int affectedRows = studentDao.update(student);
        System.out.println("受影响的行数："+affectedRows);
        session.commit();
        session.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
    public void testFindAll(){
    try {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        List<Student> students =studentDao.findAll();
        for (Student student : students) {
            System.out.println(student);
        }

        session.commit();

        session.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    @Test
    public void testGetIncrement() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = new Student();
            student.setName("狂拽酷炫霸");
            student.setAge((byte) 2);

            student.setGender("男");
            student.setInfo("未完待续...");

            int affectedRows = studentDao.getIncrement(student);

            System.out.println("是否成功：" + affectedRows);
            System.out.println("获取自增长的id：" + student.getId());

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindByKeyword() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findByKeyword("张强");

            for (Student student : students) {
                System.out.println(student);
            }

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindById() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findById(22);

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyBatisTest {
   @Test
    public void testInsertOnObject(){
       try {
           InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
           SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
           SqlSession session = factory.openSession();
           StudentDao studentDao = session.getMapper(StudentDao.class);
           Student student = new Student();
           student.setName("aaa");
           student.setAge((byte) 27);
           student.setGender("女");
           student.setInfo("规划局");

           int affectedRows = studentDao.insertStudent(student);

           System.out.println("受影响的行数：" + affectedRows);

           session.commit();

           session.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }


    @Test
    public void testInsert() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Map<String, Object> map = new HashMap<>();
            map.put("name", "张强");
            map.put("age", 20);
            map.put("gender", "男");
            map.put("birthday", new Date());
            map.put("info", "地虎侠");

            int affectedRows = studentDao.insert(map);

            System.out.println("受影响的行数：" + affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindByGenderAndName() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByGenderAndName("女", "李四");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindByAgeAndName() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByAgeAndName(20, "李四");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByIdAndName(1, "李四");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

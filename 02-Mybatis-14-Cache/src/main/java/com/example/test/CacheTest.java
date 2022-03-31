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

public class CacheTest {
    @Test
    public void testTwo(){
        try {
            InputStream reader = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = factory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            System.out.println("第一次查询");
            studentDao.findById(1);
            session.commit();
            System.out.println("第二次查询");
            studentDao.findById(1);

            Student student = new Student();
            student.setId(2);
            student.setInfo("测试缓存");

            studentDao.update(student);
            session.commit();

            SqlSession session1 = factory.openSession();
            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
            System.out.println("第三次查询");
            studentDao1.findById(1);
            session1.commit();
            System.out.println("第四次查询");
            studentDao1.findById(1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

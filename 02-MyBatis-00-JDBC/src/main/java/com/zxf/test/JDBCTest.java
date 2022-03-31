package com.zxf.test;

import com.zxf.entity.Student;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

public class JDBCTest {
    @Test
    public void testSelect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/rx04?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
            String username = "root";
            String password = "zxf18637258104";
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //执行sql语句和获取结果集
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getByte(3));
                student.setGender(resultSet.getString(4));
                student.setInfo(resultSet.getString(5));

                students.add(student);
            }
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
@Test
   public void testAdd(){
        try{
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/rx04?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
            String username = "root";
            String password = "zxf18637258104";
            String sql = "insert into student(name, age, gender, info) values (?, ?, ?, ?)";

            // 获取连接
            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "赵四");
            preparedStatement.setInt(2, 43);
            preparedStatement.setString(3, "男");
            preparedStatement.setString(4, "刘能");

            // 执行sql语句获取受影响的行数
            int affectedRows = preparedStatement.executeUpdate();

            System.out.println("受影响的行数：" + affectedRows);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        }
}




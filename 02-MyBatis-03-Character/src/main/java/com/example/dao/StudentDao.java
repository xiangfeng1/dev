package com.example.dao;

import com.example.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findGreaterThanAge(Integer age);
    //查询小于指定年龄的学生
    List<Student> findByLessThanAge(Integer age);


}

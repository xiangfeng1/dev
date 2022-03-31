package com.example.dao;


import com.example.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface StudentDao {


    int insertStudent(Student student);

    Student findByIdAndName(int i, String 李四);

    Student findByAgeAndName(int i, String 李四);

    Student findByGenderAndName(@Param("gender") String gender, @Param("name") String name);

    int insert(Map<String, Object> map);
}

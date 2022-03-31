package com.example.test;

import com.example.dao.EmployeeDao;
import com.example.util.MyBatisUtil;
import com.example.entity.Employee;
import org.junit.Test;

import java.util.List;

public class MoreTableTest {
    @Test
    public void test(){
        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);
        List<Employee> employees = employeeDao.findAll();
        for (Employee employee:employees) {
            System.out.println(employee);
        }
        MyBatisUtil.commit();
    }
}

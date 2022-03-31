package com.example.test;

import com.example.dao.UserDaoImpl;
import org.junit.Test;

public class UserTest {
@Test
    public void test(){
    UserDaoImpl userDao = new UserDaoImpl();
    userDao.findAll();
}
}

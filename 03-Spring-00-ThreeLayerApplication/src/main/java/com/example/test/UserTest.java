package com.example.test;

import com.example.dao.UesrDaoMySQLimpl;
import com.example.service.UserServiceImpl;
import org.junit.Test;

public class UserTest {
    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
    userService.setUserDao(new UesrDaoMySQLimpl());
    userService.userDateBase();
    }
}

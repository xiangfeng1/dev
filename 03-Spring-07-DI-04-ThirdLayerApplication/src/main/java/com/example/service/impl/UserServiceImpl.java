package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
   @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

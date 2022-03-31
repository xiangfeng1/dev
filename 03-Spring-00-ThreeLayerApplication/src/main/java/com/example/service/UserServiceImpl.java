package com.example.service;

import com.example.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void userDateBase() {
       userDao.userDateBase();
    }

    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

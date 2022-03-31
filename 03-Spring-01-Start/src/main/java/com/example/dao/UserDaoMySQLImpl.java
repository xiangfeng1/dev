package com.example.dao;

public class UserDaoMySQLImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("使用MySQL");
    }
}

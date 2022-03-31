package com.example.dao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("使用Oracle数据库");
    }
}

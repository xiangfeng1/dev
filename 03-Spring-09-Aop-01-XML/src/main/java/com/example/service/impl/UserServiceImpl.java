package com.example.service.impl;

import com.example.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add(){
        System.out.println("添加一个学生");
    }
    @Override
    public void update(){
        System.out.println("修改了学生的信息");
    }

}

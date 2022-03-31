package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    //自动装配，会从容器中找到对应的数据类型进行注入
    @Autowired
    private UserService userService;
    public List<User> findAll() {
        return userService.findAll();
    }
}

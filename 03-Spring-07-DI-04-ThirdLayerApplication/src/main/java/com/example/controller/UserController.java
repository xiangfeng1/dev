package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;

import java.util.List;

public class UserController {
   private UserService userService;

   public List<User> findAll() {
      return userService.findAll();
   }

   public void setUserService(UserService userService) {
      this.userService = userService;
   }
}

package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDaoMySQLImpl")
public class UserDaoMySQLImpl implements UserDao {
    @Override
    public List<User> findAll() {
        // 连接数据库....
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"sss","aaaa"));
        users.add(new User(2, "派大星", "666666"));
        users.add(new User(3, "章鱼哥", "人生无常，大肠包小肠"));

        return users;
    }
}

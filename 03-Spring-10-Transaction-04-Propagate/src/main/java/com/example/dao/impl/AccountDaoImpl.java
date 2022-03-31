package com.example.dao.impl;

import com.example.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void AddAccount(String name) {
        getJdbcTemplate().update("insert into account(name)values (?)",name);
    }
}

package com.example.dao;

public interface AccountDao {
    //加载
    void increaseMoney(Integer id,long money);
    //扣钱
    void decreaseMoney(Integer id,Long money);
}

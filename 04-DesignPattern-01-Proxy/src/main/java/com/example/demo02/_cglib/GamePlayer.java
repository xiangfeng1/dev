package com.example.demo02._cglib;

import com.example.demo02._jdk.GamePlay;

//游戏玩家，被代理代理，真实对象
public class GamePlayer implements GamePlay {
private  final String username;
public GamePlayer(String username){
    this.username = username;

}

    @Override
    public void login() {
        System.out.println(username + "使用 a 登录游戏ing");
    }

    @Override
    public void killBoss() {
        System.out.println(username + "使用 a 一刀999");
    }

    @Override
    public void upgrade() {
        System.out.println(username + "使用 a 升了一级");
    }
}







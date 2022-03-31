package com.example.demo02._static;

public class GamePlayer implements GamePlay{
    @Override
    public void login() {
        System.out.println("a登陆游戏中...");
    }

    @Override
    public void killBoss() {
        System.out.println("一刀999");
    }

    @Override
    public void upgrade() {
        System.out.println("恭喜升级");
    }
}

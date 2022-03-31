package com.example.demo02._static;

import org.junit.Test;

public class Client {
    @Test
    public void test(){
        //真实对象
        GamePlayer player = new GamePlayer();
        //代练
        GamePlayProxy proxy = new GamePlayProxy(player);
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}

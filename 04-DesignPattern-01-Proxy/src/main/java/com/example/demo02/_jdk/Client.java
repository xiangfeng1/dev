package com.example.demo02._jdk;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    @Test
    public void test(){
        GamePlayer player = new GamePlayer();
        InvocationHandler office = (InvocationHandler) new GameOffice(player);
       GamePlay proxy= (GamePlay) Proxy.newProxyInstance(player.getClass().getClassLoader(),player.getClass().getInterfaces(),office);


        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}

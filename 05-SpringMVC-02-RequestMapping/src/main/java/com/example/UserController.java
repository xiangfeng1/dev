package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(path = {"reqister1","reqister2","reqister3"})
    public void getParam(String name,Integer age){
        System.out.println(name+":"+age);
    }
}

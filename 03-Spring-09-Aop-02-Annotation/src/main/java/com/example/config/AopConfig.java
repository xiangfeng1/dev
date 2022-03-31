package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("example")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopConfig {

}

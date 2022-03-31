package com.example.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

@PropertySource("classpath:jdbc.properties")
//指定包扫描路径，会扫描指定包下的所有注解
@ComponentScan("example")
//当前类就是一个配置类
@Configuration
public class JdbcConfig {
    @Value("com.mysql.cj.jdbc.Driver")
    private String driverClassName;
    @Value("jdbc:mysql://localhost:3306/dev02?useSSL=false&characterEncoding=utf8&serverTimezone=UTC&allowPublicKeyRetrieval=true")
    private String url;
    @Value("root")
    private String user;
    @Value("zxf18637258104")
    private String password;

    //@Bean注解用于将指定方法的返回值作为容器中的对象
    //id就是方法名
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = null;
        Properties properties = new Properties();
        properties.setProperty("driverClassName", driverClassName);
        properties.setProperty("url",url);
        properties.setProperty("user",user);
        properties.setProperty("password",password);
        DataSource dataSource;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);
            jdbcTemplate = new JdbcTemplate(dataSource);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jdbcTemplate;
    }
}

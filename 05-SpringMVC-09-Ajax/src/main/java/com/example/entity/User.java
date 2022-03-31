package com.example.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class User {
private String name;
private Integer age;
private String gender;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Data birthday;

}

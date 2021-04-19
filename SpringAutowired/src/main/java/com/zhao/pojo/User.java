package com.zhao.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;
}

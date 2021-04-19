package com.zhao.pojo;

public class User {

    private String name;

    public User() {
        System.out.println("default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Hello, " + name);
    }
}

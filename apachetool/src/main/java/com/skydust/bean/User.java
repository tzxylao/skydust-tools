package com.skydust.bean;

/**
 * Created by laoliangliang on 2017/8/17.
 */
public class User {
    private String username;
    private int age;
    private String password;
    public User() {
    }
    public User(String username, int age) {
        super();
        this.username = username;
        this.age = age;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

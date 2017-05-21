package com.skydust.bean;

import com.skydust.annotation.S_table;

/**
 * Created by laoliangliang on 17/5/20.
 */
@S_table("person")
public class Person {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

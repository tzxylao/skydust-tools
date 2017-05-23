package com.skydust.bean;

/**
 * Created by laoliangliang on 17/5/20.
 */
//@S_table("person")
public class Person {
    private String name;

    private Integer age;

    private Hand hand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hand=" + hand +
                '}';
    }
}

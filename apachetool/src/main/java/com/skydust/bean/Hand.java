package com.skydust.bean;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class Hand {
    private String color;

    private String finger;

    public String getColor() {
        return color;
    }

    public Hand setColor(String color) {
        this.color = color;
        return this;
    }

    public String getFinger() {
        return finger;
    }

    public Hand setFinger(String finger) {
        this.finger = finger;
        return this;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "color='" + color + '\'' +
                ", finger='" + finger + '\'' +
                '}';
    }
}

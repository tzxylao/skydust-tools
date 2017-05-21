package com.skydust.bean;

/**
 * Created by laoliangliang on 17/5/21.
 */
public class Apple {

    /**
     * id : 3
     * color : red
     */

    private String id;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

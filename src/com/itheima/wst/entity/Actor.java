package com.itheima.wst.entity;

public class Actor {
    private String name;
    private Integer age;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

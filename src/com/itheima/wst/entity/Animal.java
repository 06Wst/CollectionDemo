package com.itheima.wst.entity;

abstract public class Animal {
    String name;
    int age;

    abstract public void eat() ;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

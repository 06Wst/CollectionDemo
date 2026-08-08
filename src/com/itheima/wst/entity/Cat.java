package com.itheima.wst.entity;

abstract public class Cat extends Animal {
    public Cat(String name, int age) {
        super(age, name);
    }
    abstract public void eat() ;
}

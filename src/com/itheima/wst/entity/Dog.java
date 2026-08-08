package com.itheima.wst.entity;

abstract public class Dog extends Animal {
    public Dog(String name, int age) {
        super(age, name);
    }
    abstract public void eat() ;
}

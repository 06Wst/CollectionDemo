package com.itheima.wst.entity;

public class LhCat extends Cat {
    public LhCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只名叫"+this.name+"的"+this.age+"岁的狸花猫在吃");
    }
}

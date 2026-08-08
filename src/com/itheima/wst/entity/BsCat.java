package com.itheima.wst.entity;

public class BsCat extends Cat {
    public BsCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只名叫"+this.name+"的"+this.age+"岁的波斯猫在吃");
    }

}

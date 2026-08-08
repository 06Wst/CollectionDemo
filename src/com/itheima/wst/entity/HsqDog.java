package com.itheima.wst.entity;

public class HsqDog extends Dog {
    public HsqDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只名叫"+this.name+"的"+this.age+"岁的哈士奇狗在吃");
    }
}

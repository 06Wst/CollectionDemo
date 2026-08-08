package com.itheima.wst.entity;

public class TaiDiDog extends Dog {
    public TaiDiDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只名叫"+this.name+"的"+this.age+"岁的泰迪狗在吃");
    }
}

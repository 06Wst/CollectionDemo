package com.itheima.wst.collection;

import com.itheima.wst.entity.Person;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Person p1=new Person("张三",18);
        Person p2=new Person("张三",18);
        int h1=p1.hashCode();
        int h2=p2.hashCode();
        System.out.println(h1==h2);            //没重写hashcode方法，false，重写，true




    }
}

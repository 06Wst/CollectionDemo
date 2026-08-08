package com.itheima.wst.collection;

import com.itheima.wst.entity.*;


import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new BsCat("波斯猫",1));
        list.add(new HsqDog("哈士奇狗",2));
        list.add(new TaiDiDog("泰迪狗",3));
        //keepPert1(list);
        keepPert2(list);
        //keepPert3(list);
        System.out.println("-----------------");

        ArrayList<Cat> l1 = new ArrayList<>();
        l1.add(new LhCat("狸花猫",1));
        l1.add(new BsCat("波斯猫",1));
        keepPert1(l1);
        //keepPert3(l1);
        System.out.println("-----------------");

        ArrayList<Dog> l2=new ArrayList<>();
        l2.add(new HsqDog("哈士奇狗",2));
        l2.add(new TaiDiDog("泰迪狗",3));
        keepPert3(l2);

    }
    public static void keepPert1(ArrayList<? extends Cat> list){
        for(Cat e:list){
            e.eat();
        }
    }
    public static void keepPert2(ArrayList<? extends Animal> list){
        for(Animal e:list){
            e.eat();
        }
    }
    public static void keepPert3(ArrayList<? extends Dog> list){
        for(Dog e:list){
            e.eat();
        }
    }
}
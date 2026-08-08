package com.itheima.wst.entity;

import java.util.ArrayList;

public class MyListUtil {
    public static <E> void addAll(ArrayList<E> l1,E e1,E e2){
        l1.add(e1);
        l1.add(e2);
    }
}

package com.itheima.wst.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //需求1
        TreeMap<Integer,String> t1=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;     //降序
            }
        });
        t1.put(1,"a");
        t1.put(2,"b");
        t1.put(3,"d");
        t1.put(4,"c");

        System.out.println(t1);           //会按照键自动排序
    }
}

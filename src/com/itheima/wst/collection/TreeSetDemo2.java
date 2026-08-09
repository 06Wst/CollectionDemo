package com.itheima.wst.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> t1=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();          //按照length排序
                if(i==0){
                    i=o1.compareTo(o2);          //按照字母顺序排序
                }
                return i;
            }
        });
    }
}

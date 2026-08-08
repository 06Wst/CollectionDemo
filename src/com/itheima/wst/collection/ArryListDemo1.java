package com.itheima.wst.collection;

import java.util.ArrayList;

public class ArryListDemo1 {
    public static void main(String[] args) {
        /*
        空参创建的集合，底层创建一个默认长度为0的数组
        添加第一个元素时，底层会创建一个新的长度为10的数组
        添加元素时，size增加并且作为下一个元素加入的索引
        满时，扩容1.5倍

        如果新添加一个数组，但是1.5倍长度不够，会以新数组的长度为准扩容
         */
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("a");
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("b");
        arr2.add("c");
        arr2.add("d");
        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}

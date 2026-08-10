package com.itheima.wst.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> m1=new LinkedHashMap<>();
        m1.put("a","aaa");
        m1.put("b","bbb");
        m1.put("c","ccc");
        m1.put("a","ddd");
        //打印顺序和存入顺序一致
        System.out.println(m1);
    }
}

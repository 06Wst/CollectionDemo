package com.itheima.wst.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> m1=new HashMap<>();
        m1.put("李昂","艾达");
        m1.put("伊森","米亚");
        m1.put("威斯克","瑞贝卡");

        //遍历：

        //键，通过keySet()方法获取键的集合
        Set<String> keys1=m1.keySet();
        for (String s : keys1) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (String s : keys1) {
            System.out.print(m1.get(s)+" ");           //通过get()方法获取值
        }
        System.out.println();
        System.out.println("-----------------");

        //键值对对象进行遍历
        Map<String,String> m2=new HashMap<>();
        m2.put("李昂","艾达");
        m2.put("伊森","米亚");
        m2.put("威斯克","瑞贝卡");
        //返回为存储entry对象的集合
        Set<Map.Entry<String, String>> entries1 = m2.entrySet();          //通过entrySet()方法获取键值对的集合
        for (Map.Entry<String, String> i : entries1) {
            System.out.print(i.getKey()+" ");      //通过getKey()方法获取键
            System.out.print(i.getValue()+" ");    //通过getValue()方法获取值
        }
    }
}

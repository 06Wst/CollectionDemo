package com.itheima.wst.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        HashMap<String,String> m1=new HashMap<>();
        m1.put("a","b");
        m1.put("c","d");
        m1.put("e","f");
        System.out.println(m1);

        //将map集合转换为数组集合
        Set<Map.Entry<String,String>> s1=m1.entrySet();
        Map.Entry<String,String> [] arr=new Map.Entry[s1.size()];     //toarray方法，保证传入的数组长度足够
        s1.toArray(arr);           //toarray方法，参数为转化元素存入的数组
        Map<String,String> m2= Map.ofEntries(arr);            //ofentries方法，参数为数组，返回不可变集合
        //m2.clear();             //不可修改
        System.out.println(m2);

        //简化
        Map<String,String> m3=Map.ofEntries(m1.entrySet().toArray(new Map.Entry[m1.size()]));
        System.out.println(m3);

        //更简化，jdk10新增
        Map<String,String> m4=Map.copyOf(m1);             //不可修改
        System.out.println(m4);
    }
}

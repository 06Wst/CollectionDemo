package com.itheima.wst.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 创建一个Set集合
        Set<String> s1=new HashSet<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        boolean b1=s1.add("a");      //添加重复元素失败
        System.out.println(s1);
        System.out.println(b1);

        //遍历
        Iterator<String> it1=s1.iterator();
        while (it1.hasNext()){
            String str=it1.next();
            System.out.print(str+" ");
        }
        System.out.println();

        for (String s : s1) {
            System.out.print(s+" ");
        }
        System.out.println();

        s1.forEach(s-> System.out.print(s+" "));
        System.out.println();
    }
}

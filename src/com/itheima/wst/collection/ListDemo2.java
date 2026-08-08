package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        //list的遍历方式

        List<String> l1=new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        //迭代器
        Iterator<String> it1=l1.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        System.out.println();

        //增强for
        for (String s: l1){
            System.out.print(s+" ");
        }
        System.out.println();

        //lambda表达式
        l1.forEach(s-> System.out.print(s+" "));
        System.out.println();

        //普通for
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        //列表迭代器
        ListIterator<String> it2=l1.listIterator();
        while (it2.hasNext()){
            String s=it2.next();
            System.out.print(s+" ");
            if(s.equals("c")){
                it2.add("d");                //list迭代器可以添加元素
            }
        }
        for (String s : l1) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> l1=new ArrayList<>();
        l1.add("a");
        l1.add("b");

        //独有方法

        //add
        l1.add(2,"c");
        System.out.println(l1);

        //remove
        l1.remove(0);
        System.out.println(l1);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l2.remove(1);        //因为list对collection的remove方法进行了重载，参数为int
        //判断是删除索引还是对象？
        /*
        看参数类型，游戏爱你选择与参数类型相近的，此处为int的1，而删除对象的remove参数为object，所以删除索引
        那么怎么删除对象1呢？
        可以通过手动装箱，实现传入对象为1
         */
        System.out.println(l2);

        Integer i=1;        //手动装箱，实现了删除对象，因为integer对象类型和object更近
        l2.remove(i);
        System.out.println(l2);
    }
}

package com.itheima.wst.collection;

import com.itheima.wst.entity.Stu1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(5);
        t1.add(4);
        System.out.println(t1);

        Iterator<Integer > it1=t1.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next()+" ");
        }
        System.out.println();

        TreeSet<Stu1> t2=new TreeSet<>();
        t2.add(new Stu1("张三",1));
        t2.add(new Stu1("李四",2));
        t2.add(new Stu1("王五",3));
        System.out.println(t2);
    }
}

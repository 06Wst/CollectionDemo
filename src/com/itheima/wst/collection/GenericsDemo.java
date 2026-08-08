package com.itheima.wst.collection;

import com.itheima.wst.entity.MyArrayList;
import com.itheima.wst.entity.MyArrayList1;
import com.itheima.wst.entity.MyArrayList2;
import com.itheima.wst.entity.MyListUtil;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();         //不用泛型，add参数为 object
        l1.add("a");
        l1.add(1);
        System.out.println(l1);
        System.out.println(l1.get(1));

        MyArrayList<String> l2=new MyArrayList<>();
        l2.add("a");
        l2.add("b");
        System.out.println(l2.get(1));

        ArrayList<String> l3=new ArrayList<>();
        MyListUtil.addAll(l3,"c","d");
        System.out.println(l3);

        MyArrayList1 l4=new MyArrayList1();
        l4.add("a");           //必须为String类型


        MyArrayList2 l5=new MyArrayList2();
        l5.add("a");            //参数为object类型
    }
}

package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");

        /*
        方法底层是增强for循环，再把循环得到的元素传给accept方法
         */
        col.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });

        System.out.println();
        //lambda表达式
        col.forEach(s-> System.out.print(s+" "));

    }
}

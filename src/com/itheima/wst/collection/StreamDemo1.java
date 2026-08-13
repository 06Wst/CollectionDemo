package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
        获取流
         */

        //单列集合
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"a","b","c");
        //基础写法，不常用
        /*Stream<String>s1= l1.stream();
        s1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });*/

        //简化写法，常用，链式编程
        l1.stream().forEach(s-> System.out.print(s+" "));
        System.out.println("======================");

        //双列集合
        HashMap<String,String> m1=new HashMap<>();
        m1.put("a","b");
        m1.put("c","d");
        //双列集合无法直接获取流，需要先转化为单列集合，再获取流
        //法1
        m1.keySet().stream().forEach(s-> System.out.print(s+" "));
        System.out.println();
        //法2
        m1.entrySet().stream().forEach((e)-> System.out.println(e.getKey()+":"+e.getValue()));
        System.out.println("======================");

        //数组
        int []arr={1,2,3,4,5};          //存储元素既可以是基本类型，也可以是引用类型
        Arrays.stream(arr).forEach((i)-> System.out.print(i+" "));
        System.out.println();
        System.out.println("======================");

        //一堆零散数据，可以使基本类型，也可以是引用类型
        Stream.of(1,2,3,4).forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println("======================");
        //此方法也可以传递数组，但是数组的元素必须不能是基本类型，否则会输出地址
        Stream.of(arr).forEach(i-> System.out.print(i+" "));
        System.out.println();
        //引用数据类型就可以直接打印
        Stream.of(new String[]{"1","2","3"}).forEach(s-> System.out.print(s+" "));

    }
}

package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"张无极","张三","李四","王五");

        //filter方法，过滤集合中的元素，参数为Predicate接口的实现类
        /*l1.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.startsWith("张")){
                    return true;
                }
                return false;
            }
        }).forEach(i-> System.out.print(i+" "));*/
        //简单写法
        l1.stream().filter(s->s.startsWith("张")).forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println("===========================");

        /*
        细节：
        中间方法返回新的Stream对象，原来的stream流只能用一次，建议链式编程
        修改stream流中的数据，不会影响原集合或数组中的数据
         */
        Stream<String> s1=l1.stream().filter(s->s.startsWith("张"));
        s1.forEach(i-> System.out.print(i+" "));
        System.out.println();
        //Stream<String> s2=s1.filter(s->s.length()>3);          //会报错，因为s1流只能用一次
        System.out.println("===========================");

        //limit
        ArrayList<String> l2=new ArrayList<>();
        Collections.addAll(l2,"张三","李四","王五","赵六");
        l2.stream().limit(2).forEach(i-> System.out.print(i+" "));           //限制流中元素的数量为2
        System.out.println();
        System.out.println("===========================");

        //skip方法，跳过前n个元素
        l2.stream().skip(2).forEach(i-> System.out.print(i+" "));           //跳过前2个元素
        System.out.println();
        System.out.println("===========================");

    }
}

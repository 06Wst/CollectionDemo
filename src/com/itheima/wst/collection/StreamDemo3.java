package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"张无极","张三","张无忌","李四","王五","张无忌");

        //distinct方法，去重，依赖hashcode方法和equals方法，因此自定义类时，需要重写这两个方法
        l1.stream().distinct().forEach(i-> System.out.print(i+" "));
        System.out.println();
        
        //map，转化数据类型
        ArrayList<String> l2=new ArrayList<>();
        Collections.addAll(l2,"张无忌-12","郭靖-15","胡蓉-24","柯镇恶-67","杨康-26");
        /*l2.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] sp=s.split("-");          //切割，以参数符号作为分隔符
                int age=Integer.parseInt(sp[1]);
                return age;
            }
        }).forEach(i-> System.out.print(i+" "));
        System.out.println();*/
        //lambda表达式写法
        l2.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(i-> System.out.print(i+" "));
        System.out.println();

        //concat，尽量保持类型一样，如果类型不一样，会转化成两个类型的共同父类
        ArrayList<String> l3=new ArrayList<>();
        Collections.addAll(l3,"张三","李四","王五","赵六");
        ArrayList<String> l4=new ArrayList<>();
        Collections.addAll(l4,"王1","麻子","王二","大帅");
        Stream.concat(l3.stream(),l4.stream()).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}

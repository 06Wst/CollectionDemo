package com.itheima.wst.test;

import com.itheima.wst.entity.Actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //test1
        ArrayList<Integer> l1=new ArrayList<>();
        Collections.addAll(l1,1,2,3,4,5,6,7,8,9,10);
        List<Integer> l2=l1.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());
        System.out.println(l2);

        //test2
        ArrayList<String> l3=new ArrayList<>();
        Collections.addAll(l3,"zhangsan 23","lisi 24","wangwu 25");
        Map<String,Integer> m1=l3.stream()
                .filter(i->Integer.parseInt(i.split(" ")[1])>24)
                .collect(Collectors.toMap(i->i.split(" ")[0],
                        i->Integer.parseInt(i.split(" ")[1])));
        System.out.println(m1);

        //test3
        ArrayList<String> boy=new ArrayList<>();
        Collections.addAll(boy,"张小帅,23","李很帅,24","王帅,25","赵小帅,26");
        ArrayList<String> girl=new ArrayList<>();
        Collections.addAll(girl,"杨亚茹,23","罗以雅,24","刘小浅,25","孙俪问,26","杨㛐负,25");
        List<String> b=boy.stream()
                .filter(i->i.split(",")[0].length()==3)
                .collect(Collectors.toList());
        List<String> g=girl.stream()
                .filter(i->i.split(",")[0].startsWith("杨"))
                .skip(1)
                .collect(Collectors.toList());
        List<Actor> a= Stream.concat(b.stream(),g.stream()).map(i->new Actor(i.split(",")[0],Integer.parseInt(i.split(",")[1]))).collect(Collectors.toList());
        System.out.println(a);
    }
}

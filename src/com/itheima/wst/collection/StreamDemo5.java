package com.itheima.wst.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"张无忌-男-23","赵敏-女-22","周芷若-女-21","周若-女-24");

        //收集到list集合，不会去重
        List<String> l2= l1.stream()
                .filter(i->i.split("-")[1].equals("男"))
                .collect(Collectors.toList());           //创建一个list集合
        System.out.println(l2);

        //收集到set集合，用于去重操作
        Set<String> s1=l1.stream()
                .filter(i->"女".equals(i.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(s1);

        //收集到map集合
        /*
        参数：
        1.键的提取器
        2.值的提取器
        提取器的两个泛型，泛型1表示流中的元素，泛型2表示键或值的类型
        apply方法：参数为流中的元素，返回值为键或值

        注意键不能重复
         */
        /*Map<String,Integer> map=l1.stream()
                .filter(i->"女".equals(i.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {         //参数1键的提取器，返回值为键
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                },new Function<String, Integer>() {           //参数2值的提取器
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }) );*/
        //lambda表达式
        Map<String,Integer> map=l1.stream()
                        .filter(i->"女".equals(i.split("-")[1]))
                        .collect(Collectors.toMap(i->i.split("-")[0],i->Integer.parseInt(i.split("-")[2])));
        System.out.println(map);
    }
}

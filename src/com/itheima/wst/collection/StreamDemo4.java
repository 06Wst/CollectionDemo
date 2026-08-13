package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo4 {
    public static void main(String[] args) {
        //終結方法

        //foreach
        ArrayList<String> l1=new ArrayList<>();
        Collections.addAll(l1,"a","b","c");
        l1.stream().forEach(i-> System.out.print(i+" "));
        System.out.println();

        //count统计流中元素的数量
        long count=l1.stream().count();
        System.out.println(count);

        //toArray
        Object[] arr=l1.stream().toArray();      //空参，返回Object类型数组
        System.out.println(Arrays.toString(arr));

        /*String[]arr2= l1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/
        String []arr2=l1.stream().toArray(v->new String[v]);
        System.out.println(Arrays.toString(arr2));
    }
}

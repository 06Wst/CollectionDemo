package com.itheima.wst.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
        创建不可变集合，参数为可变参数
        只能进行查询操作
         */
        //list
        List<String>l1=List.of("范闲","范健","杜子腾","李彩","王鑫");      //创建之后无法修改
        //l1.add("王鑫");              //无法修改
        //l1.set(0,"范闲");
        System.out.println(l1);

        //set
        /*
        获取一个不可变的set集合，元素不可重复
        参数为可变参数
         */
        Set<String> s1=Set.of("范闲","范健","杜子腾","李彩","王鑫");
        //s1.add("王鑫");              //无法修改
        System.out.println(s1);
        Iterator<String> it1=s1.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        System.out.println();
        System.out.println("-----------------");

        //map
        /*
        获取一个不可变的map集合，元素不可重复
        参数有上限，最多存10个键值对，因为map的of方法参数没有可变参数
        因为形参中只能有一个可变参数，而map是接受v和k，所以无法实现不可变集合

        如果要创建一个超过10个的键值对的不可变map集合，可以使用ofEntries方法
        参数为entry对象可变参数
         */
        Map<String,String> m1=Map.of("范闲","男","范健","男","杜子腾","男","李彩","女","王鑫","男");
        System.out.println(m1);
        Set<String> k=m1.keySet();
        for (String s : k) {
            System.out.print(s+":"+m1.get(s)+" ");
        }
        System.out.println();
    }
}

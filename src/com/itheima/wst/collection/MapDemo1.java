package com.itheima.wst.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m1=new HashMap<>();

        //添加或覆盖元素，如果key不存在，就添加，如果key存在，就覆盖
        //返回值是覆盖前的value，如果key不存在，就返回null
        m1.put("郭靖","黄蓉");
        m1.put("韦小宝","沐剑屏");
        String name=m1.put("郭靖","沐剑屏");
        System.out.println(name);

        //删除元素，返回值是删除前的value，如果key不存在，就返回null
        String res1=m1.remove("郭靖");
        System.out.println(res1);

        //清空
        System.out.println(m1);
        m1.clear();
        System.out.println(m1);

        //判断是否包含key或value
        m1.put("郭靖","黄蓉");
        boolean res2=m1.containsKey("郭靖");
        System.out.println(res2);
        boolean res3=m1.containsValue("黄蓉");
        System.out.println(res3);

        //判断是否为空
        boolean res4=m1.isEmpty();
        System.out.println(res4);

        //size
        System.out.println(m1.size());
    }
}

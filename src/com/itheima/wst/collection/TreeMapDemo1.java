package com.itheima.wst.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //练习2
        String str="aababcabcdabcde";
        TreeMap<Character,Integer> map=new TreeMap<>((o1,o2)->o1-o2);
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}

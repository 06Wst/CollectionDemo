package com.itheima.wst.collection;

import com.itheima.wst.entity.Stu2;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //练习1
        HashMap<Stu2,String> m1=new HashMap<>();
        m1.put(new Stu2("张三",1001),"张三");
        m1.put(new Stu2("李四",1002),"李四");
        m1.put(new Stu2("张三",1001),"王五");    //添加不了，并且覆盖
        m1.forEach((k,v)-> System.out.print(k+":"+v+","));
        System.out.println();
        System.out.println("------------");

        //练习2
        HashMap<String,Integer> m2=new HashMap<>();
        for(int i=0;i<5;i++){
            String str=sc.next();
            int num=sc.nextInt();
            if(!m2.containsKey(str)){
                m2.put(str,num);
            }else{
                m2.put(str,m2.get(str)+num);
            }
        }
        Set<String> s1=m2.keySet();
        String maxV="";
        int max=0;
        for (String s : s1) {
            System.out.println(s+":"+m2.get(s));
            if(m2.get(s)>max){
                max=m2.get(s);
                maxV=s;
            }
        }
        System.out.println("出现次数最多的字符串是"+maxV+"，出现了"+max+"次");

    }
}

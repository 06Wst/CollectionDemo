package com.itheima.wst.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
        抽到男生概率为70%，抽到女生概率为30%
        随机抽取
         */
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("范闲");
        arr1.add("范健");
        arr1.add("范通");
        arr1.add("杜子腾");
        arr1.add("朱艺群");

        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("杜琦燕");
        arr2.add("田密米");
        arr2.add("李彩");

        ArrayList<Integer> arr3=new ArrayList<>();
        Collections.addAll(arr3,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(arr3);
        Random r=new Random();
        int index=r.nextInt(arr3.size());         //获取0-9之间的随机整数
        Collections.shuffle(arr1);
        Collections.shuffle(arr2);
        int res=arr3.get(index);
        System.out.println(res);
        if(res==1){
            System.out.println(arr1.get(0));
        }else{
            System.out.println(arr2.get(0));
        }
    }
}

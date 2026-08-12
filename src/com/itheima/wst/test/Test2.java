package com.itheima.wst.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        Collections.addAll(arr1,"范闲","范健","杜子腾","李彩","王鑫");
        /*Random r=new Random();
        int index=r.nextInt(arr1.size());*/
        ArrayList<String> arr2=new ArrayList<>();
        for(int i=0;i<3;i++) {
            int len=arr1.size();
            while(len>0){
                Collections.shuffle(arr1);
                String name=arr1.remove(0);
                System.out.println(name);
                arr2.add(name);
                len--;
            }
            System.out.println(arr2);
            System.out.println(arr1);

            arr1.addAll(arr2);
            arr2.clear();
            System.out.println("-----------------");
        }
    }
}

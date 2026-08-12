package com.itheima.wst.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        ArrayList<String> arr1=new ArrayList<>();
        Collections.addAll(arr1,"南京市","徐州市","无锡市");
        map.put("江苏省",arr1);
        ArrayList<String> arr2=new ArrayList<>();
        Collections.addAll(arr2,"武汉市","十堰市","宜昌市");
        map.put("湖北省",arr2);
        ArrayList<String> arr3=new ArrayList<>();
        Collections.addAll(arr3,"北京市","天津市","天津市");
        map.put("河北省",arr3);

        map.forEach((s,arr)-> {
            System.out.print(s+" = ");
            for (String i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        });
    }
}

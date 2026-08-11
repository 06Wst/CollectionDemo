package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        //addall方法
        Collections.addAll(l1,"a","b","c","d","e","f");
        System.out.println(l1);

        //shuffle方法打乱集合
        Collections.shuffle(l1);
        System.out.println(l1);

        //sort方法排序
        Collections.sort(l1);
        System.out.println(l1);
        /*Collections.sort(l1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });*/
        Collections.sort(l1, (o1,o2)->o1.charAt(0)-o2.charAt(0));
        System.out.println(l1);

        //二分法查找
        int res=Collections.binarySearch(l1,"c");
        System.out.println(res);
        System.out.println("-----------------");

        //copy方法复制集合
        ArrayList<String> l2=new ArrayList<>(6);          //必须长度足够，实际上size会输出0，只是有6个null
        l2.add("g");
        l2.add("h");
        l2.add("i");
        l2.add("j");
        l2.add("k");
        l2.add("l");
        Collections.copy(l2,l1);
        System.out.println(l2);
        ArrayList<String> l3 = new ArrayList<>(l1);    //直接使用 arraylist 的构造方法复制集合
        System.out.println(l3);

        //fill方法填充集合
        Collections.fill(l3,"*");
        System.out.println(l3);

        //max/min方法获取最大最小值
        String res1=Collections.max(l2);     //不是数字比ASCII
        System.out.println(res1);

        //swap方法交换元素位置
        Collections.swap(l2,0,1);
        System.out.println(l2);
    }
}

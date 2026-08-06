package com.itheima.wst.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //iterator迭代器，遍历不依赖索引
        Collection<String> col=new ArrayList<>();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");

        Iterator<String> it=col.iterator();      //获取迭代器对象，相当于一个指针
        while(it.hasNext()){            //判断当前是否有元素，
            System.out.println(it.next());           //获取当前位置的元素，并将指针指向下一个元素
        }
        System.out.println("-----------------");

        //细节：
        /*
        报错：nosuchelementexception
        迭代器遍历完，不会复位，只能遍历一次
        循环中只能用一次next方法
        迭代器遍历时，不能用集合的方法增加或删除
         */
        //System.out.println(it.next());           //报错，因为指针指向位置没有元素，且不依赖索引，所以报错
        System.out.println(it.hasNext());           //遍历完不会复位，所以返回false
        Iterator<String> it2=col.iterator();      //所以再遍历需要重新获取迭代器对象
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("-----------------");

        Iterator<String> it3=col.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
            System.out.println(it3.next());
            /*
            next()方法是获取并移动元素，这里移动了两次
            所以如果集合长度为偶数，这样就不会报错，因为每次移动两次，所以不会超出范围
            如果是奇数，就会报错，因为最后一次next()越界
             */
        }
        System.out.println("-----------------");

        Iterator<String> it4=col.iterator();
        while(it4.hasNext()){
            //System.out.println(it4.next());
            //会报错，因为迭代器遍历时，不能用集合的方法增加或删除元素
            /*if(it.next().equals("b")){
                it.remove();
            }*/
            String str=it4.next();
            if(str.equals("b")){
                it4.remove();            //用迭代器删除元素，不会报错
            }
        }
        System.out.println(col);

    }
}

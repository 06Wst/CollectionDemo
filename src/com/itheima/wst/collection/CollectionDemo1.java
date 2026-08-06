package com.itheima.wst.collection;

import com.itheima.wst.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        集合的使用
        collection是接口，无法直接创建对象，只能创建他的实现类的对象
         */

        //add方法
        /*
        细节：
        list集合使用add方法，一定返回true，因为可重复
        set集合使用add方法，如果元素不存在，返回true，如果元素存在，返回false
         */
        Collection<String> co1=new ArrayList<String>();
        boolean res1=co1.add("aaa");
        System.out.println(co1);
        System.out.println(res1);
        System.out.println("-----------------");

        //clear方法
        co1.clear();
        System.out.println(co1);
        System.out.println("-----------------");

        //remove方法，因为这是共性的方法，所以参数不是索引，而是存储对象
        /*
        细节：
        remove方法，如果元素存在，返回true，如果元素不存在，返回false
         */
        co1.add("aaa");
        co1.add("bbb");
        boolean res2=co1.remove("aaa");
        System.out.println(co1);
        System.out.println(res2);
        System.out.println("-----------------");

        //contains方法，判断集合中是否包含指定的元素
        /*
        细节：
        底层是依靠equals方法判断元素是否相等
        如果是自定义类，需要重写equals方法

        那为什么string 类型也是equals方法，但是只要字符串相同也可以返回true？
        虽然string是引用数据类型，但是底层重写了equals方法，所以可以判断字符串是否相同
        因为string 类型是不可变的，所以字符串相同，返回true

         */
        boolean res3=co1.contains("aaa");
        System.out.println(res3);
        Collection<Student> stu=new ArrayList<Student>();
        stu.add(new Student(1,"aaa"));
        stu.add(new Student(2,"bbb"));
        System.out.println(stu.contains(new Student(1,"aaa")));    //如果不重写，因为这是两个对象，所以输出 false
        System.out.println("-----------------");

        //isEmpty方法，判断集合是否为空
        System.out.println(co1.isEmpty());
        System.out.println("-----------------");

        //size方法，返回集合中元素的个数
        System.out.println(co1.size());
    }
}

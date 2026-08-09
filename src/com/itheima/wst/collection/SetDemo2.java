package com.itheima.wst.collection;

import com.itheima.wst.entity.Stu;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Stu> s1=new HashSet<>();
        Stu stu1=new Stu("张三",1001);
        Stu stu2=new Stu("李四",1002);
        Stu stu3=new Stu("张三",1001);

        s1.add(stu1);
        s1.add(stu2);
        boolean b=s1.add(stu3);
        System.out.println(b);
        for (Stu stu : s1) {
            System.out.print(stu+" ");
        }
        System.out.println();
    }
}

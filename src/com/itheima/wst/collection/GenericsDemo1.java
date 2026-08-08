package com.itheima.wst.collection;

import com.itheima.wst.entity.Fu;
import com.itheima.wst.entity.Zi;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {

        ArrayList<Zi> l1=new ArrayList<Zi>();
        //method(l1);             //泛型方法不存在继承
        /*
        此时可以用通配符?
        ?  表示可以接收任意类型
        ? extends E  表示可以接收E类型及其子类
        ? super E  表示可以接收E类型及其父类
         */
        method(l1);            //此时可以

    }
    public static void method(ArrayList<? extends Fu> l1) {

    }
}

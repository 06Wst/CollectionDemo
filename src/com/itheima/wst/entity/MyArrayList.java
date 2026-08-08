package com.itheima.wst.entity;

public class MyArrayList<E> {
    private Object[] arr=new Object[10];
    private int size=0;

    public boolean add(E e) {
        arr[size]=e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) arr[index];            //原本是object，需要强制类型转换
    }


}

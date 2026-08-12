package com.itheima.wst.mymap;

import java.util.*;

public class PokerGame {
    static Map<Integer,String> map=new HashMap<>();          //存储牌的牌面和对应序号来进行排序
    static ArrayList<Integer> list=new ArrayList<>();        //存储牌的序号

    //准备牌，要在构造方法外，只需要准备一副牌
    //牌盒，静态
    //static ArrayList<String> deck=new ArrayList<>();             //版本1
    static {          //静态代码块，只执行一次，随着类的加载而加载
        String [] color={"♠","♥","♣","♦"};
        String [] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};    //按照牌面大小排序
        int no=1;           //编号
        // 需要先按照数字，在按照颜色，保证牌面大小顺序不出错
        for (String j : number) {
            for (String i : color) {
                //deck.add(i+j);
                map.put(no,i+j);
                list.add(no);
                no++;
            }
        }
        map.put(no,"小王");
        map.put(no+1,"大王");
        /*deck.add("小王");
        deck.add("大王");*/
    }


    public PokerGame() {
        //洗牌
        //Collections.shuffle(deck);
        //System.out.println(deck);
        Collections.shuffle(list);

        //发牌，使用TreeSet，因为TreeSet可以自动排序
        TreeSet<Integer> p1=new TreeSet<>();
        TreeSet<Integer> p2=new TreeSet<>();
        TreeSet<Integer> p3=new TreeSet<>();
        TreeSet<Integer> lord=new TreeSet<>();
        //遍历
        //版本1
        /*for (int i=0;i<deck.size();i++){
            String s=deck.get(i);
            if(i<=2){
                lord.add(s);
            }else if(i%3==0){
                p1.add(s);
            }else if(i%3==1){
                p2.add(s);
            }else{
                p3.add(s);
            }
        }*/
        for(int i=0;i<list.size();i++){
            int index=list.get(i);
            if(i<=2){
                lord.add(index);
            } else if (i % 3 == 0) {
                p1.add(index);
            } else if (i % 3 == 1) {
                p2.add(index);
            } else {
                p3.add(index);
            }
        }
        System.out.println(lord);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //看牌
        lookPoker("lord",lord);
        lookPoker("p1",p1);
        lookPoker("p2",p2);
        lookPoker("p3",p3);

        //排序
        System.out.println(map);

    }
    //初始版本
    /*public void lookPoker(String name,ArrayList<String> p){
        System.out.println(name+"的牌为："+p);
    }*/

    //排序方法1
    public void lookPoker(String name,TreeSet<Integer> p){
        System.out.print(name+"的牌为：");
        for (Integer i : p) {
            System.out.print(map.get(i)+", ");
        }
        System.out.println();
    }
}
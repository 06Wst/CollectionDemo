package com.itheima.wst.mymap;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌，要在构造方法外，只需要准备一副牌
    //牌盒，静态
    static ArrayList<String> deck=new ArrayList<>();
    static {          //静态代码块，只执行一次，随着类的加载而加载
        String [] color={"♠","♥","♣","♦"};
        String [] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String i : color) {
            for (String j : number) {
                deck.add(i+j);
            }
        }
        deck.add("小王");
        deck.add("大王");
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(deck);
        //System.out.println(deck);

        //发牌
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> lord=new ArrayList<>();
        //遍历
        for (int i=0;i<deck.size();i++){
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
        }

        //看牌
        lookPoker("lord",lord);
        lookPoker("p1",p1);
        lookPoker("p2",p2);
        lookPoker("p3",p3);
    }
    public void lookPoker(String name,ArrayList<String> p){
        System.out.println(name+"的牌为："+p);
    }
}
package com.itheima.wst.mymap;

import java.util.*;

//排序方法2
public class PokerGame1 {
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<>();

    static {          //静态代码块，只执行一次，随着类的加载而加载
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};    //按照牌面大小排序
        // 需要先按照数字，在按照颜色，保证牌面大小顺序不出错
        for (String i : color) {
            for (String j : number) {
                list.add(i + j);
            }
        }

        list.add("小王");
        list.add("大王");

        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("小王", 16);
        map.put("大王", 17);

    }

    public PokerGame1(){
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> lord=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            String s=list.get(i);
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

        order(lord);
        order(p1);
        order(p2);
        order(p3);
        System.out.println(lord);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1=o1.substring(0,1);
                String color2=o2.substring(0,1);
                int v1=getValue(o1);
                int v2=getValue(o2);
                if(v1!=v2){
                    return v1-v2;
                }else{
                    return o1.compareTo(o2);
                }
            }
        });
    }

    public static int getValue(String str){
        String a=str.substring(1);
        if (str.equals("大王")) {
            return 17;
        }else if(str.equals("小王")){
            return 16;
        }else if(map.containsKey(a)){
            return map.get(a);
        }else{
            return Integer.parseInt(str.substring(1));
        }
    }
}
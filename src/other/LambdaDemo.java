package other;

import com.itheima.wst.entity.Swim;
import com.itheima.wst.entity.Swim2;


public class LambdaDemo {
    public static void main(String[] args) {
        /*
        lambda表达式：简化匿名内部类的实现
        lambda只能简化函数式接口的匿名内部类的实现，不能简化其他接口的实现
        原因：lambda表达式写法省略了方法的定义，所以只能写一个方法
         */

        //匿名内部类标准写法
        me(new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });


        //lambda表达式
        me(() -> {
            System.out.println("游泳");
        });

        //进一步省略
        /*
        参数类型可以省略，但是不能省略参数的数量
        如果只有一个参数，可以省略包裹参数的括号，如果有多个参数，不能省略包裹参数的括号
        如果函数体只有一行，那可以省略大括号，分号，return关键字，若省略必须同时省略这三个
         */
        me2("游泳","游泳",(str1, str2) -> System.out.println(str1+str2) );
    }
    public static void me(Swim s){
        s.swim();
    }

    public static void me2(String str1,String str2,Swim2 s){
        s.swim(str1,str2);
    }
}

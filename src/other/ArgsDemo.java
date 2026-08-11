package other;

public class ArgsDemo {
    public static void main(String[] args) {
        //可变参数
        System.out.println(getsum(1,2,3,4,5));
    }
    public static int getsum(int...args){
        int summ=0;
        for(int i=0;i<args.length;i++){
            summ+=args[i];
        }
        return summ;
    }
}

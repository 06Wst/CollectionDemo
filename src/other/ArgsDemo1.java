package other;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //可变参数
        System.out.println(getsum(1,2,3,4,5));           //如果有其他参数，必须在可变参数之前
    }
    //形参中只能有一个可变参数
    /*public static int getsum(int...args,int...args1){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        for(int i=0;i<args1.length;i++){
            sum+=args1[i];
        }
        return sum;
    }*/

    public static int getsum(int a,int b,int...args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        }
        return sum-a-b;
    }
}

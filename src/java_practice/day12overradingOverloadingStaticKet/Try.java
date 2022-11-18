package java_practice.day12overradingOverloadingStaticKet;

public class Try {
    int b=10;
    static  int a=10;
    public static void main(String[] args) {
Try t1=new Try();
Try t2=new Try();
t1.a=a+2;
t2.a=a+3;
        System.out.println(t1.a);
        System.out.println(t2.a);

    }
}

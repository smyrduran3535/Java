package y_calismalarim.Static;

public class C03 {
    public static int x;

    public static void metod(int a){
        x=a;
    }

    public static void main(String[] args) {
        C03 s1=new C03();
        C03 s2=new C03();
        s1.metod(9);
        s2.metod(12);
        System.out.println(s1.x);
        System.out.println(s2.x);
        /*
        static metodlar nesneye/objeye baglı degil class a baglıdır.
         o yuzden en en hangi degeri verdiriyorsak artık degiskenin degeri o olur
         static metodlar override ve overload edilemez
         */
    }
}

package calısmalarım_kitap_youtobe.Overloading;

public class C01 {
    static int metod1(int sayi){
        return sayi;
    }
    static int metod1(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    static int metod(int a,double b){
        return a;
    }
    static int metod(double b,int a){
        return a;
    }

    public static void main(String[] args) {
        System.out.println(metod1(5));
        System.out.println(metod1(3,9));
        System.out.println(metod(5,3.6));
        System.out.println(metod(5.9,3));
    }
}

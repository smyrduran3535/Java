package anaDers.day32Maps;

public class StaticBlocks01 {
    public static double pi;
    static {
        System.out.println("static block 2");//once bu calısır
    }
    //static block'lar ihtiyacımız olan variable'ların class oluşturma safhasında elimizde olmasını sağlar.
//static block'lar Class içindeki her şeyden önce çalıştırılır.main metoddan ve diger tum metodlardan once calıstırılır
    //static blocklar icinde sadece statik variablera deger atanabilir
    //main metod static oldugu icin onun icindeki hersey static olmalı


    public static void main(String[] args) {
        System.out.println("main metod ");
    }
    static{
        pi=3.14;
        System.out.println("satis block 1");
    }
}
//intance block static olmayanları ...
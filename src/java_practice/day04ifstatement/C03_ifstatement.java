package java_practice.day04ifstatement;

import java.util.Scanner;

public class C03_ifstatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin



        //String'lerde == neden kullanilmaz.Onun yerine equals kullaniriz.
        // Cunku Javda 2 tane memory var."Stack" ve "Heap".
        // String 'de referans degerinede bakildigi icin == yerine equals kullanilir.
        /*
         //1.YOL
      /*  String gun=input.next().toLowerCase();//toLowerCase==kucuk harf yapar
        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
       if(gun.equals("cumartesi")){
           System.out.println("Yahudiler icin kutsal gun");
       }
       if (gun.equals("pazar")){
           System.out.println("Hristiyanlar icin kutsal gun");
       }
       if (!gun.equals("cuma") && !gun.equals("cumartesi")&& !gun.equals("pazar")){
           System.out.println("Kutsal gun degil");
       }*/


//2.yol
       /* Scanner input=new Scanner(System.in);
        System.out.println("gün ismini giriniz");
        String gun= input.nextLine();

if(gun.equalsIgnoreCase("Cuma")){
    System.out.println("Muslumanlar icin kutsal  gun");
} else if (gun.equalsIgnoreCase(  "Cumartesi")){
    System.out.println("Yahudiler icin kutsal gun");
} else if (gun.equalsIgnoreCase("Pazar")) {
    System.out.println("Hiristiyanlar icin kutsal gun");

}else System.out.println("doğru gün giriniz");

        */


//3.yoll
        Scanner input=new Scanner(System.in);
        System.out.println("gün ismini giriniz");
        String gün= input.nextLine().toLowerCase();
        if(gün.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal  gun");
        } else if (gün.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gün.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else System.out.println("kutsal gün değil");
    }
}

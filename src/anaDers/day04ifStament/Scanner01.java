package anaDers.day04ifStament;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

         /*
            Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
         */
            Scanner input = new Scanner(System.in);

            //1.Yol:
        /* System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next();// next() methodu kullanicidan String datasi almak icin kullanilir

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);
  */


      /*  //2.Yol:
        System.out.println("ilk, orta,soyisminizi ve kimlik noyu giriniz :");
String ilk= input.next();
String orta= input.next();
String soy= input.next();
String kimlikNo= input.next();
        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlikNo); */


//3.yoll
     /*  System.out.println("ilk,orta ve soyisminizi giriniz");
        String tamIsim= input.nextLine();
        System.out.println(tamIsim);//ali veli deli

        System.out.println("ilk,orta ve soyisminizi giriniz");
        String tamIsim1= input.next();
        System.out.println(tamIsim1);//ali
//next ile nextLine nın farkı nedir? next metodu kullanıcıdan gelen stringin sadece ilk kelimesini alır.
// nextLine metodu kullanıcodan gelen metodun tamamını alır


     */
            System.out.println("kimlik numaranızı giriniz :");
            String kimlikNumarası = input.next();
            System.out.println(kimlikNumarası);//12345678

        }
    }


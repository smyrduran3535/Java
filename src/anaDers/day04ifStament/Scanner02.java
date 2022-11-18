package anaDers.day04ifStament;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //kullanıcıdan ilk ve soyisimini alınız.ilk ve soysiiminin ilk harflerini yaz
        Scanner input=new Scanner(System.in);
      /*  System.out.println("ilk isminizi giriniz :");
        char ilk=input.next().charAt(0);
        System.out.println(ilk);
        System.out.println("soyisminizi giriniz :");
        char soyisim=input.next().charAt(0);
        System.out.println(soyisim);

/*  hoca çözümü//Example 1: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
        //           Ali Can ==> AC

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next().charAt(0);//A

        System.out.println("Soy isminizi giriniz...");
        char son = input.next().charAt(0);//C

        System.out.println("" + ilk + son);

 */
       /* Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
        Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
        Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.


        */
        //2.yoll
        System.out.println("tam isminizi giriniz");
        String tamIsim3=input.nextLine();// Ali Can
        char ilkHarf= tamIsim3.charAt(0);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi =tamIsim3.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
    }


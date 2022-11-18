package java_practice.day07StringManüpulation;

import java.util.Scanner;

public class C06_StringManüpulationLength {
    public static void main(String[] args) {
        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1 = " ";
        System.out.println(str1.length());//0
        String str2 = " ";
        System.out.println(str1.length());//1


        Scanner input = new Scanner(System.in);
        System.out.println("isim soyisim girin" +"\nisim:");
        String isim = input.next();

        String soyIsim = input.next();
        System.out.println("soyismi girin");

        if (isim.length() > soyIsim.length()) {
            System.out.println("isim uzun");
        } else if (isim.length() == soyIsim.length()) {
            System.out.println("esit");
        } else System.out.println("soyisim uzun");

    }
}

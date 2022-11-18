package anaDers.day05IfStatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {


        //example : kullanıcıdan gün isimlerini alınıız o günün haftasonuKullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyini
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = input.next();
        if (gun.equalsIgnoreCase("Pazartesi")) {//equalsIgnoreCase için pazar ile PAZAR aynı şeydir.
            //kullanıcıcn büyük harf ya da küçük harf girdiğini önemsemez
            System.out.println("Hafta ici");
        } else if (gun.equals("Salı")) { //stringlerde eşitlik anlamına gelir "eguals" kullanılır
            System.out.println("Hafta ici");

        } else if (gun.equals("Carsamba")) {
            System.out.println("Hafta ici");

        } else if (gun.equals("Persembe")) {
            System.out.println("Hafta ici");

        } else if (gun.equals("Cuma")) {
            System.out.println("Hafta ici");

        } else if (gun.equals("Cumartesi")) {
            System.out.println("Hafta sonu");

        } else if (gun.equals("Pazar")) {
            System.out.println("Hafta sonu");

        } else {
            System.out.println("lütfen doğru gün ismi giriniz");
        }

//iki tabe string in birbirinre eşit olup olmadığını kontrol etmek için iki tane metod kullanılır.
// bunlardan biri equals metodudur.
       /* Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
        i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
        ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

        */

        //2.YOLLL:
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");
        } else if (gun.equalsIgnoreCase("Pazartesi") || //ıgnor:umursamamak demek
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //3.yoll                       ****doğru olan bu yol; *******
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIcı = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIcı) {

            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

    }
}

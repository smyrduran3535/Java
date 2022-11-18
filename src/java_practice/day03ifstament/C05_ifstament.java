package java_practice.day03ifstament;

import java.util.Scanner;

public class C05_ifstament {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz :");
        double sayi1= scan.nextDouble();

        System.out.println("2.sayıyı giriniz :");
        double sayi2= scan.nextDouble();

        System.out.println("+ için :1 seciniz\n- icin :2 seciniz ?n* için : 3 seciniz \n/ icin : 4 seciniz");

        int secim = scan.nextInt();

       if (secim == 1) {
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("DOĞRU bişey giriniz yapalım");

 */
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucu yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4\n giriniz");
        int islem = input.nextInt();//kullanicini islem tercihi icin bir variable olusturduk
        System.out.println("Lutfen iki tamsayi giriniz : ");//Kullaniciya bildirimde bulundum
        double num1 = input.nextDouble();//1.Sayi assign edildi
        double num2 = input.nextDouble();//2.Sayi assign edildi
        if (islem == 1) {
            System.out.println("Toplama islemini sonucu : " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu : " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Bolme islemini sonucu : " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else if(islem == 4) {
            System.out.println("Carpma islemini sonucu : "+ num1+"*"+num2+"="+(num1*num2));
        }else System.out.println("Hatali giris yaptiniz ");










    }

}

package java_practice.day06nestedif;

import java.util.Scanner;

public class C06_SwicthCase {
    public static void main(String[] args) {
     /*
        ex: Girilen pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız.
        ex:568
        ex:Besyuzaltmissekiz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen pozitif 3 basamaklı bir sayı giriniz");
        int sayi = input.nextInt();
        int birlerBasamagi = (sayi % 10);
        int onlarBasamagı = (sayi / 10) % 10;
        int yuzlerBasamagı = (sayi / 100);

        if (sayi < 1000 && sayi > 99) {

            switch (yuzlerBasamagı) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("besyüz");
                    break;
                case 6:
                    System.out.println("altıyüz");
                    break;
                case 7:
                    System.out.println("yediyüz");
                    break;
                case 8:
                    System.out.println("sekizyüz");
                    break;
                case 9:
                    System.out.println("dokuzyüz");
                    break;
            }
            switch (onlarBasamagı) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }
            switch (birlerBasamagi) {

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }


        } else System.out.println("doğru girin");
    }
}

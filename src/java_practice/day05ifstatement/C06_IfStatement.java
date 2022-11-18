package java_practice.day05ifstatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {
        //  Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz");
        int sayi = input.nextInt();

        if (sayi < 1000 || sayi > 9999) {// istenmeyen durum incelendiSystem.out.println("lütfen 4 basamaklı pozitif bir sayı giriniz");

        } else if (sayi % 5 == 0) {//4 basm. 5 e tam bölünüyor
            if (sayi % 10 == 0) {//4 basamaklı 5 ile bölünebilen cift sayılar
                System.out.println("5 e bölünebilen çift sayı");

            } else System.out.println("5 e bölünebilen tek sayı");

        } else {//4 basamaklı 5 e bölünemiyor
            System.out.println("tekrar deneyiniz");
        }
    }
}

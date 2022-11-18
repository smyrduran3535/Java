package java_questionBank.replit;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        char ch1 = 'a';
        int tane = 0;
        String name = "John came late";
        for (int i = 0; i < name.length(); i++) {
            if (ch1 == name.charAt(i)) {
                ++tane;
            }
        }
        System.out.println(tane);
        int sayi = 6;
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyel = faktoriyel * i;
        }
        System.out.print(faktoriyel);
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
         */
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Konsolda Alfabeyi Yazdıran programi yaziniz.
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
        }
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int number = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = toplam + i;
            }
        }
        if (number == toplam) {
            System.out.println(number + "mukemmel sayidir");
        } else System.out.println(number + "mukemmel sayi degildir");
        /*
'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
         */
        int ascii ='a';
char ch='a';
        for (char i = 'a'; i <= 'z'; i++) {
            ascii++;
            System.out.println("Ascii value of " + i + "=" + ascii);
        }
/*
Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
 */
        int s=1238;

       while (s>0){
           System.out.print(s%10);
           s/=10;
        }
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
         */
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);


    }
    }


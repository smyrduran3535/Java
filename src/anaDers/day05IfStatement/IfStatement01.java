package anaDers.day05IfStatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //kullanıcıdan alınan sayının tek mi çift mi oldugunu yaz
        //1.yoll
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s = scan.nextInt();
        if (s % 2 == 0) {

            System.out.println("cift sayı");
        }
        if (s % 2 != 0) {// "!" eşit değil demek
            System.out.println("tek sayı");
        }

//2.yoll
        if (s % 2 == 0) {
            System.out.println("cift sayı");
        } else System.out.println("tek sayı");

//ex:2: bir
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi gir : ");
        int sayi = sc.nextInt();
        if (sayi > 0) {
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {
            System.out.println("girilen sayi negatif");
        } else {
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

       /* //ex:3 bir sayının negatif pozitif veya nötr oldugu soyleyen codu yaz
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        if (d > 0) {
            System.out.println("pozitif");
        } else if (d == 0) {
            System.out.println("nötr");

        } else {
            System.out.println("negatif");


        }

        */

    }
}



package java_practice.day06nestedif;

import java.util.Scanner;

public class C03_SwicthCase {
    public static void main(String[] args) {

        /*
        DERS PROGRAMI

Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

 Pazartesi ve Sali ise: Java

Persembe ve Cuma ise: Selenyum

Carsamba ve Cumartesi ise: SQL

aksi halde: izin gunu=Day Off
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String gun=input.next().toUpperCase();
        switch (gun){

            case "PAZARTESİ":
            case "SALI":
                System.out.println("JAVA");
                break;
            case "PERSEMBE":
            case "CUMA":
                System.out.println("SELENYUM");
            case "CARSAMBA":
            case "CUMARTESİ":
                System.out.println("SQL");
            default:
                System.out.println("DAY OFF");
        }
    }
}

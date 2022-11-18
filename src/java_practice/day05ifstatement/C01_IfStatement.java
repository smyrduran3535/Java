package java_practice.day05ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {



    /*Soru 6) Kullanicidan iki sayi isteyin,
sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

        Scanner input = new Scanner(System.in);

        System.out.println("iki sayıyı giriniz ");
        double sayı1 = input.nextDouble();
        double sayı2 = input.nextDouble();

        if (sayı1 < 0 && sayı2 < 0) {
            System.out.println(sayı1 * sayı2);
        } else if (sayı1 > 0 && sayı2 > 0) {
            System.out.println(sayı1 + sayı2);

        } else if ((sayı1 > 0 && sayı2 < 0) || (sayı1 < 0 && sayı2 > 0)) {// a*b<0 dersek daha kestirme else>>>>> if(sayı1*sayı<0)<<<<<<HOCA
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if ((sayı1 == 0 && sayı2 > 0) || (sayı2 == 0 && sayı1 < 0)) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        } else System.out.println("doğru değerler giriniz");
    }
}

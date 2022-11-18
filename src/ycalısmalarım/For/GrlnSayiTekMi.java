package ycalısmalarım.For;

import java.util.Scanner;

public class GrlnSayiTekMi {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gırınız");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 1) {

                System.out.print(i + " ");

            }
            toplam += i;
        }
        System.out.println("toplam " + toplam);

        //while ile
        int sayac = 0;
        while (sayi > 0) {
            if (sayi % 2 == 1) {
                System.out.println(sayi);
                sayac++;
            }
            sayi--;//bunu yapmazsak sonsuz donguye gırer sayıyı degistirmesi lazım
        }
        System.out.println("sayac" + sayac);
    }

}


































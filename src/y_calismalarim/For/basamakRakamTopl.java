package y_calismalarim.For;

import java.util.Scanner;

public class basamakRakamTopl {
    //INTERVİEW SORUSU

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi = scan.nextInt();
        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));
    }

    private static int basamakToplama(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }
}
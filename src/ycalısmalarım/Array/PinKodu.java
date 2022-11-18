package ycalısmalarım.Array;

import java.util.Scanner;

public class PinKodu {
    //String olan PIN kodunuzu kontrol edn bir kod yaziniz
    public static void main(String[] args) {
        String pin = "mehmet.1234";
        int girisHakki = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********HOSGELDİNİZ**************");

        while (true) {//her turlu dogru oldugunda calıssın

            System.out.println("pin kodunuzu giriniz");
            String girilenPin = scanner.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptınız");
                girisHakki--;
                System.out.println("kalan giris hakkiniz " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkınız kalmadi..bloklandınız");
                break;
            }
        }
    }
}

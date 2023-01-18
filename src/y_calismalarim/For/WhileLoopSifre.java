package calısmalarım_kitap_youtobe.For;

import java.util.Scanner;

public class WhileLoopSifre {
    public static void main(String[] args) {

/*
kullacıdan sifre isteyin asagıdakı sartları saglamayan sifrelerde hataları yazdırıp,
kullanıcının yeni bir sifre girmesini isteyin.
gecerli bir sifre yazıllıncaya kadar bu islemi tekrar edin
gecerli sifre yazılınca "sifreniz basarı ile kaydedildi" yazdırın
şartlar:
sifrenin ilk karakteri kucuk harf olmalı
sifrenin son karakteri bir sayı olmalı
 */

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerMi = false;
        String sifre = "";
        int bayrak = 0;

        while (sifreGecerMi != true) {
            System.out.println("lütfen sifrenizi girin");
            sifre = scan.nextLine();
            bayrak++;


            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("sifrenin ilk karakteri kücük karakter olmalı");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= 9)) {
                System.out.println("sifrenin son karakteri sayı olmalı");
                bayrak++;

                if (bayrak == 0) {
                    sifreGecerMi = true;
                    System.out.println("sifreniz basarıyla kaydedildi");
                }
            }
        }
//kullanıcıdan bir sayi ve hesaplamak istediği ussunu isteyin
        //whileloop kullanarak verilen sayının istenen ussunu hesaplayıp bir method olust
        int sayi1=5;
        int us=3;
        //  public static void ushesapla(int sayi,int us )

//while loop kullanarak alına sayının rakamlar topşlamını bulun
        int sayi=124568756;
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        while(sayi!=0){
            birlerBasamagı=sayi%10;
            rakamlarToplamı+=birlerBasamagı;
            sayi/=10;
        }
        System.out.println(rakamlarToplamı);



    }
}

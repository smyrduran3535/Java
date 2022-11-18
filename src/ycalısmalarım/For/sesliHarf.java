package ycalısmalarım.For;

import java.util.Scanner;

public class sesliHarf {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir harf girmesini isteyin.Girilen harf sesli ise sesli harf oldugunu,
        degilse sessiz harf oldugunu ekrana yazdırsın.Girdigi deger harf degilse yada
        1 karakterden fazla ise hata mesajı gostersin.
        sesli harfler:a,,e,ı,o,u,
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf = input.next().toLowerCase();

        String sesliHarler = "aeıou";
        String sessizHarfler = "bcdfghjklmnprstvwyzx";
        if (harf.length() == 1) {//en basta bu kontrolu saglıyoruz,
            for (int i = 0; i < sesliHarler.length(); i++) {
                if (sesliHarler.contains(harf)) {
                    System.out.println(harf + " sesli harftir");
                    break;
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println(harf + " sessiz harftir");
                    break;
                } else {
                    System.out.println("yanlis karakter girdiniz ");
                    break;

                }

                }
            }else System.out.println("tek karakter giriniz");
        //2.yol
        sesliHarler.contains(harf);
        System.out.println("sesli harf");
        }


    }

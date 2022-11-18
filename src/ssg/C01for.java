package ssg;

import java.util.Scanner;

public class C01for {
    public static void main(String[] args) {


        //Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın.
        // Daha sonra bu sayının çarpım tablosunu yazdırmasını isteyin.

        Scanner sayı = new Scanner(System.in);
        System.out.println("Bir tamsayı girin:");
        int sayı1 = sayı.nextInt();
        System.out.println("Girdiğiniz sayı:" + sayı1);
        for (int i = 1; i <= sayı1; i++) {
            // System.out.println(sayı1+"x"+i+"="+sayı1*i);
            for (int j = 1; j <= sayı1; j++) {
                System.out.print(" " + i * j);


        /*
        kullanıcıdan bir tam sayı gırmesini isteyin ve ardından sayıları
        ters cevrilmis sayıyı veren bir program yaz
         */
                Scanner scan = new Scanner(System.in);
                int sayi;
                int ters = 0;
                System.out.println("bir sayı giriniz");
                sayi = scan.nextInt();
                int kasa = sayi;
                int kalan = 0;//say,y, degistirmmek icin kasayı kullancaz

                while (kasa > 0) {
                    kalan = kasa % 10;
                    ters = ters * 10 + kalan;
                    kasa /= 10;
                }
                System.out.println("girdiginiz sayının tersi" + ters);
            }
        }


    }

    }
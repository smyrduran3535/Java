package calısmalarım_kitap_youtobe.For;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
//  10,11,12 sayılarını toplayan bir while loop olust.
        int sayi = 10;
        int toplam = 0;
        while (sayi <= 12) {
            toplam += sayi;
            sayi++;
        }
        System.out.println(toplam);
//while loopta önce kontrol işlemi yapılır
/*
while loopta 2 problem olusabilir.
1-önce degeri kontrol edip, sonra işlem yaptıgımızdan body de bir kere daha kontrol etmemiz gerekir
2-yapılan işlem sayısından 1 fazla while bitis sartı kontrol edilir
3-while loop öncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak
ona yapacagımız atamayı cok dikkatli yapmamız gerekir.
yanlış deger ataması yapmak, while loop un calışmasına neden olabilir
 */
//tekrar sayııs belli degilse while loop kullan
        //do while loop ile: mutlaka en az kere calışır ve while bitiş konrolu loop kadar calışır(while loopta 1 kere fazla calşr)

        do {
            toplam = toplam + sayi;
            sayi++;
        } while (sayi <= 12);

        System.out.println(toplam);

/*
Example: sifre kontrolu
kull.dan bir sifre girmesini isteyin
girilen sifreyi asagıdaki sartlara gore kontrol edin ve sifredeki hataları yaz
kullanıcı gecerli bir sifre girinceye kadar bu işlemi devam edin
gecerli sifre girdiginde sifreniz kabul edilmiştir"
-sifre kücük harf içermelidir
-sifre büyük harf içermelidir
-sifre ozel karakter icermelidir
-sifre en az 8 karakter içermelir
 */
        Scanner input = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;
        //int sonuc=kucukHarfKontroluYap(sifre);
        do {
            System.out.println("sifre giriniz");
            sifre = input.nextLine();

            //tum hataları soylemesını ıstıyorsak
            //bagımsız if cümleleri ve bayrak kullanmak zorundayız
            bayrak = 0;
            //-sifre kücük harf içermelidir
            //bunun için tüm harfleri kontrol edecek bir for loop olusturmalıyım

            for (int i = 0; i < sifre.length(); i++) {

                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {

                    bayrak++;//sart saglanıyorsa bayragı bir arttır.hata yazdırmıyoruz bayrak arttırıyoruz
                    break;
                }
            }//bayrak==0 ise hata vardır; küçük harf yoktur yani bir hata vardır
            if (bayrak == 0) {
                System.out.println("sifre küçük harf içerir");
                return;

            } else return;
        }while(bayrak!=0);

        //küçük harf kontrolü yapan bir method olusturalım
        //kucuk harf varsa bir yoksa 0 dönsün













    }
}


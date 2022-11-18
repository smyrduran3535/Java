package nihanHocadanGelenler.sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array {



        /* TASK :

         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         */
        static List<String> urunListesi = new ArrayList<>(Arrays.asList("patates - urun kodu : 1","limon - urun kodu : 2","kivi - urun kodu : 3",
                "biber - urun kodu : 4", "patlican - urun kodu : 5" ));//urunlerin atanacagi bos list ve diger methodlarda da kullanabilmek icin instance yaptik.
        static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0,7.5,1.3,8.7,9.2));//urun fiyatlarinin atanacagi bos list ve instance variable.
        static double toplamOdenecekTutar;//instance variable
        static Scanner scan = new Scanner(System.in);//instance variable

        public static void main(String[] args) {

            System.out.println(urunListesi);
            musteriSecim();
        }

        private static void musteriSecim() {

            System.out.println("hangi urunu secmek istersiniz :");
            int secim = scan.nextInt();

            System.out.println("sectiginiz urunden kac kilo alacaksiniz : ");
            double kilo = scan.nextDouble();
            double urunTutari = urunFiyatlari.get(secim - 1);//urun listesi 1'den 5'e kadar. Or. musteri 5. urunu secti, fiyatina ulasmak icin 4. index'e gitmek lazim.
            //bu nedenle -1 yapiyoruz.
            double urunToplamTutar = kilo * urunTutari;
            toplamOdenecekTutar += urunToplamTutar;//alınan her urun odemesi ana odemeye eklendi
            System.out.println("devam edecekseniz 1, kasa için 2 seciniz...");

            int karar = scan.nextInt();
            if (karar == 1) {
                musteriSecim();
            } else {
                kasa();
            }
        }

        private static void kasa() {

            System.out.println("alisverisinizin toplam tutari : " + toplamOdenecekTutar);
        }
            }










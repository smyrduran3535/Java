package ssg;

     import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Arrays {
    // 1 - Verilen Sayinin Faktoryel Degerini Bulma (5! = 1*2*3*4*5;)
// 2 - Verilen Sayi Kadar Fibonacci Yazdirma (1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
// 3 - Mukemmel Sayi mi (Bir Sayinin bolenlerinin toplami kendine esitese mukemmel sayidir (1+2+3 = 6)(28, 496 vs)
// 4 - Verilen Sayi Asal Sayi mi ? (1 ve kendisinden baska sayiya bolunemeyen sayilar)
// 5 - Verilen Sayinin KareKokunu Bulma
// 6 - Verilen Iki Sayinin Ortak Bolenlerini Listeleme
// 0  - Cikis icin 0'i secin




        public static void main(String[] args) {
            System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz \n" +
                    "*".repeat(30)+"\n1\t Fonksiyon Bulma\n2\t Fibonacci Yazdirma\n3\t Mukemmel Sayi Bulma\n4\t Asal Sayi Bulma\n5\t KareKoku Bulma\n6\t OrtakBolenleri Listeleme\n0\t Cikis Yap");

            Scanner input = new Scanner(System.in);

            do {

                System.out.println("Yapmak Istediginiz Islemi Girin");
                int islem = input.nextInt();
                if (islem == 0){
                    System.out.println("Programdan Cikiliyor");
                    break;
                }

                switch (islem){
                    case 1:
                        System.out.println("Lutfen 20den Kucuk Bir Sayi Giriniz");
                        int s = input.nextInt();
                        faktoryelBul(s);
                        break;
                    case 2:
                        System.out.println("Kac Adet Fibonacci Sayisi Yazdirilsin");
                        int a = input.nextInt();
                        fibonacciBul(a);
                        break;
                    case 3:
                        System.out.println("Lutfen Mukemmel mi Ogrenmek istediginiz Sayiyi Giriniz");
                        int b = input.nextInt();
                        mukemmelSayi(b);
                        break;
                    case 4:
                        System.out.println("Asal olup olmadigini ogrenmek istediginiz Sayiyi Giriniz ");
                        int c = input.nextInt();
                        asalSayiMi(c);
                        break;
                    case 5:
                        System.out.println("Karekokunu Bulmak Istediginiz Sayiyi Giriniz");
                        int k = input.nextInt();
                        karekokBulma(k);
                        break;
                    case 6:
                        System.out.println("Lutfen Ortak bolenlerini bulmak istediginiz iki sayi giriniz");
                        int s1 = input.nextInt();
                        int s2 = input.nextInt();
                        oBolenleriBulma(s1, s2);
                        break;
                    default:
                        System.out.println("Gecersiz Islem");
                }
            }while (true);













        }

        public static void faktoryelBul(int a){
            int f = 1;
            for (int i = 1; i <= a; i++) {
                f *= i;
            }
            System.out.println(f);
        }
        public static void fibonacciBul (int a){
            int x = 1;
            int y = 1;
            int f = 0;
            System.out.println(x + " " + y + " ");
            for (int i = 0; i < a-1; i++) {
                f = x + y;
                System.out.println(f);
                x = y;
                y = f;
            }
        }

        public static void mukemmelSayi (int a){
            int toplam = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0){
                    toplam += i;
                }
            }
            if (a == toplam){
                System.out.println("Bu Mukemmel Bir Sayi");
            }else System.out.println("Bu Kusurlu Bir Sayi");
        }
        public static void asalSayiMi (int a){
            boolean asal = false;
            for (int i = 2; i < a; i++){
                if (a % i == 0){
                    asal = true;
                }
            }
            if (asal){
                System.out.println("Bu Sayi Bir Asal Sayi Degil");
            }else System.out.println("Bu Bir Asal Sayidir");
        }
        public static void karekokBulma (int a){
            double karaekok = Math.sqrt(a);
            System.out.println(karaekok);
        }
        public static void oBolenleriBulma (int a, int b){
            List<Integer> bolenler = new ArrayList<>();
            int k = Math.min(a, b);
            for (int i = 1; i < k; i++) {
                if (a % i == 0){
                    if (b % i == 0){
                        bolenler.add(i);
                    }
                }
            }
            System.out.println(bolenler);
        }

    }


package calısmalarım_kitap_youtobe.MethodOlusturma;

import java.util.Scanner;

public class ScannerIleMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lufen bir sayı giriniz");
        int deger=scan.nextInt();
        long sonuc=hesapla(deger);
        System.out.println(sonuc);


    }
    static long hesapla(int sayi){
        int carpim=1;
        for (int i = 1; i <=sayi ; i++) {
             carpim*=i;
        }
        return carpim;
    }
}

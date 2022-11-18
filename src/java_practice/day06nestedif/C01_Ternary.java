package java_practice.day06nestedif;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
            /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner input=new Scanner(System.in);
        System.out.println("sıfırdana büyük tamsayı giiriniz");
        int sayi=input.nextInt();

        String sonuc=(sayi>0)  ?(sayi>99&&sayi<1000)  ? ("sayı 3 basamaklı o dan büyük sayı")://0 dan büyük sayılar incelendi..sart doğru değilse; sayı%2==0ye gecer
                (sayi%2==0)  ? ("3 basamaklı olmayan çift sayı") :("3 basamaklı olmayan tek sayı") ://tek mi çift mi bakıldı//buraya kadar 0dan büyük mü kısmı
                // calışıyor
                "lütfen 0 dan büyük bir sayı giriniz";//sıfırdan küçükse burası
        System.out.println(sonuc);

        if(sayi>0) {
            if (sayi < 1000 && sayi > 99) {
                System.out.println("3 basamaklı pozitif sayı");
            } else if (sayi % 2 == 0) {
                System.out.println("3 basamaklı olmayan çift sayı");
            } else System.out.println("3 basamaklı olmayan tek sayı");
        }else System.out.println("lütfen sifirdan büyük pozitif bir tam sayı giriniz");
    }
}

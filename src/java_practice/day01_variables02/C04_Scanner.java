package java_practice.day01_variables02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz
/*
Scanner scan =new Scanner(System.in);
        System.out.println(" 4 basamaklı sayı girin");
int sayi=scan.nextInt();
int sonRakam=sayi%10;
int ilkRakam=sayi/1000;
        System.out.println("ilkRakam + sonRakam= " + (ilkRakam + sonRakam));


//  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
//
//    Ornek : Inputs : 853
//    Output : Girdiginiz sayinin birler basamagi : 3
//             Girdiginiz sayinin onlar basamagi : 5
//             Girdiginiz sayinin yuzler basamagi : 8

 */

/*
        Scanner scan1 =new Scanner(System.in);
        System.out.println(" 3 basamaklı sayı girin");
        int sayı= scan1.nextInt();
        // 1ler basamagındaki sayıyı bulmak için 10 böl
        int birler=sayı%10;
        System.out.println("sayının birler basamagı: "+birler);

        int yenisayı=sayı/=10;    //sayi=sayi/10;
        System.out.println("yenisayı :"+ yenisayı);
        //10 lar basamagı
        int onlar=sayı%10;
        System.out.println("sayının onlar basamagı:"+onlar);
        //100 ler bas
        int yuzler=sayı/=10;
        System.out.println("yüzler basamagı:"+yuzler);

//  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

 */

        Scanner scan =new Scanner(System.in);
        System.out.println("5 basamaklı sayıyı giriniz:");//12345
        int sayi1= scan.nextInt();
        int birlerBsmg=sayi1%10;
        int onlarBsmg=(sayi1/10)%10;
        int yuzlerBsmg=(sayi1/100)%10;
        int binlerBsmg=(sayi1/1000)%10;
        int onbinlerBsmg=(sayi1/10000)%10;
        int ilkbsmk= onbinlerBsmg + binlerBsmg;
        int sonbsmk= onlarBsmg + birlerBsmg;
        System.out.println("toplam(ilk ve son 2 basamak) ="+(ilkbsmk+sonbsmk));//12
/*
Scanner input = new Scanner(System.in);

System.out.println(" Lutfen 5 basamakli bir sayi giriniz ");

int num=input.nextInt();
int ilkIkirkm=num/1000;
System.out.println("ilkIkirkm = " + ilkIkirkm);//12

int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);//2+1
System.out.println("ilkIkiTop = " + ilkIkiTop);//3

int sonIkiRkm=num%100;
System.out.println("sonIkiRkm = " + sonIkiRkm);//45
int sonIkıTop=(sonIkiRkm%10)+(sonIkiRkm/10);
System.out.println("son iki toplam:" +sonIkıTop);
int toplam=ilkIkiTop+sonIkıTop;
System.out.println("toplam :"+toplam)
 */

























































    }
}

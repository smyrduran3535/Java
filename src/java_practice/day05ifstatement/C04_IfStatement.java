package java_practice.day05ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen cinsiyenizi yazınız..." + "\nKadın için K\nErkek için E harfini giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasınızı giriniz");
        double yas = input.nextDouble();

        if(cinsiyet=='K'){
            System.out.println("kadın");
            if (yas<0||yas>120){
                System.out.println("lütfen doğru yas değerini giriniz");
            }else if (yas>60){
                System.out.println("emekli olabiklirsin");
            }else {
                System.out.println("emekli olamazsın " + (60-yas)  + " yas daha calışmalısın");
            }


        }else if(cinsiyet=='E'){
            if(yas<0||yas>120){
                System.out.println("lütfen doğru yas değerini giriniz");
            }else if(yas>65){
                System.out.println("emekli olabilirsin");
            }else System.out.println("emekli olamazsın "+(65-yas)+" yas daha calısmalısın");

        }else
            System.out.println("lütfen gecerli harf giriniz");





    }
}

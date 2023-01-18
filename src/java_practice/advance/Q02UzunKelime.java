package java_practice.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02UzunKelime {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

enUzunKelime();
        System.out.println(enUzunKelime());
    }

    public static List<String> enUzunKelime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = input.nextLine();
        String[] arr = cumle.split(" ");//once bos bir string alıp cumleti arraye cev. =kelimeden bolecek;
        int max = 0;
        for (String w : arr) {
            if (w.length() > max) {
                max = w.length();
            }
        }
                       //for loop ile;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle1 = input.nextLine();
        String[] arr1 = cumle.split(" ");//once bos bir string alıp cumleti arraye cev. =kelimeden bolecek;
        int max1 = 0;
        String uzunkelime="";
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>max){
                max=arr[i].length();
                uzunkelime=arr[i];//o bulunan kelimenin indexini atadik
            }
        }
        System.out.println(uzunkelime);

                      ////*****////



        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w : arr) {
            if (w.length() == max) {
                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;
    }
}

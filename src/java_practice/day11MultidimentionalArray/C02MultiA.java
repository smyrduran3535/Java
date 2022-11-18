package java_practice.day11MultidimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class C02MultiA {
    public static void main(String[] args) {
       /* Kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan kodu yaziniz
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("Arrayin uzunlugunuı giriniz");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Arrayin " +(i+1)+" .elemanını giriniz");
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Arrayin en buyuk elemanı:"+arr[uzunluk-1]);
        System.out.println("Arrayin en kucuk elemanı:"+arr[0]);
        System.out.println("fark:"+(arr[uzunluk-1]-arr[0]));
    }
}

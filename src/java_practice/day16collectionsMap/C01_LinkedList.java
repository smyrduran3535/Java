package java_practice.day16collectionsMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class C01_LinkedList {
    public static void main(String[] args) {
          /*  TASK:
               Node'larin değereleri; "AYSE" "EMEL" "HARUN" "IREM" olan bir LinkedList olusturun
               Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
                "Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
               Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

          */
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("AYSE","EMEL","HARUN","IREM"));

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim= input.nextLine().toUpperCase();

        if (ll1.remove(isim)){
            System.out.println("Bu isim LinkedList de vardı silindi");
            System.out.println("sislinmis hali ile "+ll1);
        }else System.out.println("bu isim LinkedList de yok bu yuzden silinemedi");
    }

}

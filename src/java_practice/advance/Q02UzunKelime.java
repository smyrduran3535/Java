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
        String[] arr = cumle.split(" ");
        int max = 0;
        for (String w : arr) {
            if (w.length() > max) {
                max = w.length();
            }

        }

        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w : arr) {
            if (w.length() == max) {
                enUzunKelimeler.add(w);
            }
        }


        return enUzunKelimeler;
    }
}

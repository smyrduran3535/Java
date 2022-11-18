package ssg.Mr.CihanArrays;

import java.util.Arrays;

public class Arrays08sayacMethod {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun

        String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";
        char harf='e';

        harfKacKereKullanilmis(cumle, harf);
    }



    private static void harfKacKereKullanilmis(String cumle, char harf) {

        int sayac=0;
        String harfStr=""+harf;

        String karakterler[]=cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harfStr)){
                sayac++;
            }
        }

        System.out.println("Aradiginiz " + harf + " verilen cumlede " + sayac + " adet kullanilmis");
    }
}


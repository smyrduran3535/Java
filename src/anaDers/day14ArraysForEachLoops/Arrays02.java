package anaDers.day14ArraysForEachLoops;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

// Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end: sıfırları sona koy
        //    [2, 3, 12, 0,  0,  0]

        int orijinal[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[orijinal.length];
        int idx = 0;
        for (int i = 0; i < orijinal.length; i++) {
            if (orijinal[0] != 0) {
                yeni[idx] = orijinal[i];
                idx++;
            }
        }
        System.out.println(java.util.Arrays.toString(yeni));//[0, 0, 0, 0, 0, 0]


       /* // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        int original[] = { 0, 12, -3, 0 };
        int yeni[] = new int[original.length];

        int idx = 0;
        for(int i=0; i<original.length; i++){
            if(original[i] != 0){
                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni))

       */
        /*
        EXAMPLE
        bir Array ın içinde herhanhi bir elemanın olup olmadıgını ve kac kere tekrarlandıgını gösteren eden kodu yazınız
        [2,1,2,-3,2]==>> kullanıcı 2 yi sorarsa===>>2 elemanı var ve 3 kere tekrarlandı diycez
        [2,1,2,-3,2]==>> kullanıcı 6 yı sordu===>>>6 elemanı yok ve 0 kere tekrarlandı diycez
         */

        int arr[] = {2, 1, 2, -3, 2};
        int eleman = 5;
        int counter = 0;//flag: bazı durumların olup olm. kont. etmek için kull.
        for (int w : arr) {//array verildiği için for each kullandık
            if (w == eleman) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(eleman + "array da  " + counter + " defa var");
        } else System.out.println("eleman array de yok");


        /*
         EXAMPLE:
                     size verilen bir cümledeki en uzun kelimeyi bulan kodu yaz
                    "Java kolaydır calısana, ne kolay ki calışmayana"
                        */

        String sentence = "Java kolaydır calısana, ne kolay ki calışmayana";
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);
        // sentence.split(" ");//bu metod array verir.coklu datayı yapmak için array kullanır
        String word[] = sentence.split(" ");//array haline getirdi
//sort edince en küçügünü basa en büğüğünü sona koyar.alfabetik sıralama yapar.
        java.util.Arrays.sort(word);
        System.out.println(word);//[Ljava.lang.String;@60f82f98
        System.out.println(java.util.Arrays.toString(word));//[Java, calısana, calışmayana, ki, kolay, kolaydır, ne] alfabetik yaptı bize uzunluk lazım
        java.util.Arrays.sort(word, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(word));//[ki, ne, Java, kolay, calısana, kolaydır, calışmayana]
        System.out.println(word[word.length - 1]);//calısmayanau-

    }
}

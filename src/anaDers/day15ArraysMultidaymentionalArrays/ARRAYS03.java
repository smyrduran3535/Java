package anaDers.day15ArraysMultidaymentionalArrays;

import java.util.Arrays;

public class ARRAYS03 {
    public static void main(String[] args) {

        /*
        bir Stringteki sesli harflerin sayısını bulan kodu yazınız
       "a,e,i,o,u,A,E,I,O,U"
         */

        String str = "Java ogrenince para kaznamak kolay, ogrenmeyince ne kolay ki";

        str = str.toLowerCase();//yaparsak butun harker kucuk olur buyuk kucuk diye ayrıstırmaya gerek kalamz
        //harflerle calışcaz stringi parcalamalıyız;boşluklardan....

        String harfler[] = str.split("");//arrayin içine koymalıyız. String metodu her zaman Array verir
        System.out.println(harfler);//[Ljava.lang.String;@2d6e8792 referans yazdırır

        int counter = 0;//önce var edip sonra arttırcaz.
        System.out.println(Arrays.toString(harfler));
        //[J, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, n, a, m, a, k,
        // , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i]

        for (String w : harfler) {
            //3 ten fazla ihtimal old için case kullanmalıyız
            switch (w) {
                case "a":                               // birden fazla durum için bunu kullan
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);// 22


    }
}

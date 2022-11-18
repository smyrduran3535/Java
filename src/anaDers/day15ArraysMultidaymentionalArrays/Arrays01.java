package anaDers.day15ArraysMultidaymentionalArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
          /*
         -binarySearch() Method: bu methodu kullanarak bir elmanın array de olup olmadığı anlarızz.
         -Stribglerde contais metodu kullanırdık. true false retuurn ederdi. bu metod da öyle fakat true false return etmez
         -binarySearch methodunu kullanmadan ****önce mutlaka****** """""""Arrays.sort()""""""" kullanılmalıdr
         -binarySearch methodu aradıgımız eleman array de varsa ***o elemanın indexsini**** return eder
          -binarySearch methodu aradıgımız eleman array de yoksa napar:"-a" seklinde bir negatif sayı alırız. bu sayıdaki
          "-" işaretinin anlamı ;bu eleman arrayde yok demektir.
          "a" nın anlmaı olsaydı kacıncı sırada olurdu demektir
          binarySearch methodu "tekrarlayan elemanlar için" kullanılmaz.  int arr[] = {12, 31, 43, 43};kullanılmaz iki tane var 43. 43 için kullanılmaz
         */
        int arr[] = {12, 31, 43, 14};
        int sayi = 43;
        Arrays.sort(arr);//küçükten büyüge sıralar[12,14,31,43]
        int indx1 = Arrays.binarySearch(arr, sayi);
        System.out.println(indx1);//3.index

        int sayi1 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi1);
        System.out.println(sonuc);//-5: "-" yok demek. 5: olsaydı sort yaptıktan sonra hangi sırda olurdu demek.a: sıra numarasıdır index degil

    }
}

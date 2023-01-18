package java_questionBank.array;

import ssg.Mr.CihanArrays.Arrays05MethodIle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array01 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       /* 1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        */
        int a[] = new int[]{12, 5, 8, 4};

        Arrays.sort(a);
        if (a.length % 2 != 0) {
            int arr1 = a.length / 2;
            System.out.println(a[arr1]);
        } else {
            int arr1 = a.length / 2;
            int ortaEleman = (a[arr1] + a[arr1 - 1]) / 2;
            System.out.println(ortaEleman);
        }
        /*
        2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
           Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */
        String str[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minlhtg = str[0].length();
        for (String w : str) {
            minlhtg = Math.min(minlhtg, w.length());
            if (minlhtg == w.length()) {
                System.out.println(w);
            }
        }
     /*
     3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
      */
        int array[] = {-12, 18, -5, 23, -2};
        Arrays.sort(array);
        int bykNeagif = array[0];
        int kckPozitif = array[array.length - 1];
        for (int w : array) {
            if (w > 0) {
                bykNeagif = Math.max(bykNeagif, w);
            }
            if (w < 0) {
                kckPozitif = Math.min(kckPozitif, w);
            }
        }
        System.out.println("kckPozitif = " + kckPozitif);
        System.out.println("bykNeagif = " + bykNeagif);
/*
4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
   alınız.
   Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
 */
        String[] str1 = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String s = "";
        for (String w : str1) {
            if (w.endsWith("n") || (w.endsWith("k"))) {
                s += w.charAt(0);

            }
        }
        System.out.println(s);

   /*
   5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
   Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
   */
        String[] str2 = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum = 0;
        for (String w : str2) {
            sum += w.length();
        }
        System.out.println("sum = " + sum);


        //6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        String t = "Apex is an object oriented programming language";
        t = t.replaceAll(" ", "");
        String[] tArr = t.split("");
        int count = 0;
        for (String w : tArr) {
            if (w.endsWith("a") || w.endsWith("A")) {
                count++;
            }
        }
        System.out.println(count);


   /*
   7) Verilen bir String'deki sesli harf sayısını bulunuz
    */
        String str3 = "Apex is an object oriented programming language";
        String sesliHarf = "a,e,u,o,i";
        int cnt = 0;
        String c[] = str3.toLowerCase().split("");

        for (String w : c) {
            switch (w) {
                case "a":
                case "e":
                case "u":
                case "i":
                case "o":
                    cnt++;
            }
        }
        System.out.println(cnt);

        //8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (int i = 0; i < arr.length; i++) {
            String ilk = arr[i].substring(0, 1);
            String son = arr[i].substring(arr[i].length() - 1);
            if (ilk.equals(son)) {
                System.out.println(arr[i]);
            }
        }
        //9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
        String[] arrr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String e = "object";

        for (String w : arrr) {
            if (w.contains(e)) {
                System.out.println(w);
            }
        }
/*
    10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız
 */
        String[] ass = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int top = 0;
        for (String w : ass) {
            top += w.length();
        }
        System.out.println(top);

    /*
    11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
    Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
    */
        //bu yol olmaz cunku ; 2 tane aynı sayı var...
        int arrays[] = {5, 0, 2, 0, 3};
        String ters = "";
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        int yeni = arrays.length - 1;
        for (int i = arrays.length - 1; i > 0; i--) {
            ters += arrays[i];
        }
        System.out.println(ters);

        //2.yol:
        int arrys[] = new int[]{5, 0, 2, 0, 3};
        int teniArrays[] = new int[arrys.length];
        int firstIndex = 0;
        int lastIndex = arrys.length - 1;
        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i] != 0) {
                teniArrays[firstIndex] = arrys[i];
                firstIndex++;
            } else {
                teniArrays[lastIndex] = 0;
                lastIndex--;

            }
        }
        System.out.println(Arrays.toString(teniArrays));

/*
    12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        büyük öğeler arasındaki farkı konsolda yazdırınız
 */

        System.out.println("array uzunlugunu giriniz");
        int sayi = scan.nextInt();
        int num[] = new int[sayi];
        int fark = 0;

        for (int i = 0; i < sayi; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        fark = num[num.length - 1] - num[0];
        System.out.println(fark);

 /*
  13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır
  */

       /*System.out.println("string1 ve string2 giriniz");
        String s1 = scan.nextLine();
        scan.nextLine();
        String s2 = scan.nextLine();
        String as1[]  = s1.toLowerCase().split("");
        Arrays.sort(as1);
        String as2[]  = s2.toLowerCase().split("");
        Arrays.sort(as2);

        if (s1.length()!=s2.length()){
            System.out.println("anagram degildir");
        }else if(s1.isEmpty()||s2.isEmpty()){
            System.out.println("anagram degildir");
        } else if (Arrays.equals(as1,as2)) {
            System.out.println("anagramdir");
        }else{
            System.out.println("anagram degildir");
        }

        */
        /* kitap: cevap  calismiyor

          System.out.println("iki String giriniz :");
        String s1 = scan.nextLine();
        scan.nextLine();
        String s2 = scan.nextLine();
        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);
        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);
        if (s1.length() != s2.length()) {
            System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram Degil");
        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }
         */
Scanner scan=new Scanner(System.in);
        System.out.println("2 kelime giriniz");
        String kelime1 = scan.nextLine();
       // scan.nextLine();
        String kelime2 = scan.nextLine();
        ArrayList<Character> l1 = new ArrayList<>(kelime1.length());
        ArrayList<Character> l2 = new ArrayList<>(kelime2.length());
        for (int i = 0; i < kelime1.length(); i++) {
            l1.add(kelime1.toLowerCase().charAt(i));
        }
        for (int i = 0; i < kelime2.length(); i++) {
            l2.add(kelime2.toLowerCase().charAt(i));
        }
        System.out.println(l1);
        System.out.println(l2);
        if (kelime1.length() != kelime2.length()) {
            System.out.println("anagram degildir");
        } else {
            for (char i : l1) {
                 l2.contains(i);



            }System.out.println("anagramdir");
        }

    }
}



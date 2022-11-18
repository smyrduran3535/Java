package anaDers.day09StringManupulation;

import java.util.Scanner;

public class SitringManupulation {
    public static void main(String[] args) {
        String str = "Java is easy";
        int indxA = str.indexOf("a");//ilk görünüşün index ini alır diğeerlerinin indexisini almaz
        //indexOf() metodu verilen karakter veya karakterlerin ilk görünümünün index ini verir.ilk görünüm :indexOf()
        System.out.println(indxA);//1
        //LastIndexOf() metodu:en son nerede görüldüğünü görmek istiyorsak bunu kullanırız: son görünüm:LastIndexOf()
        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);//9
        String str1 = "Kara kara düsünme Ankara";
        int strg1 = str1.indexOf("kara");
        System.out.println(strg1);//5 ilk görünümün ilk indexini verir
        int strg2 = str1.lastIndexOf("kara");
        System.out.println(strg2);//20 sondaki karanın basından alır indexi. son görünümün ilk indexini verir
        String s = "Mississippi";
        int indxI = s.indexOf('i');//içinde char da string de calışır; indexOf.==>>> char olunca tek karakter olmalı içinde
        System.out.println(indxI);//1
        int indxI1 = s.lastIndexOf('i');
        System.out.println(indxI1);//10
        int indxI2 = s.indexOf("iss");//İLKİNİ VERİR ====>>>1
        System.out.println(indxI2);
        int indxI3 = s.lastIndexOf("iss");
        System.out.println(indxI3);// 4
        //   indexOf metodu her zaman int verir

        // Example 1 : bir String dekibir karaterin tekrarlıveya tekrarlı olup olmadıgını göst. code u yaznz
        // "Helloooo"===> H-> tekrarsız    e---> tekrarsız    l---> tekrarlı    o---> tekrarlı
        String t = "Helloooo";
        char c = 'e';
        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("tekrarsız");
        } else {
            System.out.println("tekrarlı");
        }
        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a", 6);// "a" nın ilk görünümünün index i lazım ama 6 karakterden sonraki "a" ya bak demek
        System.out.println(sonuc);//7

        int sonuc1 = u.indexOf("n", 5);//
        System.out.println(sonuc1);//14 "n" nin ilk görünümünün indx ni ver ama ilk 5 karakteri alma sonraki "n" yi al "
        // indeksi her zaman en bastan sayıyoruz. 5 ten sonra alma desen bile kacıncı n yı aldıgını gösterirr
        //indexOf iki parametre ile kullanılırsa ikinci parametrede verilen sayı kadar karakteri gectikten sonra istene karakterin
        //ilk görünümünün indexini return eder
        int son = u.lastIndexOf("a", 5);
        System.out.println(son);//2:
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 7);
        System.out.printf(m);

        String v = "";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);//true
        // isEmty metodu bir String in boş olup olamadığını kont eder.
        // eger string de hiç karakter yoksa isEmpty metodu "tru" return edr.
        // herhangi bir karakter varsa "false" return eder. lentgh()==0 demek isEmpty true verir demek.
        //        isEmpty() ile bir iş yaparsın<<<<<<----->>>>>>>>   lentgh() == 0 dersen gülerler
        // bir string in boş olup olmadıgını anlamak için lentgh ==0 kullanma

        String x = " ";
        boolean blankMı = x.isBlank();
        System.out.println(blankMı);//true :"" ve " " ya da "      " : için true verir. yani hem bos string için
        // hemde sadece space içeren stringler için true return eder

//example 2: Kullanicidan alinan isim mutlaka space'den faarkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("ilk Isminizi giriniz...");
        String ilk = input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("Isminizi giriniz");
        } else
            System.out.println(ilk);

    }
}




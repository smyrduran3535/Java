package javaSlaytSorular;

import java.util.Scanner;

public class Stringmanupulation {
    public static void main(String[] args) {
        //example 1: kullanıcıdan bir cümle ve bi,r har isteyin, harfin cümlede var olup olmadığını yazd.
        Scanner input = new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String cümle = input.nextLine().toLowerCase();
        System.out.println(cümle.indexOf('a'));
        System.out.println(cümle.indexOf("u"));
        System.out.println(cümle.indexOf("ben"));
        System.out.println(cümle.indexOf('x'));
        System.out.println(cümle.indexOf('a', 4));

    /*
    Kullanıcıdan bir cümle veya bir kelime isteyin, kelimenin cümledeki kullanıma bakarak
    aşağıdaki 3 cümleden uygun olanı yazdırın
    Girilen kelime cümlede kullanılmamıs
    Girilen kelime cümlede bir kere kullanılmış
    Girilen kelime cümlede birden fazla kullanılmış
     */
        System.out.println("cumleyi giriniz");
        String cumle = input.nextLine();
        System.out.println(cumle.indexOf("enteresan"));
        System.out.println(cumle.indexOf("cok"));
        System.out.println(cumle.indexOf("java", 4));


//>>>>>>>>>>>>>>>>>>>>>>>>>>LastIndexOf<<<<<<<<<<<<<<<<<<<<<<<<<<
        //example 1: kullanıcıdan bir cümle ve bir harf isteyin, harfin cümlede var olup olmadığını yazd.
        System.out.println("yeni bir cümle giriniz");
        String yeniC = input.nextLine();
        System.out.println(yeniC.lastIndexOf('a'));
        System.out.println(yeniC.lastIndexOf("a"));
        System.out.println(yeniC.lastIndexOf("ben"));
        System.out.println(yeniC.lastIndexOf("java"));
        System.out.println(yeniC.lastIndexOf('t'));
        System.out.println(yeniC.lastIndexOf("a", 5));


    }


    }
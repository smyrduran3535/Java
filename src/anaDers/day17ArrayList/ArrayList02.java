package anaDers.day17ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //example :1: verilen bir listteki elemanları tekrarsız olarak yazınız
        //[2,3,2,2,5]===>[2,3,5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();
        for (Integer w : a) {
            if (!yeni.contains(w)) {//w:[2,3,2,2,5]
                yeni.add(w);}

            System.out.println(yeni);//[2, 3, 5]

        }
        //example :2: kullanıcıdan bir harf alınız.harf sizdeki List in içinde varsa o harfi "bulundu" ya ceviriniz yoksa o harfi Liste ekleyiniz
        //      [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //      [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner scan=new Scanner(System.in);
        String harf="";
        List<String> c=new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        do{
            System.out.println("harf giriniz");
            harf=scan.next().substring(0,1);

            if(c.contains(harf)){
                c.set(c.indexOf(harf),"bulundu");

            }else if(!harf.equals("Q")){
                c.add(harf);
            }
        }while(!harf.equals("Q"));
        System.out.println(c);//[A, K, R, S, x]=====[bulundu, bulundu, bulundu, bulundu, W, L, K]



    }
}


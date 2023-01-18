package java_questionBank.set;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {
        /*
        1) Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
         Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(7);
        list.add(15);
        list.add(7);
        list.add(7);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("set.size() = " + set.size());//setler tekrarlı elemanları yazdırmaz

        /*
        2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.*/
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        mySet.retainAll(myList);
        System.out.println(mySet);//[7, 10, 13]

        /*
        3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
           Örnek: ‘Mississippi’ ´ Misp
         */
        String kelime = "Mississippi";
        String[] c = kelime.split("");
        //System.out.println(Arrays.toString(c));

        List<String> s = Arrays.asList(c);

        Set<String> klmSet = new HashSet<>(s);
        System.out.println(klmSet);//[p, s, i, M]

      /*
      4) Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
         bir kod yazınız.
       */
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(31);
        l.add(15);
        l.add(7);
        l.add(13);
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(7);
        st.add(35);
        st.add(13);

        st.addAll(l);
        System.out.println(st);//bu setlerden aynılarını almaz  [35, 7, 10, 13, 31, 15]

        l.addAll(st);
        System.out.println("l = " + l);//list hepsini alır : [10, 31, 15, 7, 13, 35, 7, 10, 13, 31, 15]

        /*
        5) Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
         */

        List<Integer> myLst = new ArrayList<>();
        myLst.add(10);
        myLst.add(31);
        myLst.add(15);
        myLst.add(7);
        myLst.add(13);
        Set<Integer> ss=new HashSet<>(myLst);
        System.out.println(ss);

        //if kullanıp soralım
        if (myLst.size()>ss.size()){
            System.out.println("tekrarlanan eleman vardır");
        }else{
            System.out.println("tekrarlanan eleman yoktur");
        }


    }
}

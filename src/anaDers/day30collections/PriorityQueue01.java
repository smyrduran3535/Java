package anaDers.day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        //PriorityQueue olustururken kendisi bir class constractor olabilir.
        PriorityQueue<String> myQeueu=new PriorityQueue<>();
        myQeueu.add("A");
        myQeueu.add("E");
        myQeueu.add("B");
        myQeueu.add("G");
        myQeueu.add("C");
        System.out.println(myQeueu);//[A, C, B, G, E]:verdigimiz siralamayı yapmadı. javanın kendisine gore belirledigi oncelige gore sıralama yapar;
        //random demek degildir bu;oncelik ile ilgilidir.                               "priority=oncelik demek"
        //biz istersek kendimiz sıralama kuralı belirleyebiliriz;prioty'i sectigimizde...(lambda dersinde)
        // biz soylemedikce java kendi belirledigi oncelige gore sıralar
    }
}

package anaDers.day32Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        //for-loop kullanarark her elemanın sonuna !isareti koyunuz
        for (String w : myList) {
            w = w + "!";
        }

        System.out.println(myList);//[Z, K, A, J, M]:list degismedi.looplar kendi baslarına collectıonları-listleri update edemiyolar
        //bu yuzden java ıteratorları olusturdu. ıteratorlar collectionlari ****update etmek icin****** kullanılır.
        //ıteraturlar olusturulurken bastan olusturulmaz elimizdeki listten baslarız
        //ıteraturlar loopların bir versiyonudur
        //2 tane iterater var:normal ve list iterater .. list olanda daha cok ozl var

        ListIterator<String> itr = myList.listIterator();//bunu yazınca java ıterater yapı olust.butun elemanlar icinde var.
        // ve bunun icine pointer koyar.hasNext(); pointera(yanıp sonen imlec asagıdaki) gider senden sonra eleman var mi der.
        // sonra next metodu elemanı verecek.next(); pointerı tutar bir sonraki elemanın onune koyar
        //simdi loop kullancaz. ıteraturlarda whşle kull.
        while (itr.hasNext()) {//hasnext: bir sonraki eleman var mı dıye kontrol ederr
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);//[Z!, K!, A!, J!, M!]
        //listıteratur da basa pointer koyar
    }
}
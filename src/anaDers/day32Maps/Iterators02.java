package anaDers.day32Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        //hashNext() methodu pointer dan sonra eleman varsa true yoksa false dondürür
        //next()methodu ise pointeri bir sonraki elemanin onune koyar ve ustunden tladigi elemani return eder
        //hasPrevious() method'u pointer önce eleman varsa "true", yoksa "false" return eder.
        //previous() method'u pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        //example 1:Iteraters kullanarak list elemanlarını tersten konsola yazdırınız

        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()) {
            String el = itr.next();
        }
        while (itr.hasPrevious()) {
            String el = itr.previous();
            System.out.print(el + " ");
        }
//example 2: listteki tum elemanlari siliniz
        while (itr.hasNext()){
            itr.next();//saga itiyor
            itr.remove();//usttunden atlanan elemanı siliyor
        }
        System.out.println(myList);
        /*
        ListIterato da;
        1)hasNext()
2)next()
3)set()
4)hasPrevios()
5)previous
6)remove() ogrendik
         */
        List<String> yourList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        /*
        2 taraflı haraket etmek istemiyorsan;
        list elemanlarının degistrilmesini istemiyorsan
        list elemanlarının hepsinin silinmesini istiyorsan;Iterator kullan... az ozl var cunku...
        List iterator da cok ozl. var...
        ulkelerden 183 tane...
        en fakir 20 ulkeyi ulke list inden cıkarmak isterse list kullan
         */
        Iterator<String> iterator= yourList.iterator();//bendeki listten olust
        while (iterator.hasNext()){
          String el=  iterator.next();
            System.out.println(el);
        }
        //listleri update etmek icin ListIterator kullanılır

    }
}



package anaDers.day29abstractioncoolection;

import java.util.LinkedList;

public class LinkedList01 {
    //ArrayLİstler index kullanır ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zanman kaybettirir
    // cunkıu bircok elemanın re-index edilmesi gerekir.bu problemi java yapı olusturarak cozmus. bu olusturdugu yeni yapı :
    // LinkedList gelistirmistir.LinkedListlerde her eleman 2 bolumden olusuır. ilk bolum:data bolumleri;
    // ikinci bolum:pointer bolumu;onceki pointer sonraki pointeri gosterir.Link demek birbirine baglanmıs demek.
    // bu yapının ozel ismi var;"Node" derler eleman yerine LinkedListlerde;
    // bu yapıın en son elemanı kendisinden sonra eleman olmayacagı icin "null" gosterir
    // son node'un adı:"Tail"' dir. ilk elemanı ise "Head" gosterir.head in icinde data yok sadece pointer var.
    // eklemeyi ise pointerı kırıp eklenecek olana elemanın pointerına gelir.
    // LİnkList eleman ekleme ve eleman silmede cok basarılıdır.ArrayList uzun surer
    // bu yuzden elema ekleme ve eleman silmeyi cokca yapacagınız durumlarda LinkList kull
    // ******Arraylist de index kullanmanın poztıf tarafı:adres gibidir,java direk gelir.LinkList de index yok;
    // her elemana sorar senden sonraki mi diye?bu iyi degiil. o zaman LinkList eleman bulmada basarılı degil,ArrayList basarılı
    // Sozlukte arraylist kullanmak iyidir.
    /*
    hoca notu:
1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */
    public static void main(String[] args) {
        LinkedList<String> visitiors=new LinkedList<>();//add metodu arraylist icin de linkedlist icin de farz ama calısması farklı
        visitiors.add("Tom");
        visitiors.add("Hanks");
        visitiors.add("Tom Hanks");
        visitiors.add("Brad");
        visitiors.add("Pitt");
        visitiors.add("Brad Pitt");
        visitiors.add(2,"Angelina Julie");// linkeedlist de index kullanılmaz ama pointer kısmı alıp baglıyo;
                                                      // index olarak algılamz nereye baglayacagını dusunup yapar
        visitiors.add("Tom Hanks");
        visitiors.add("Brad Pitt");


        System.out.println(visitiors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]:idx 2; eklemenden onceki hali

        System.out.println(visitiors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitiors.addLast("Ajda Pekkan");
        System.out.println(visitiors);

        visitiors.addFirst("Cuneyt Arkın");
        System.out.println(visitiors);//[Cuneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitiors.removeFirst();
        System.out.println(visitiors);

        visitiors.removeLast();
        System.out.println(visitiors);

        visitiors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitiors);

        visitiors.removeLastOccurrence("Bratt Pitt");
        System.out.println(visitiors);

        visitiors.getFirst();
        System.out.println(visitiors);

        String firstEleman=visitiors.pop();//2 is yapar: ilk elemanı silip bize veriyor. removeFirst ile aynı.bu metod bos ise exception atar
        System.out.println(firstEleman);//tom u verdi sonrada sildi:cut-paste gibi
        System.out.println(visitiors);//[Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks, Brad Pitt]

        LinkedList<String>mylist=new LinkedList<>();
        // mylist.pop();//exception attı cunku linkedList bos

    }

}

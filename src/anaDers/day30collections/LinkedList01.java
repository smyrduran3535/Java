package anaDers.day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        String firstEl = names.peek();//bu metod;****first elementi (Head) alır ama silmez.**** ===>pop da; ilk elementi alırdı ama silmezdi.
        // eger list bos ise "null" verir
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();//list bos ise "null" verir
        System.out.println(first);//null:lisst var icinde eleman yok o yuzden null verir,bos list gormem.

        /*peek:
        Retrieves and removes the head (first element) of this list.
        poll in interface Deque
        Return: the head of this list, or "null" if this list is empty
         */
        //icinde dolu elemanı olan list var ,ordaki ilk elemanı hem silmek hemde gormek istiyorsak: """""pop()""""" kullancaz
        //listteki ilk elemanı silmeden gormek isyorsak :"""""peek()""""" kullanıcaz

        String firstEleman = names.poll();//ilk elemanı silerek bize verir===> list bossa exception atar
        System.out.println(firstEleman);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]: ilk elemanı silip verdi
/*
Retrieves and removes the head (first element) of this list.İLK ELEMANI ALIR SİLEREK VERİR BİZE;poop da aynı seyi yapar. farki;list bossa null veriyor
Specified by:
poll in interface Deque
Returns:
the head of this list, or "null" if this list is empty: listteki ilk elemanı hem silmek hemde gormek istıyorsak ama list bossa hata vermesin null versin dersek;
poll kullanıcaz
ama list bosken hata versin uygulamanın calısması dursun istiyorsak ; pop kullancaz
 */
        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans] : Alexandre ı verdi fakat silmedi
      /* element();
      Retrieves, but does not remove, the head (first element) of this list. first elemanı verir silmez.List bossa exception atar
      Specified by:
      element in interface Deque
      Returns:
      the head of this list
      Throws:
      NoSuchElementException – if this list is empty
       */

        names.peekFirst();/*
        Retrieves, but does not remove, the first element of this list, or returns null if this list is empty:peek ile aynı peekFirst
        */

        //Example 1: "A" ile baslayan tum isimleri "*****" e ceviriniz
        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);

        for (String w : students) {
            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");

            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]

    //example 2:Listteki 4 harften cok harf iceren isimleri siliniz
    //eleman sayısını azalttıgımız icin i'ye ihtiyac duyarız.o yuzden for each loop degil for loop kullanıyoruz.
        for (int i=0;i<students.size();i++){//eleman sayısına ihtiyacımız oldugu icin for loop kullanıyoruz
            if (students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);//[Mark, Tom, Hans]


    }
}

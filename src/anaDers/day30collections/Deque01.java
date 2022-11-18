package anaDers.day30collections;

import java.util.Deque;
import java.util.LinkedList;

/*
De: Double Ended Queue manasındadır.Yani "2 uclu Queue" manasındadır.FIFI ve LIFO ikisi beraber gerektiginde  "Deque" kullanılır
altaki kullanırsan; FIFO : first in first out
usten kullanırsan; LIFO : last in first out

 */
public class Deque01 {
    public static void main(String[] args) {
        Deque<String> furnitureTruck=new LinkedList<>();// List<----Linkedist--->Deqeu ;linkedlisti parent ı deque diger parent list tir.
        // o yuzden linkedlist kullandık.Deque kullanamazdık interfacedir cunku.

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);//[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table] :tekrarlı elemanı kabul ediyor.

        /*
         Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
         if it is possible to do so immediately without violating capacity restrictions,:   kapasite kontrolu yapıyor.
         throwing an IllegalStateException if no space is currently available.
This method is equivalent to addFirst.
Params:
e – the element to push
Throws:
IllegalStateException – if the element cannot be added at this time due to capacity restrictions
ClassCastException – if the class of the specified element prevents it from being added to this deque
NullPointerException – if the specified element is null and this deque does not permit null elements
IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */
        furnitureTruck.push("Refrigerator");//addFirst metod ismiyle aynı.kapasite kontorulu yapar ilk sıraya koyar
        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

    }
}

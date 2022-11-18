package anaDers.day17ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {


    public static void main(String[] args) {
        //ex: bir listeki elemanlardan birbirine en yakın olan ikisini bulunuz
        //[12,15,19,30,21]----19 ve 21
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]
        Collections.sort(a);//sort metodunu listlerde collectionsla kullanıcaz;listteki elemanları küçükten büyüge dizebilmek için kullanılır
        System.out.println(a);//[12, 15, 19, 21, 30]

        int minFark = Integer.MIN_VALUE;
        for (int i = 1; i < a.size(); i++) {
            minFark= Math.min(minFark,a.get(i)-a.get(i-1));

        }
        System.out.println(minFark);


    }
}

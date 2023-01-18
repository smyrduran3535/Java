package y_calismalarim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HasMapC01 {
    public static void main(String[] args) {
        /*
        Task:
        3 gruba ayrilan Mentor 6 takimi, farkli konularin oldugu
        6 farkli torbadan ilk hafta konu anlatimi icin her grup bir torba cekecektir.
        Her gruba bir torba veren codu yaziniz.
         */
        HashMap<String, String> eslesme = new HashMap<>();
        Set<String> grupSet = eslesme.keySet();
        List<Integer> list = new ArrayList<>();

        String gruplar[] = {"1. Grup", "2. Grup", "3. Grup"};
        String topbalar[] = {" 1. Torba", " 2. Torba", " 3. Torba", " 4. Torba", " 5. Torba", " 6. Torba"};


        boolean secim = true;
        while (secim) {
            int grup = (int) (Math.random() * 3);
            int torba = (int) (Math.random() * 6);
            if (list.size()<=3) {
                list.add(grup);
                if (!grupSet.contains(gruplar[grup])) {
                    eslesme.put(gruplar[grup], topbalar[torba]);
                }
            }else{
                secim = false;
            }


        }

        System.out.println(eslesme);

    }
    }


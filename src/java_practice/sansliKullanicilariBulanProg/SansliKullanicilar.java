package java_practice.sansliKullanicilariBulanProg;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SansliKullanicilar {
    public static void yazdir(List<String> liste) {
        for (String w : liste) {
            Integer saniyemiz = Integer.valueOf(w.replaceAll("[^0-9]", ""));
            if(saniyemiz < 10) {
                System.out.println("Kazanan isimler ve saniyeleri: ");
                System.out.println(w);
            }
        }
    }
}

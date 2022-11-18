package anaDers.day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //size verilen bir kel,medeki kullanılan harflaerin kacar kere kullanıldıgını gosteren kodu yaz

        String kelime = "abbcaa";

        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));

        HashMap<String, Integer> gorunum = new HashMap<>();

        for (String w : harfler) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {//ikinci b ve c'de burası calısmaz null vermez cunku +1 yapar degeri
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);

    }
}

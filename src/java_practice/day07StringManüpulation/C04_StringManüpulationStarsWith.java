package java_practice.day07StringManüpulation;

public class C04_StringManüpulationStarsWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle="Kazananlar hic hata yapmayanlar degil vazgecmeyenlerdir";
        System.out.println(cumle.startsWith("Ka"));
        System.out.println(cumle.endsWith("dir"));


    }
}

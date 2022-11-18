package java_practice.day07StringManüpulation;

public class C02_StringManüpulationSubstring {
    public static void main(String[] args) {

        /** substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

//10.index dahil sonuna kadra verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.substring(10));
//son 10 harfi yazdirin >>>>gibi olsa:
        System.out.println(cumle.length() - 9);//14 verir
        System.out.println(cumle.substring(cumle.length() - 9));//gibi olsa

// ilk 10 karakteri alma
        System.out.println(cumle.substring(0,10));

// 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(cumle.substring(11,cumle.length()));

    }
}

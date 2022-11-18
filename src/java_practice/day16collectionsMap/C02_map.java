package java_practice.day16collectionsMap;

import java.util.HashMap;

public class C02_map {
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
    // input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
    // output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};
    public static void main(String[] args) {
        String[] ad={"Ahmet", "Alev", "Gulay"};
        String[] soyad={"Yilmaz", "Erdem", "Kaleli"};
        HashMap<String,String> adsoyad=new HashMap<>();
        for (int i = 0; i <ad.length ; i++) {
            adsoyad.put(ad[i],soyad[i]);
        }
        System.out.println("ad soyad "+adsoyad);
    }
}

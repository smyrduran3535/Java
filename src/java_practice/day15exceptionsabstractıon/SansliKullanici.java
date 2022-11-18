package java_practice.day15exceptionsabstractıon;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciID, List<Integer> listKullaniciSaniye) {
        //ilk 10 saniyede girenleri yakalamak lazım
        List<String> sanliKullaniciIndexleri=new ArrayList<>();
        for (int i = 0; i <listKullaniciSaniye.size() ; i++) {

            if (listKullaniciSaniye.get(i)<10){
                sanliKullaniciIndexleri.add(listKullaniciID.get(i));
            }
        }
        System.out.println("Sanslı Kullacılar");
        System.out.println(sanliKullaniciIndexleri);
    }
}

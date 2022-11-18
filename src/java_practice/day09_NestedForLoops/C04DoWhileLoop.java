package java_practice.day09_NestedForLoops;

public class C04DoWhileLoop {
    public static void main(String[] args) {
        /*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
    Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
    int MuzSayısı =165, hayatta kalmaDays = 0;
    boolean maymunAlive = true;
    */


//Maymunun kac gun hayatta kalacagini gosteren kod
//Hayatta kaldigi suerece muz vermelisin(DO While)
//eger 4 ten az muz kalirsa maymunlar olur
        int muzSayisi = 165;
        boolean maymunAlive = true;
        int survivalDays = 1;//maymunun yasadıgı gunu 0dan baslattık

        do {
            muzSayisi -= 4;//hergun 4 er muz eksiltir
            survivalDays++;//kalan muzlar bitmedigi icin yasamaya devam eder
            if (muzSayisi < 4) {
                maymunAlive = false;
                muzSayisi=muzSayisi-4;
                System.out.println("bugun" + (survivalDays+1) + "gun yasadı."+muzSayisi+" kaldı .1 gun yasadı.Maymun oldu");
            } else System.out.println("bugun" + survivalDays + "gun yasadı."+muzSayisi+"kaldı.muz bitmedi. maymun hayatta");


        } while (maymunAlive);
        System.out.println("toplam maymununyasadıgı gun sayısı" + (survivalDays-1));

    }
}

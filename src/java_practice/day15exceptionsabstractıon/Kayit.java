package java_practice.day15exceptionsabstractıon;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner{

    static List<String> listKullaniciID = new ArrayList<>();
    static List<Integer> listKullaniciSaniye = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int counter = 0;

    public void kayit() {
        String kullaniciID = "";
        System.out.println("lutfen kullanici ID giriniz");
        kullaniciID = input.nextLine();
        int kullaniciSaniye = LocalDateTime.now().getSecond();//0 İLE 60 SANİYE ARASINDA ARSINDA BİR DEGER ALIR
        System.out.println("kullanıcı sanıye " + kullaniciSaniye);
        listKullaniciID.add(kullaniciID);
        listKullaniciSaniye.add(kullaniciSaniye);
        tamamMIDevamMi();
    }

    private void tamamMIDevamMi() {
        String tmmMDvmM = "";
        do {
            System.out.println("Baska kayit var mi?(E/H)");
            tmmMDvmM = input.next();
            if (tmmMDvmM.equalsIgnoreCase("e")) {
                kayit();//yukarıdakı metodu cagırıyoruz
            } else if (tmmMDvmM.equalsIgnoreCase("h")) {
                System.out.println("gule gule");
                break;
            }
        } while (!tmmMDvmM.equalsIgnoreCase("e") && !tmmMDvmM.equalsIgnoreCase("h"));
            counter++;//counter ile geri dondurduk,tekrar loop da doner
            if (counter == 1) {//bunu yazdırmazsak array ı tekrar tekrar yazdırır.bu esitligi yapmazsak sureklı sanslı kullanıcıyı yakalayınca verir bız;en son versin istiyoruz
                SansliKullanici snslKlnc = new SansliKullanici();
                snslKlnc.sansliKullaniciYazdir(listKullaniciID, listKullaniciSaniye);//burası bize ıd saniye vercek
            }

        }
    }


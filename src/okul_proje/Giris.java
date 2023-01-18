package okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    Scanner obj olusturcaz
    isim yas brans telf istiycez kullanıcı ogretman adayından
    ogretmen adyı bılgileri girdikten sonra bu bilgileri ;
    depoluycaz..
    ArrayList yada List'de... add ile kullanıcıdan alınan bilgiler eklenecek
     */
    public static void main(String[] args) {
        System.out.println("Hosgeldiniz okulumuza ...");
        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyIsim=scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans =scan.next();

        System.out.println("telefonunuzu giriniz");
        String telf=scan.next();

        //scan.nextLine();//dummy komut

        //bir kaliba sokmaz lazim bunlari
        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyIsim,yas,brans,telf);

        //bir yerde topluycaz bu bilgileri:
        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
        ogretmenList.add(adayOgretmen);//aday ogretmen objesini listin icine ekliyoruz

        System.out.println("ogretmenList ="+ogretmenList);

    }
}

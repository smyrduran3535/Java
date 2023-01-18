package okulProje2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList = new ArrayList<>();//heryerdeb ulasmak icin static: Kisi; genel classım genel bilgiler burda.genis kume
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {

        System.out.println("====================================" +
                "\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" +
                " \n===================================" +
                " \n1- ÖĞRENCİ İŞLEMLERİ" +
                " \n2- ÖĞRETMEN İŞLEMLERİ" +
                " \nQ- ÇIKIŞ");


        String secim = input.next().toUpperCase();//1,2 q girerse

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";//hangi islemleri yaparsa ogrenci yazacak
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";//hangi islemleri yaparsa ogretmen yazacak
                islemMenusu();//aksiyon yapacak ekleme-cıkarma
                break;
            case "Q":
                break;

            default:
                System.out.println("hatali giris yaptın");
                girisPaneli();//hatali girdiginde tekrar basa donsun
                break;
        }

    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + " lutfen asagıdaki islemleri seciniz");

        System.out.println("============İŞLEMLER===============\n" +
                "            1-EKLEME\n" +
                "            2-ARAMA\n" +
                "            3-LİSTELEME\n" +
                "            4-SİLME\n" +
                "            5-ANA MENÜ\n" +
                "            0 -ÇIKIŞ");
        System.out.println("islem tercihinizi giriniz ");
        int secilenIslem = input.nextInt();
        switch (secilenIslem) {
            case 1:
                ekleme();
                islemMenusu();//ekleme den sonra tekrar method call yapıp metodu cagırıyoruz
                break;
            case 2:
                arama();//tc ile arama yapılacak
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();//tc ile silme olacak
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani ana menu
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("dogru giris yainiz");
                islemMenusu();
                break;
        }
    }

    private static void cikis() {
        System.out.println("Yine okulumuza bekleriz... Hoscakalin...");
    }

    private static void silme() {//silme isleminde tc yazılacak
        System.out.println("****" + kisiTuru + "  arama sayfasina hosgeldin");
        boolean flag = true;
        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("silmek istediginiz kimlik no yu giriniz");
            String silinecekKimlikNo = input.next().replaceAll(" ", "");
            for (Kisi w : ogrenciList) {
                if (w.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinecek ogrenci " + w.getAdSoyad());
                    ogrenciList.remove(w);//o ogreciyi siler
                    flag = false;//islem bitti
                }
            }
            if (flag) {
                System.out.println("girdiniz ogrenci kimligi bulunamadı ");
            }
        } else {//ogretmen islemleri icin kontrol
            System.out.println("silmek istediginiz kimlik no yu giriniz");
            String silinecekKimlikNo = input.next().replaceAll(" ", "");
            for (Kisi w : ogretmenList) {
                if (w.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinecek ogretmen " + w.getAdSoyad());
                    ogretmenList.remove(w);//o ogretm. siler
                    flag = false;//islem bitti
                    break;//hata vermemesi icin
                }
                if (flag) {
                    System.out.println("girdiniz kimlik ile ogretmen bulunamadı ");
                }
            }
        }

    }
    private static void listeleme() {
        System.out.println("****" + kisiTuru + "arama sayfasina hosgeldin");
        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("ogrenciList = " + ogrenciList);
        } else {
            for (Kisi w : ogretmenList) {
                System.out.println("w.toString() = " + w.toString());//toString hepsini getirir
            }
        }

    }
    private static void arama() {
        System.out.println("****" + kisiTuru + "arama sayfasina hosgeldin");
        //bayrak yapıcaz:for dan while dan cıkmak icin.aksiyon bitince bitecek
        boolean flag = true;//true olan her sart devam eder bayrak yukarda

        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("kimlik no giriniz");
            String aranaKimlikNo = input.next().replaceAll(" ", "");//kull bosluk girerse bosluksuz alsın
            //arama olacagı icin for each ile yapıcaz
            for (Kisi w : ogrenciList) {//kisi classında arıycak parent o
                if (w.getKimlikNo().equals(aranaKimlikNo)) {
                    //get ile herbirinin kimlik no sunu getiriyoruz ve aranakimlige esit mi?.prıvate ı getter setter yapmıstık, aldık..(encapsulation)
                    System.out.println("aradiginiz ogrenci " + w.getAdSoyad());//tc ile ogrenci varsa adını cagırıyoruz
                    flag = false;//islem bittigi icin;bitsin diye false yazdık
                }
            }
            if (flag) {//flag tru ise hala bu if body si calisir.yani arana tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogrenci yok");
            }
        } else {//ogretmen icin calısacak

            System.out.println("kimlik no giriniz");
            String aranaKimlikNo = input.next().replaceAll(" ", "");
            //arama olacagı icin for each ile yapıcaz
            for (Kisi w : ogretmenList) {//kisi classında arıycak parent o
                if (w.getKimlikNo().equals(aranaKimlikNo)) {//true old calıscak
                    //get ile herbirinin kimlik no sunu getiriyoruz ve aranakimlige esit mi?.prıvate ı getter setter yapmıstık, aldık..(encapsulation)
                    System.out.println("aradiginiz ogretmen " + w.getAdSoyad());//tc ile ogrenci varsa adını cagırıyoruz
                    flag = false;//islem bittigi icin;bitsin diye false yazdık
                }
            }
            if (flag) {//flag tru ise hala bu if body si calisir.yani arana tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogretmen yok");
            }//else body si ogretmen icin
        }
    }


    private static void ekleme() {//bu method hem ogrenci hemde ogretmen eklemek icin tasarlandı
        System.out.println("***" + kisiTuru + " ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim gir");
        input.nextLine();
        String adSoyad = input.nextLine();

        System.out.println("kimlik no");
        String kimlikNo = input.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();

        if (kisiTuru.equals("OGRENCİ")) {//switch den aliyor
            System.out.println("ogrenci no'sunu giriniz");
            String ogrenciNo = input.next().replaceAll(" ","");

            System.out.println("sinif giriniz ");
            String sinif=input.next().replaceAll(" ","");

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);//bilgileri sırayla girmemiz lazim
            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);

        }else {//ogretmen ise
            input.nextLine();
            System.out.println("bolum giriniz");
            String bolum = input.nextLine();

            System.out.println("sicil no giriniz");
            String sicilNo = input.nextLine();

            ///ogretmen Classından ojde alıcaz
            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);//sıralama onemlı aynı olması lazım
            ogretmenList.add(ogretmen);//yukarda listimizin adıogretmenListtir.olusturdugumuz obleyi atıyoruz
            System.out.println(ogretmenList);
        }

    }
}


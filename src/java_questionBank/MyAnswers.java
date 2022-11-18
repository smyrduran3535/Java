package java_questionBank;

import java.util.Scanner;

public class MyAnswers {
    public static void main(String[] args) {


//  1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
//toplamını konsola yazdırınız
     /*   double gomlek = 25;
        double pantalon = 60;
        double kazak = 45;
        System.out.println("toplam :" + (gomlek + pantalon + kazak));

        //  2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        //değişkenlerin değerlerinin çarpımını konsolda yazdırınız.

        float a = 125f;
        long b = 78L;
        int c = 25;
        System.out.println("carpım :" + a * b * c);

//  3 )Basit faizi bulmak için bir kod yazınız.
//Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        int anapara = 10000;
        int oran = 6;
        int yılDegeri = 3;
        int basitFaiz = anapara * oran * yılDegeri / 100;
        System.out.println("basit faiz formulü :" + basitFaiz);

//  4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
//toplamını ve çarpımını String ile yazdırınız
        String boy = "boy";
        long m = 100L;
        long cm = 80L;
        System.out.println((boy + (m + cm)));
        System.out.println((boy + (m * cm)));

//  5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
//ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız
        boolean sınıf = true;
        boolean erkek = false;
        int x = 5;
        int y = 6;
        System.out.println("x\t" + sınıf + "\t" + erkek + "\t" + "y");

//  6)3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
//Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız
        long kitap = 80L;
        long defter = 40;
        long laptop = 6500L;
        System.out.println(2 * kitap + 4 * defter + 3 * laptop);
//  7) İki tamsayıyı değiştirmek için bir kod yazınız
        int o = 20;
        int p = o;
        double q = 65;
        double z = q;
        System.out.println("p :" + o);
        System.out.println("q :" + z);

//  1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        short sum = 45;
        int dur = sum;

//  2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz

        long yas = 105L;
        int yeniYas = (int) yas;

// 3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz
        double sayi = 1453.8;
        float sayiYeni = (float) sayi;

//  4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
//Sonrasında bu short değişkenin değerini konsolda yazdırınız.
//Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır
        double num = 125.2;
        short numYeni = (short) num;
        System.out.println(numYeni);


//  5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
//Sonrasında bu double değişkenin değerini konsolda yazdırınız.
//Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
        byte num1 = 25;
        double num2 = num1;
        System.out.println(num2);

//  1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
//bulmak için bir kod yazınız
        System.out.println("TOPLAM :" + (Byte.MIN_VALUE + Short.MAX_VALUE));

//  2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
//yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
//değişken arasındaki farkı yazdırınız.

        byte say = Byte.valueOf("103");
        short say1 = Short.valueOf("2351");
        System.out.println("fark :" + (say1 - say));

//  3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
        //string deger data türlerinde yazdırılabilir:valueOf(String s)
        /*
        parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
isteyebileceğimiz durumlar da vardır.
Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() statik
bir metoddur.
         */

//   1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
//ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
//yazdırınız.

            //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<İF STATEMENT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

/*            1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
            a) Aralık, Ocak, Şubat için "Kış"
            b) Mart, Nisan, Mayıs için "İlkbahar"
            c) Haziran, Temmuz, Ağustos için "Yaz"
            d) Eylül, Ekim, Kasım için "Sonbahar"
            e) Diğerleri için "Geçersiz ay adı */

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen ay seciniz :\na) Aralık, Ocak, Şubat için \"Kış\"\n" + "b) Mart, Nisan, Mayıs için \"İlkbahar\"\n"
                    + "c) Haziran, Temmuz, Ağustos için \"Yaz\"\n" + "d) Eylül, Ekim, Kasım için \"Sonbahar\"\n"
                    + "e) Diğerleri için \"Geçersiz ay adı\n");
            String ay = scan.nextLine();

            if (ay.equalsIgnoreCase("aralık") || ay.equalsIgnoreCase("ocak") || ay.equalsIgnoreCase("subat")) {
                System.out.println("Kış");
            } else if (ay.equalsIgnoreCase("mart") || ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("mayıs")) {
                System.out.println("İlkbahar");
            } else if (ay.equalsIgnoreCase("haziran") || ay.equalsIgnoreCase("temmuz") || ay.equalsIgnoreCase("ağustos")) {
                System.out.println("Yaz");
            } else if (ay.equalsIgnoreCase("eylül") || ay.equalsIgnoreCase("ekim") || ay.equalsIgnoreCase("kasım")) {
                System.out.println("Sonbahar");
            } else System.out.println("geçersiz ay adı");


/*2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"*/
            System.out.println("lütfefn şifrenizi giriniz ");
            String sifre = "125a 45k7";
            if (sifre.replaceAll(" ", "").length() > 7) {
                System.out.println("gecerli şifre");
            } else if (sifre.replaceAll("\\p{Punct}", "").length() > 7) {
                System.out.println("Şifrede boşluk karakteri kullanmayınız");
            }
            String pwd = "Az12/*587";

            boolean pwdLength = pwd.replaceAll(" ", "").length() > 7;
            boolean pwdSpace = pwd.contains(" ");

            String sonuc = pwdSpace ? "Bosluk karakteri kullanmayiniz" : (pwdLength && !pwdSpace ? "Geçerli Şifre" : "Gecersiz sifre");
            System.out.println("Parola = " + sonuc);


            if (!pwdSpace) {
                if (pwdLength && !pwdSpace) {
                    System.out.println("Sifre : Gecerli sifre");
                } else {
                    System.out.println("Sifre : Gecersiz sifre");
                }
            } else {
                System.out.println("!!! Bosluk karakteri kullanmayiniz !!!");
            }



//4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
//b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

            //System.out.println("3 basamaklı sayıyı giriniz :");
            //İnt g = scan.nextInt();

            //if (g % 10 == 5 && g % 10 > 5) {
            //    System.out.println("son basamagı bir üst ondalığa yuvarla :" + (g / 10 + 1) * 10);
            //} else {
            //    System.out.println("son basamagı bir alt ondalığa yuvarla:" + (g / 10 + 1) * 10);
            //}

      /*  5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen
                   */
     /*   int s = 6;
        int d = 8;
        int e = 5;
        if (s == d && s == e) {
            System.out.println("eşkenar üçgen");
        } else if (s == d && s != e || s == e && s != d || d == e && d != s) {
            System.out.println("ikizkenar üçgen");
        } else if ((s == d && d != e || s == e && d != e || d == e && s != e)) {
            System.out.println("ikizkenar üçgen");
        } else {
            System.out.println("cesit kenar üçgen");
        }
        */

/* 6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
 konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
 konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
*/
     /* double mil = 10;
        double saniye = 7200;
        double fahrenayt = 83;

        String operator = "fahrenaytdanSantigarata";

        if (operator.equalsIgnoreCase("mildenKmye")) {
            System.out.println(mil * (1.609344));
        } else if (operator.equalsIgnoreCase("saniyedenSaate")) {
            System.out.println(saniye / 60 / 60);
        } else if (operator.equalsIgnoreCase("fahrenaytdanSantigarata")) {
            System.out.println((fahrenayt - 32) / 5);
        }

      *///BİZ KENDİMİZ GİRERSEK DEGERLERİ


      /*  Scanner scan3 = new Scanner(System.in);
        System.out.println("mili giriniz");
        double mil = scan3.nextDouble();
        System.out.println("saniyeyi giriniz");
        double saniye = scan3.nextDouble();
        System.out.println("fahraneytı giriniz");
        double fahraneyt = scan3.nextDouble();
        System.out.println("operatörü giriniz");
        String operator = scan3.nextLine();
        System.out.println("mildenKmye için -->1 i secin" + "\nsaniyedenSaate için--> 2 yi secin" + "\nfahrenaytdanSantigarata için---> 3 ü secin");
        int operatorSecim = scan3.nextInt();
        if (operatorSecim == 1) {
            System.out.println("mildenKmye=" + (mil * (1.609344)));
        } else if (operatorSecim == 2) {
            System.out.println("saniyedenSaate=" + (saniye / 60 / 60));
        } else if (operatorSecim == 3) {
            System.out.println(("fahrenaytdanSantigarata=" + (fahraneyt - 32) / 1.800));
        }

/*) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.
Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
"Geçersiz Ad"
*/










/*
8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
yazmalıdır
 */










/*
9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır
 */

        }

    }




package calısmalarım_kitap_youtobe.Array;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
  /*
        Array'lerde primitive data turleri ve String kullandık. ancak data türleri saddece bir deger alabiliyordu.
        boolean emekliMi=false;
        double not=48.5;
        ınt yas=25;
        String isim="ali can";


        oysa gelişmiş bir uyguma listeler olusturmamız ve bunları yönetmemız gerekir

        birden fazla içerisine deger ve obje olusturacagımız java objesi : "Array"lerdir


       ör: bir okul uygulaması yapacak olsak,sınıf listeleri,ogretmenve ogrenci liteleri,notlar vb.
        liste olarak tutmamız gereken bir cok data olacaktır.

        java,birden fazla veriyi store edebilen farkli yapilar olusturmustur. bunlardan hangisi kullanıcagımıza
        yapacagımız uygulamadaki ihtiyaclara göre karar veririz

        HANGİ DATA TÜRÜ KULLANILMALI?
        Java'da coklu eleman store edebileceğimiz pekcok data türü vardır

        Hangisini kullanacagımıza karar vermek için data turlerının ozelliklerini
        ve
        uygulamamızn ihtiyaclarını bilmeliyiz

        ÖRNEGİN
        Bir eczanede her yeni gelen urunu one koyup satısları da onden yaparsanız
        bazı ılacların son kullanım tarihi gecerlir
        buna karsılık plastik boru satan bir işletmenin en once geleni once satmak ıcın en alttakini almayaalmaya gerek yoktur

         */

         /*
         Array, aynı datya turundeki birden fazla deger veya obleji barındırabilen java objeidir
         Arraylerin içerisine primitive datalar gibi non primitive objeler koyabiriz.Array içinde array de koyabiliriz
          */

       /* //Array ile ilgili bilinmesi gerelkenler
        //1 : bir variablenın Array oldugunu belirtmek için [] kullanılır
        int sayi1 = 10;
        //sadece 1 deger store edebilir
        int sayi2 = 20;


        int sayı3[] = {5, 6, 7, 8}; //int degerler barındıran array

         //Array [] 2 farklı sekild kullanılabilir
        int sayı4[] = {5, 6, 7, 8};
        int[] sayı5 = {5, 6, 7, 8};

        //bir array olusturmak istiyorsak barındıracagı data turu ve kac data bulunduracagını belirtmeşiyiz

        int sayi[]={5, 6, 7, 8};//int data turunde 4 data barındırır

        //degerleri bastan elmesek bile kac data koyacagımızı belirtmemiz gerekir
        int sayilar[]= new int [6];// int data turunde 6 data barındırır



        //degerleri bastan eklemesek ;

        // Java istediğimiz uzunlukta bir Array olusturacak ve tum elemanlaa default degerler atayavcaktır.
       // [0,0,0,0,0,0]
        /*default degerler sayısal datalar için 0,
        boolean için false
        char için ' ',
        String için null deger kullanılır
         */

        /*
        ARRAY OLUŞTURULURKEN UZUNLUGU BELİRTİLİR VE BU UZUNLUK ARRAY OLUSTURULDUKTAN SONRA DEĞİŞTİRİLEMEZ
      */
        int sayi5[]={5, 6, 7, 8};
        int sayi6[]=new int[6];
        //ÖNEMLİ NOT
        //BU ÖZELLİK SEBEBİYLE BİR ARRAY OLUSTURULDUKTAN SONRA VAR OLAN DATALAR UPDATE EDİLEBİLİR ANCAK,
        //var olan datalara yeni bir data eklemek veya varolan datalardan birini
        // tamamen silme(Array in uzunlugu degişmesi için)mümkün değildir

        //sayi5={5, 6, 7, 8,9}; hata verir
        //sayi6[]=new int[4];

        //sayı1 arrayine yapılan işlem omnun uzunldegiştirmek değil,tamamen yeni bir deger atamaktır

        //binek arabayı jip yapamazsın aynı marka jip alnmanız gerekir
        //arabayı jip yapmak değil,arabayı yollayıpyerine jip almaktır



        //bir arrayin elamalarına ulasmak ve uodate etmek için index kullanılır
        int sayi3[]={5, 6, 8,10};
        sayi3[2]=4;
        sayi3[0]=1;
        //[1,6,4,10]

        //bir array de olmayan bir i,ndex ile işlem yapmak isterseniz excepsion oluşur
        //sayi3[5]=5;//arrayin sınır dısına cıkan eslestirme var deyip hata verir kod calışmaz


        //bir arrayi veya elamanları yazdırmak
        /*
        array non-prpmitive bir data dır. ve cogu non-primitive data gibi array lerde direk yazdırılmaz,
         ancak javanın olusturdugu Arrays classından yardım alınarak yazdırılır
         */
        int sayi8[]={5, 8, 7, 8};
        System.out.println(sayi8);//referans degeri verir
        System.out.println(Arrays.toString(sayi8));//[5, 6, 7, 8]
        //array elemanları ise data turune baglı olarak direk yazdırılabilir
        System.out.println(sayi8[2]);//8
        System.out.println(sayi8[1]);//6  ====>>>arrayin elemanı array ise yine arrays classı lazım yoksa hata verir


        //bir arrayi Stringe cevirmek
        String str= "Java, cok guzel.";

        str.split(" ");//bu array döndürecek stringlerden gelen
        String[]kelimeler=str.split(" ");//spaceleri seceriz yok olur arraye alır
        System.out.println(Arrays.toString(kelimeler));//array olusturmak için array sınıfından yardım almak lazım
        //[Java, cok, guzel]

        String[]kelimeler2=str.split("a");
        System.out.println(Arrays.toString(kelimeler2));//[J, v,  cok guzel]

        String[]kelimeler3=str.split("cok");
        System.out.println(Arrays.toString(kelimeler3));//[Java ,  guzel]

//harflere ayırmak için:
        String[]kelimeler4=str.split("");
        System.out.println(Arrays.toString(kelimeler4));//[J, a, v, a, ,, , c, o, k,  , g, u, z, e, l,.]
        //hiçlik kullanak herbir harfi ayırabiliriz. her bir karakteri ayırı virgül koyar

        int sayılar1[]={1,2,3};

        System.out.println(Arrays.compare(sayılar1, sayi8));































    }
}

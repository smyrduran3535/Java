package anaDers.Day20StringBuilderStringBuffer;

/*
 1)"StringBuilder" Java'da bir Class'dır
 2)"StringBuilder", String oluşturmaya yarar
 3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
   Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
   StringBuilder bize "Mutable String" verir.
4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
   i)Memory'de yeni bir variable yeni değerle oluşturulur
   ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
   iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

   "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.

5)String Class ların ımmutable yapısı Securty icin onemlş. aynı degere sahıp bşrden fazla string oldugunda
   Java bır tane conternar olusturur ve aynı degere sahıp strnglerin bu conteryı kullanmasını temin eder.
   bu memory i korumak ıcın ıyıdırç ancak konteynardakş degeri bir variable icin
   degistirdigimizde tum variable ların etkilenme tehlikesi vardırç
   bu tehlikeden kurtulmak icin java stringleri ımmutable(degısmez) yapmıstır.fakat ""herhangı bır varıable ın degerini
   degistirmek icin java bir yol bulmustur.
   degistirmek ıstedıgınız varıablle icin yeni bir conterbar olusturur ve varıable nın poınterını yeni variable a yonlendirir.
   boyleleikle hem degisim saglanmıs olur hemde digerlerini etkilememis olur
 */
public class StringBuilder01 {
    public static void main(String[] args) {

        String str = "Java";
        StringBuilder strb = new StringBuilder("Java");

        String hesapSahibi = "Tom Hanks";
        String hesapSahibi2 = "Tom Hanks";
        String hesapSahibi3 = "Brad Bitt";
//dateStracture denilir bunlara


        //strıngbuılder nasıl olusturulur
        //1.yol class ısım olus objeye ısım verılır icine string konulur
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);


        //2.yol:
        StringBuilder strb2 = new StringBuilder();//bos s.buılder
        //data ekleyyelim
        strb2.append("Java");
        System.out.println(strb2);//Java

        //yol a : ekleme append ile
        strb2.append(" is easy");
        System.out.println(strb2);//Java is easy

        strb2.append(" !!!");
        System.out.println(strb2);

        //yol b: yanyana
        strb2.append(" Learn").append("  Java earn").append("  money");
        System.out.println(strb2);//Java is easy !!! Learn  Java earn  money
        //append concet gibidir birletirir

        //StringBuılderlarda karakter sayısı nasıl bulunur : length metodu ile
        StringBuilder strb3 = new StringBuilder();
        strb3.append("cat");
        int numOfCar = strb3.length();
        System.out.println(numOfCar);


        //capasıte asımlarında var olanın iki katının 2 fazlasına cıkar
        int capasty = strb3.capacity();
        System.out.println(capasty);//16  :StringBuılderlar bu kadar sayı kadar yer acar. gecersen sayıyı 2 ile carpıyor 2 ekliyor

        StringBuilder strb4 = new StringBuilder();
        strb3.append("cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int capacity = strb4.capacity();
        System.out.println(capacity);//34: StringBuılderlar bu kadar sayı kadar yer acar. gecersen sayıyı 2 ile carpıyor 2 ekliyor

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int sa = strb4.capacity();
        System.out.println(sa);//70


//setcharAT():index 2 daki karakteri r ye cevirir
        strb3.setCharAt(2, 'r');
        System.out.println(strb3);//rat:

        strb3.delete(3, 18);//index 3 dahil den index 18 e kadar carakterleri siler
        System.out.println(strb3);

        strb3.deleteCharAt(2);//ındex 2 deki karakteri siler
        System.out.println(strb3);


        //-*************************************
        strb3.reverse();//ters cevirir String buılderı ters cevirir           *****************************
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxac                    *********************
        //    ********************************************************


        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);//java:
        //method kullandık ama Strıng de degistirmedi... Ama atamayaparsak degisirdi
        abc= abc.replace("a", "i");
        System.out.println(abc);//Jivi: ummutablerda orjınal degeri degistirmek icin metodu kullanmalı ve
        // birde atama islemi yapmalıyız.atama yapmadan orjınal deger degısmez.yani sadece method kullanınca olmaz

        // method kullanınca :stringbuilder kullansaydık a yerine i yazdırıdı tanımlama yapmadan orgınal deger degısırdı.sadece methodla degisir


        //toStrıng methodu:string buildertan stringe gecmek icin
        strb3.toString();//atama yapmamız lazım strıng e cevrıldıgıu ıcın
        String sitringstrb3=strb3.toString();
        System.out.println(sitringstrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxac

        //string ten de stringBuıldera asagıdakı gıbı donebilirsiniz
        StringBuilder strb5=new StringBuilder(sitringstrb3);
        System.out.println(strb5);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxac

        //insert metodu :
        strb5.insert(3,"XXXX");//ofset bosver demek: ilk 3 karakteri atla x leri koy
        System.out.println(strb5);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxac

strb5.insert(3,"KLMOPQRSTU",5,8);//3.karakterden sonra "KLMOQRSTU" stringinin ındex 5,6,7 deki carakterleri aralıgına yerls
        System.out.println(strb5);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxac

StringBuilder a=new StringBuilder("Java");
StringBuilder b=new StringBuilder("Java");


        //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
//compareTo metodu: int veriyor. alfabetik sıraya koyuyo ve sayı veriyor
  int sonuc=a.compareTo(b);
        System.out.println(sonuc);




    }
}
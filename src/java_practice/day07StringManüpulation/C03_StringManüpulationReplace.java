package java_practice.day07StringManüpulation;

public class C03_StringManüpulationReplace {
    public static void main(String[] args) {
          /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
   \\S   ==> space disindaki hersey  */

        String str1="$45.99";

        //rakam haricindekileri silin
        System.out.println(str1.replaceAll("\\D", ""));

        // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin
        String cumle ="Hert dert java gibi olsa";
        System.out.println(cumle.replaceAll("[a-zA-Z0-9]", "*")+cumle.substring(10));


        //a harfini @ isareti ile degistir
        String ders="olaganustu";
        System.out.println(ders.replaceAll("a","@"));



        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunan karakteri değiştirir
         */
        String txt = "Merhaba Dunya";
        //txt'deki butun 'a' lari 'e' ile degistirin
        System.out.println(txt.replaceAll("a","e"));


        //txt'deki ilk bulunan 'a' yi 'e' ile degistirin
        System.out.println(txt.replaceFirst("a", "e"));


     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..
      */
        //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
        String str="Dolma Kalem";
        System.out.println(str.replaceAll("kalem", "biber"));
     /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
      2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

        String str3 = "Merhaba";
        String st = "Merhaba";
        System.out.println(str3.equals(st));

        boolean birebiresitMi=str3.equals("merhaba");
        System.out.println(birebiresitMi);//true

        System.out.println(str3.equals("merhaba"));//false


        System.out.println(str3.equalsIgnoreCase("merHABA"));//true

        System.out.println(str3.equalsIgnoreCase("merha"));//false

    }
}

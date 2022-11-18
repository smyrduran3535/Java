package anaDers.day10StringManupulation;

public class StringManupulatıon {

    public static void main(String[] args) {
        String a = "Java";

        boolean b = a.startsWith("va", 2);
        System.out.println(b);
        String c = "Java kolaydır";
        boolean b1 = a.startsWith("kola", 5);//5 karakterden sonraki stringe bakar.
        System.out.println(b1);
//startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
//"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

        String c1 = a.replaceFirst("a", "*");//sadece ilk a yı yıldız yapar.

        System.out.println(c1);//J*va kolaydır
//replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
//replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        //String c = a.replaceFirst("a", "*");
        //System.out.println(c);//J*va kolaydir.


        String d = c.concat(" anladın mı?");// stringin sonuna ekleme yapmak istiyorsak.
// concat metodu 2tane stringi birbirine yapıştırmatya yarar
        System.out.println(d);//Java kolaydır anladın mı? yazdırır "concatınatıon" denir

//2.yol
        //a+"Anladın mı?";>>>>>concat varken kullanılmaz
        //concatınatıon işlemi 2 türlü yapılır.1: concat.2: + işl. ile.
        //java bir işlem için metod üretmişse o methodu kullébest practice" dir.
        //concat metodu her zaman en sona ekler

        String e = "       Tom Hanks       ";//"bastaki ve sondaki spaceleri" siler.aradaki space e dokunmaz
        System.out.println(e);//       Tom Hanks
        String f = e.trim();//sacların kırıklarını kesmek gibi ucundan kemek.bastaki ve sondaki düzeltmeleri yapar
        System.out.println(f);//Tom Hanks
        String h = "Java";
        String i = "Java";
        int k = h.compareTo(i);//alfabetik(lexicographic) olarak karsılartırır.büyük harf küçük harfe dıyarlıdır
        //büyük harf küçük harfe duyarlı olmasını istemezsek "compareToIgnoreCase" kull
        //bu kod da h nin alfebetik sırasında i nin alfebedik sırası çıkarılır

        System.out.println(k);//arada 0 fark var
        String m = "Java";
        String n = "java";
        int k1 = m.compareTo(n);
        System.out.println(k1);//-32 çünkü büyük harf ile küçük harf arasında 32 fark var

        //büyük küçük harf farkını önemsemezsek eğer
        int k2 = m.compareToIgnoreCase(n);//0 verir öemsemediği için
        String o = a.repeat(3);
        System.out.println(o);//JavaJavaJava
        //a.repeat(3) codu "a" stringini yanyana 3 kere yazar(yani uğrasma böyle ;a.concat(3)a.concat(3)a.concat(3))
        //java documente ulaşmak için:windows ctrl e basılı tut: ne döndürdügünü görürsün

//Returns a string whose value is the concatenation of this string repeated count times.
//If this string is empty or count is zero then the empty string is returned
// String o= a.repeat(0);//0 dır hiç tekrarlamaz
       // String o1 = a.repeat(-5);
       // System.out.println(o1);//count is negative: -5

    }
}



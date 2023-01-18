package anaDers.day27exceptions;
/*                                                            Interview sorusu :
    Java'da birbirine benzeyen üç tane keyword var:
    "final", "finally", "finalize" açıklayınız

    1)"final" bir keyword'dür. Variable, Class ve Method'lar için kullanılır.
"final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.

    2)"finally" bir "code block" dur.
      "try-catch" veya sadece "try" ile kullanılır.
      "finally" code block içine yazılan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir eylemdir. Bunu "finally" ile yapabiliriz.


    3)"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
      imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.

      ******** hoca acıklama:
     "final", "finally", "finalize" nedir?

final(keyword): ==> final method override edilemez.
              final variable degeri degistirilemez.
              final class child class sahibi "o l a m a z."
finally(code block) ==>try ile de kullanılır sadece.veya try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
 */

public class Exceptions01 {
    public static void main(String[] args) {
        compareNumOfCaracters("Java", "xy");
        //yazdırmak icin double kont. atarız
        double r1 = compareNumOfCaracters("Java", "xy");
        System.out.println(r1);
        double r2 = compareNumOfCaracters(null, "xy");
        System.out.println(r2);//Length() metofu null ile kullanılamaz
        //                       0.0
        double r3 = compareNumOfCaracters( "Java", "");
        System.out.println(r3);//herhangi bir sayi 0 ile bolunemez
        //                       0.0
    }
    /*
   compareNumOfCaracters("null","xy");null girerse :s.lehght() metodu calısmaz; nullpointerexc. alırız
   compareNumOfCaracters("Java","");"" girerse :s.lehght()=0 olur, metod calısmaz; Aritmeticexc. alırız
   nu yuzden bu metodu handle etmeliyiz
     */

    //Verilen iki Stringin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCaracters(String s, String t) {
        // return s.length()/t.length();//kac oldugunu vericek
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("Length() metofu null ile kullanılamaz");
        } catch (ArithmeticException e) {
            System.out.println("herhangi bir sayi 0 ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
        return result;//bu metod(try-catch) calıstıgında data base ile connection kuruyor diye dusun,
        // ister 1.durum olsun;ister 2.durum olsun;ister 3. durum olsun.yani ne olursa olsun date base ile connection'ı kesmemiz lazım.
        // bunun icinde "catch" lerden sonra "finaly" koymamız lazım.
        // Daha sonra da; DataBase ile neyin kesilmesi gerekiyorsa onu yazarız.sunu alırız;her 3 durumda da connection kesiliyor.
        // Her halukar da bir fiilin yapılmasını istiyorsak ;o fiili "finally()"arasına yazmamız gerekiyor

          /*
         Database ile connection kesildi
         Database ile connection kesildi
         2.0

         Length() metodu null ile kullanılamaz
         Database ile connection kesildi
         0.0

         herhangi bir sayi 0 ile bolunemez
         Database ile connection kesildi
         0.0
         */




    }
}














































package anaDers.day22inheritancepolymorphism;

public class CatRunner {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        //super() ; parent Consturacture ı cagırmak icin kullanılır
        //1)Object olusturulurken Constructor lar Parent dan Child a doru calıstırılır
        //2)java en ust parent consturactor a cıkabilmek icin super() kodunu kullnılır
        //3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
        //4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
        //5)"super()" kodunu gorunur sekilde de yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
        //6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.
        /*
        Constructor ile ilgili:
      A) Her class oluşturulduğunda Java otomatik olarak bir Constructor oluşturur, bu Constructor'a
         default constructor denir.
      B) Default Constructor'larin parametresi olmaz.
      C) Biz bir class'da Constructor oluşturduğumuzda, Java default constructor'i iptal eder.
      D) Constructor'lar bir class'dan yeni bir obje oluşturmak için kullanılır

         */
    }
}

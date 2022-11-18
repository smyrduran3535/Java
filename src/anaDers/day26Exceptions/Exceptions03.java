package anaDers.day26Exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        double d = divideStringByTheNumOfTheChar(null);
        System.out.println(d);
    }

    //String deki character sayısını bulunuz,Striing i integer a cevirriniz,integer ın character sayısını boluunuz
    //1.yol
    public static double divideStringByTheNumOfTheChar(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException :"null" String ile "length" kullanıldıgında alınır
            i = Integer.valueOf(str);//NumberFormatException :icinde rakamdan farklı character olan String ler valuof ile kullanıldıgında
            sonuc = i / length;//AricmetikException :Bolen sayı sifir oldugunda alınır
            //bunun okunurlugu guzel
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
//2.yol
    public static double divideStringByTheNumOfTheCharacter(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length();//NullPointerException :"null" String ile "length" kullanıldıgında alınır
            i = Integer.valueOf(str);//NumberFormatException :icinde rakamdan farklı character olan String ler valuof ile kullanıldıgında
            sonuc = i / length;//AricmetikException :Bolen sayı sifir oldugunda alınır
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {//exception butun exceptıonları halleder. butun exceptionların babasıdır.
            //anlıyor ilgılı child a yolluyor.bunun kısalıgı guzel
            System.out.println(e.getMessage());//butun exceptionlar icin genel bir uygulama

        }
        return sonuc;
    }
//3.yol
    public static double divideStringByTheNumOfTheCharacters(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length();//NullPointerException :"null" String ile "length" kullanıldıgında alınır
            i = Integer.valueOf(str);//NumberFormatException :icinde rakamdan farklı character olan String ler valuof ile kullanıldıgında
            sonuc = i / length;//AricmetikException :Bolen sayı sifir oldugunda alınır
        } catch (NullPointerException e) {
            System.out.println("null pointera ozel");
        } catch (Exception e) {//exception butun exceptıonları halleder. butun exceptionların babasıdır.
            //anlıyor ilgılı child a yolluyor.bunun kısalıgı guzel
            System.out.println(e.getMessage());//butun exceptionlar icin genel bir uygulama
            System.out.println("diger tum exceptionlar icin");
        }
        return sonuc;
    }
}
//unreachable cod ulasılamaz koddur; child asagı konulur parent yukarı konulursa olur. butun hataları parent exception yakalar child olana hata vermez.
//aralarında parent*child iliskisi yoksa sıralama bizre baglı
/*
    Note: 1) Aralarında "parent-child" relationship olan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             "child" olan önce kullanılmalıdır, aksi takdirde hata verir.
          2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.

 */
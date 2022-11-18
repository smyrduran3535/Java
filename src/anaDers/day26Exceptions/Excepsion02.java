package anaDers.day26Exceptions;

public class Excepsion02 {
    public static void main(String[] args) {
        char ch = getCharFromString("Java", 2);
        System.out.println(ch);
        char ch1 = getCharFromString("Selenium", 8);
        System.out.println(ch1);// StringIndexOutOfBoundsException: bir String'ten
        // karakter veya karakterler alınırken olmayan index kullanılırsa:
        // StringIndexOutOfBoundsException alınır
    }

    public static char getCharFromString(String str, int idx) {
        char c = ' ';
        try {
            c = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index ile ilgil bir problem olustu");

            System.out.println("index ile ilgil bir problem olustu"+e.getMessage());//index ile ilgil bir problem olustuString index out of range: 8
            //mesajı verir
            e.printStackTrace();//detaylı log(akısı takıp etmekte kullanılır) mesajı:aplicationın adım adım nekler yaptıgını gosterir
            //interview de sorarlar :hata olustugunda naparsınız derler: loglara bakarım de;
        }
        return c;//en sona yazılır
    }
}

package anaDers.day07terbaryStringManipulation;

public class StringManupulation {
    public static void main(String[] args) {
           /*                       String class metodlarını öğrencez

        1)equals():           i)İki tane String'in aynı olup olmadığını anlamamıza yarar.
                               ii)equals() method'u 'boolean' return eder.

         2)equalsIgnoreCase(): i) İki tane String'in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamamıza yarar.
                               ii) equalsIgnoreCase() method'u 'boolean' return eder.

         3)toLowerCase():      i)Bir String'deki tüm harfleri küçük harfe çevirmek için kullanılır.
                               ii) toLowerCase() method'u "String" return eder.

         4)toUpperCase():      i)Bir String'deki tüm harfleri büyük harfe çevirmek için kullanılır.
                               ii)toUpperCase() methodu "String" return eder.

         5)charAt():           i)Bir String'den belli bir index'deki characteeri almak için kullanılır.
                               ii) charAt() method'u "char" return eder.

         6)length():           i)Bir String'de kaç tane character kullanıldığını öğrenmek için kullanılır.
                               ii) length() method'u "int" return eder.

         7)contains():         i)Bir String'de belli bir characterin veya characterlerin var olup olmadığını anlamak için kullanılır.
                               ii) contains() method'u "boolean" return eder.

         8)split():            i)Bir String'i istediğimiz character'den parçalamaya yarar.
                               ii)split() method'u "Array" return eder.

        */
    /* bir paswordun gecerli olup olmadıgını asagıdki kurallara göre kontrol eden kodu yaz
    i)en az 8 karakter içermeli
    ii) space karakteri içermemeli
    iii)ilk harfi "M" VEYA "m" olmalı
    iv)son karakteri "?" olmalı
    */
        String pwd = "Manisa12?";
        //i)en az 8 karakter içermeli                     //bütün karsılastırmalar booelan dödürür. burda karsılastırma var
        boolean first = pwd.length() > 7;

        // ii) space karakteri içermemeli
        //pwd.contains("  "); içerir demek
        boolean second = !pwd.contains("  ");  // içermez

        //iii)ilk harfi "M" VEYA "m" olmalı
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'a';

        //iv)son karakteri "?" olmalı
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?'; // length-1 : son index demek

        System.out.println(first && second && third && fourth); // true yazdırır
    }
}

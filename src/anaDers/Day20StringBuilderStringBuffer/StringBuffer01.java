package anaDers.Day20StringBuilderStringBuffer;

 /*
        1)StringBuffer Java'da bir Class'dir ve String olusturmaya yarar.
        2)StringBuffer Class, StringBuilder Class gibi "mutable"dir.

        StringBuffer ile StringBuilder'in farki nedir?
        1)StringBuffer "theread-safe"dir.
        2)StringBuffer "synchronized"dir. => Size verilen isleri sıralama becerisidir.

        Senaryolar;
        1)Degistirilemez data icin "String Class" kullaniriz.
        2)Degistirilebilir ama "multi-thread" gerekmeyen durumlar icin "String Builder" kullaniriz.
        3)Degistirilebilir ve "multi-thread" gereken durumlar icin "StringBuffer" kullaniriz.
     */

public class StringBuffer01 {
    public static void main(String[] args) {

    }
}

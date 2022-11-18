package java_practice.day06nestedif;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        String finalNotu= input.next();
        String result=(finalNotu.equalsIgnoreCase("A"))     ?  "cOK bASARILI"  :
                (finalNotu.equalsIgnoreCase("B"))    ?  "BASARALI:":
                        (finalNotu.equalsIgnoreCase("C"))    ?   "Orta":
                                "diğerleri";
        System.out.println(result);
    }
}

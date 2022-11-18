package java_practice.day08_Loops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
EX :Kullanicidan bir kelime isteyiniz
 alinan kelimenin karakter dizisinin her harfi ve
 bu harfin karakter dizisi içindeki indexini birer satıra yazdirin

         ORNEK
  Bir kelime giriniz:istanbul

   Karakter        Index
     i              0
     s              1
     t              2
     a              3
     n              4
     b              5
     u              6
     l              7



 */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= input.nextLine();

        int intex=0;
        System.out.println("\tKarakter"+"\tIndex");

        for (int i = 0; i <kelime.length() ; i++) {
            System.out.println("");//alt satıra gecsin diye bos attık
            System.out.print("\t\t"+kelime.charAt(i)+"\t\t"+ intex);

            intex++;
        }
        System.out.println(kelime);
    }
}

package java_practice.day07StringManüpulation;

import java.util.Scanner;

public class C01_StringManüpulationConcat {
    public static void main(String[] args) {

        /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */
            System.out.println(15 + 20 + "Merhaba");//35merhaba
            System.out.println("Merhaba" + 15 + 20);//merhaba1520
            System.out.println("Merhaba" + (15 + 20));//merhaba35
            System.out.println("Merhaba" + 15 * 20);//işlem önceliği oldugu için : merhaba300

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.
            Scanner input=new Scanner(System.in);

            System.out.println("ad ve soyadı gir");

            String isim= input.nextLine() ,  soyIsim=input.nextLine();//MULTİPLE DECLARATION
            // String soyIsim= input.nextLine()

            String tamIsim=isim.concat(""+soyIsim).toUpperCase();
            System.out.println("tam isim" + tamIsim);
   }
    }


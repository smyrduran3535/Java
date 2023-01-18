package y_calismalarim.For;

import java.util.Scanner;

public class xGirileneKadarProgClsy {
    public static void main(String[] args) {
        /*
        kullanıcıdan x girilene kadar ekrana "Program calısıyor" yazan ve
        x girildiginde ise "Program Bitti" yazan programı yazınız
         */
        Scanner scan = new Scanner(System.in);
        String okunan = "";//dongu dısında tanımlama yapmalıyız "scop" u yoksa calısmaz,

        do {
            System.out.println("bir harf giriniz : ");
            okunan = scan.next();
            System.out.println("proram calısıyor");
        } while (!okunan.equalsIgnoreCase("x"));//bu sartı saglamadıgı surece calısacak,sagladıgında bitecek
        System.out.println("Program bitti");
    }
}

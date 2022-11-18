package java_practice.day04ifstatement;

import java.util.Scanner;

public class C01_ifstatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Y/N ikilisinden birini giriniz");
        String ikili=input.next();
        if(ikili.equalsIgnoreCase("Y")){
            System.out.println("YES");
        }else if(ikili.equalsIgnoreCase("N")){
            System.out.println("NO");
        }else System.out.println("doğru giriniz...");

        /*  2.YOLLLLLL CHAR İLE (HOCA YAPTI= DAHA İYİ)
         char karakter = input.next().charAt(0);

        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
        } else {
            System.out.println("Lutfen Y/N ikilisinden birini giriniz");
        }
         */



    }
}

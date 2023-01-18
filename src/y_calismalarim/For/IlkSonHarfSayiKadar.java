package y_calismalarim.For;

import java.util.Scanner;

public class IlkSonHarfSayiKadar {

         /*
    INTERVİEW :
    kullanıcıdan alına bir sitringin ilk ve son harfini yine kullanıcıdan alına alınan sayi kadar
    return eden metod yaz
    elma  2====> eaea
    army  3====> ayayay
     */
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen bir string giriniz");
            String input = scan.nextLine();
            System.out.println("lutfen bir sayi giriniz");
            int sayi = scan.nextInt();

            ilkSonHarf(input, sayi);
            System.out.println(ilkSonHarf(input, sayi));


        }

        private static String ilkSonHarf (String input,int sayi){
            String s = input.substring(0, 1) + input.substring(input.length() - 1);
            String sonuc = "";
            for (int j = 1; j <= sayi; j++) {//donguyu saglamak icin 1 den basladık
                sonuc += s;
            }
            return sonuc;
        }
    }


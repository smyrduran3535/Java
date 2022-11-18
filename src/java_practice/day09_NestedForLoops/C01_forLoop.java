package java_practice.day09_NestedForLoops;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {
/*
   Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();
        //kac tane deniliyorsa bil ki sayac kullancan
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {//dahil edersek -1 yazıcaz
            if (str.charAt(i) == 'a') {
                sayac++;
            }else if (str.charAt(i)=='c'){//ilk c oncesi bakr
                break;//count u durdur ve say demek
            }

        }
        System.out.println("'c' oncesi 'a' ların sayısı "+  sayac + " dır");
    }
}

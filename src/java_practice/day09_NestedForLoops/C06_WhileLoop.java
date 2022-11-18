package java_practice.day09_NestedForLoops;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan toplanmak uzere sayılar ısteyın
        sayı adedi 10 u gecerse yada toplamı 500 u gecerse
        bu kadar sayı yeter......adet sayı gırdınız toplamı....
         */
        Scanner scan = new Scanner(System.in);


        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        while (sayac < 11 && toplam < 500) {
            System.out.println("ltfen toplanmak uzere sayı gırınız");
            sayi = scan.nextInt();//her seferinde yazdırsın istedigimiz icin icine yazdık dısarda yazmadık
            toplam += sayi;
            sayac++;//kac tane sayı girdigimizi gosterir
        }
        //eger bir sart varsa if ac oraya kadar devam etsin
        if (toplam > 500) {
            System.out.println(sayac + " adet sayı girdiniz" + "toplamı" + toplam + " ");
        } else System.out.println("bu kadar sayı yeter" + sayac + " adet sayı girdiniz.toplamı" + toplam);


//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

//


        int a = 7;
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

package anaDers.day12Loop;

import java.util.Scanner;

public class nestedForLoop {

    public static void main(String[] args) {
        //asagıdakı sekli ekrana yazdıran codu yazınızı
        //         ****
        //         ****
        //         ****    bu soruda 2 tane hareket var. 1.si ilk satırı yazdır asagıya in 2.si ise * ı yazdır bi daha yazdır

        for (int i = 1; i < 3; i++) {

            for (int k = 1; k < 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını gir");
        int satir = input.nextInt();
        System.out.println("sutun sayısı gir");
        int sutun = input.nextInt();
        System.out.println("karakter seciniz");
        char ch = input.next().charAt(0);
        for (int i = 1; i < satir; i++) {
            for (int k = 1; k < sutun; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Example 2: asagıdakı sekli çizen kodu yaz
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        for (int i = 1; i < 6; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print(k + "");
            }
            System.out.println();
        }

        /*Example 3: asagıdakı sekli çizen kodu yaz
         * * * *
         * * *
         * *
         *

         */
        int row=4;

        for(int i=1; i<=row; i++){//kaç satır varsa o kadar yıldız var
            for(int k=row ;k>=i ;k--){
                System.out.print("* ");

            }
            System.out.println();
        }




    }
}

package y_calismalarim.Array;

import java.util.Scanner;

public class BolunebilenSayi {
    /*
    kullanıcıdan aldigimiz 8 elemanlı arrayin icinde kac tane 3 e bolunen sayı vardır
    negatif sayılar dahil olsun
     */
    public static void main(String[] args) {

        int[] arr = new int[8];
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". indexdeki sayiyi gir :");
            arr[i] = input.nextInt();

            if (arr[i] % 3 == 0) {
                count++;//8. indexe kadar yazdıracak
            }

        }
        System.out.println("3 e bolunebilen sayi " + count);
    }
}
package y_calismalarim.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFark {


        public static void main(String[] args) {

            // Kullanicinin girdigi ; Arrayin en buyuk elemani ile en kucuk elemani arasindaki bulan method create ediniz

            arrayOlustur();

        }

        private static void arrayOlustur() {
            Scanner scan = new Scanner(System.in);
            System.out.println("arrayin uzunlugunu giriniz");
            int uzunluk = scan.nextInt();

            int arr[] = new int[uzunluk];
            for (int i = 0; i < uzunluk; i++) {
                System.out.println("arrayin " + (i + 1) + ".elemanini giriniz ");
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int fark = arr[arr.length - 1] - arr[0];

            System.out.println(fark);

        }

    }






















package anaDers.day15ArraysMultidaymentionalArrays;

import java.util.Arrays;

public class MultidimentionArrays01 {
    public static void main(String[] args) {
        //nessted diye değil MultidaymentionalArrays diye adlandırılıyor.
       /*
        bir Array'in elemanları Array ise bu Arrayler """"" MultidaymentionalArraysdir"""""  */


        //Multidaymentional Arrays NASIL OLUSTURULUR
        int arr[][] = new int[3][2]; // [3] array sayısı [2] array içindeki array sayısı
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]


        //Multidaymentional Arrays eleman nasıl eklenir?
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;


        //Multidaymentional Arrays konsola nasıl yazdırılır
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]] yazdırmak için: "deepToString" kullan

        //Multidaymentional Arrayslerde Array elemanlardan biri nasıl yazdırılır?
        System.out.println(Arrays.toString(arr[1]));//[6, 18]
        System.out.println(Arrays.toString(arr[0]));//[3, -4]

        //Multidaymentional Arrayslerde iç Array elemanlardan biri nasıl yazdırılır?
        System.out.println(arr[1][0]);//6


        /*
        example 1:
        STRİNG BİR M.D ARRAY OLUSTURULURUNUZ.
        ELEMAN EKLEYİNİZ
        TOPLAM ELEMAN SAYISI EKRANA YAZDIRAN CODU YAZ

         */
        String brr[][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";
        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]

        int sum = 0;//toplam eleman sayısını istiyor
        for (String[] w : brr) {//data tipimiz String array ****önemli****
            sum = sum + w.length;

        }
        System.out.println(sum);//12
    }
}

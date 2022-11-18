package ssg.Mr.CihanArrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        ////Bir eleman dizide olup olmadığı nasıl kontrol edilir
        int arr[] = {32, 14, 2, 11,8};

        for (int w:arr){
            if (w==15){
                System.out.println(w+  " var");
                break;
            }else{
                System.out.println("Yok");
            }
        }

        //
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 8, 11, 14, 32]
        System.out.println(Arrays.binarySearch(arr,35));//-6



    }
}

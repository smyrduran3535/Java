package ssg.Mr.CihanArrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {


        String arr[]={"a","M","b","T"};

        System.out.println(Arrays.toString(arr));//[S, M, A, T]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[A, M, S, T]

        // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

        int arr2[]= {3,5,6,1,9,45,25,4,9,0};

        Arrays.sort(arr2);

        System.out.println("kucuk "+ arr2[0]);
        System.out.println("buyuk "+ arr2[arr2.length-1]);












    }
}

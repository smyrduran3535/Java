package y_calismalarim.Array;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {
        int[] arr={3,8,1,5,2,9};
        sonuc(arr);
    }
    public static void sonuc(int[] arr){
        Arrays.sort(arr);
        System.out.println("en buyuk element :"+arr[arr.length-1]);
        System.out.println("en kucuk element :"+arr[0]);



    }
}

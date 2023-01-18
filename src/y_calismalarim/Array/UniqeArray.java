package y_calismalarim.Array;

import java.util.Arrays;

public class UniqeArray {
    public static void main(String[] args) {


    /*
    verilen array deki tekrar eden sayilari ,ilki haric silip tekrasiz sayilardan olusan bir array yazınız
    input: {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
    output: [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10];
     */
        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            count++;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (i == 0 && arr[i + 1] == arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }
            if (i != 0 && arr[i - 1] != arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }
        }
        int[] brr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        int count1 = 0;
        Arrays.sort(brr);
        int repeatedNumber = 0;
        for (int w:brr){
            count1++;
            int a=0;
            for (int i = 0; i <brr.length ; i++) {

            }
        }
    }
}
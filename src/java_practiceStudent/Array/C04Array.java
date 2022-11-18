package java_practiceStudent.Array;

import java.util.Arrays;

public class C04Array {
     /*
                   Bir tamsayı dizisini tersine çevirebilen ve onu yeni dizi olarak döndüren bir program yazın
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

     */

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            reversedArray[array.length-1-i] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));



    }




}

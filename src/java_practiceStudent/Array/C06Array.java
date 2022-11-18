package java_practiceStudent.Array;

import java.util.ArrayList;
import java.util.List;

public class C06Array {
     /*
            İki tamsayı dizisinden ortak elemanları yazdırabilen bir program yazın
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

     */

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        List<Integer> output = new ArrayList<>();

        for (int i : arr1) {
            for (int k : arr2) {
                if(i==k){
                    output.add(i);
                }
            }
        }
        System.out.println("Output: " + output);



    }

}

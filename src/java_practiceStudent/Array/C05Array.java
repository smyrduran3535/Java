package java_practiceStudent.Array;

import java.util.ArrayList;
import java.util.List;

public class C05Array {
     /*
              Tüm sıfırları dizinin sonuna taşıyabilen bir program yazın
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
     */

    public static void main(String[] args) {


        int [] array =  {10, 0, 5, 0, 1, 0};

        List<Integer> listForNonZeros = new ArrayList<>();
        List<Integer> listForZeros = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                listForNonZeros.add(array[i]);
            } else {
                listForZeros.add(array[i]);
            }
        }

        listForNonZeros.addAll(listForZeros);
        System.out.println(listForNonZeros);




    }
}

package anaDers.day15ArraysMultidaymentionalArrays;

import java.util.Arrays;

public class MultidimentionArrays02 {
    public static void main(String[] args) {
         /*
        MultidaymentionalArrays kısa yoldan nasıl oluşturulur?

         */
        char arr[][]={{'a','b'},{'c','d','e'},{'?'}};
        System.out.println(Arrays.deepToString(arr));//[[a, b], [c, d, e], [?]]



        /*
        bir String Multidaymentional Array de içinde 'a' olan elemanları konsala yazdırın
         */
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for(String[] w : brr){//nested loop

            for(String k: w){//k:{"learn", "java", "it"}

                if(k.contains("a")){
                    System.out.print(k+ " ");//learn java easy
                }
            }
        }



    }
}

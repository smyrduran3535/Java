package anaDers.day15ArraysMultidaymentionalArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
            /*
        ex :1:
        size verilen pozitif ve negatif sayılar içeren bir
        integer array deki "en büyük negatif" ve "en küçük pozitif" elamanı bulunuz
         */
        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);//önce sort yapcaz.[-12,-5,-2,2,18,23]
        // sort yapmazsak ilk sayının negative oldugunu anlayamayız ve son sayının pozitif oldugunu anlayamayız.




        int maxNegative=arr[0];//negatifler soldadır
        int minPozitive=arr[arr.length-1];//sagdakiler hep pozitivedir.
        for (int w:arr) {//array var ilk for each loop kullcaz
            if(w<0){
                maxNegative=Math.max(maxNegative,w);//-2
            }
            if  (w>0){
                minPozitive=Math.min(minPozitive,w);
            }
        }
        System.out.println("en büyük negatif :"+maxNegative + " and "+
                "en büyük pozitif :" +  minPozitive);//-2 and 18: soutu dısına yazarız ki sayılara karar verelim.
        // o yüzden loopun dısına yazarız
    }
}




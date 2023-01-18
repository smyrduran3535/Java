package y_calismalarim.Array;

import java.util.ArrayList;
import java.util.List;

public class NsayisiKadarMaxDgr {
    public static void main(String[] args) {
        /*
verilen arrayin n sayisi kadar max. degerlerini bulan java programi yaziniz
not: kisa methodlar kullanmayiniz
input:{1,2,3,4,5,6,7,8} input n=2
output: 7 and 8
        */
       int[] arr={1,2,3,4,5,6,7,8,45,25,-5};
       int n=4;
        List<Integer> list=new ArrayList<>();
        for (int w:arr){
            list.add(w);
        }
        List<Integer> maxlist=new ArrayList<>();
        int count=1;
        while (count<=n){

            int max=list.get(0);
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max){
                    max=list.get(i);
                }

            }
            maxlist.add(max);
           list.remove(list.indexOf(max));
           count++;
        }
        System.out.println("arrayin "+n+"  elemani "+ maxlist);
    }
}

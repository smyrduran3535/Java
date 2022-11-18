package anaDers.Day18arrayListPassByValue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Bir Integer  ArrayList deki 7 haric tum elemanlari 2 artiriniz...
        //elimizde array veya list varsa en iyi loop foe each loop
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(28);
        ages.add(9);
        System.out.println(ages);
        for (Integer w : ages) {
            if(w==7){//gorursen arttırma
                continue;
            }
            // w = w + 2;  Listler boyle update edilemezler..
            //listi degıstırmek ıcın boyle arttıramayız o yuzden set indexOf  kullanılırız
            ages.set(ages.indexOf(w), w+2);
        }
        System.out.println(ages);
        //Example 2: Size verilen ArrayListte 8(inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz...
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        System.out.println(nums);
        for (Integer w : nums) {
            nums.set(nums.indexOf(w), w*2);
            if(w==8){
                break;//8 gorunce bırak loopu kır
            }
        }
        System.out.println(nums);
    }
}
//loopu kıran sayıyı update etmek gerekirse; kontrolun ustunde koy: 8i 2 katına cıkarıp kırar 9 oldugu gibi kalır
//loopu kıran sayıyı update etmek gerekmezse; kontrolun altına koy: 8 degismez aynı kalır
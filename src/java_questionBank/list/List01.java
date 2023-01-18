package java_questionBank.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(6);
        myList.add(9);
        myList.add(7);
        myList.add(23);
        myList.add(56);
        myList.add(5);
        myList.add(1);
        int sum = 0;
        for (Integer w : myList) {
            sum += w;
        }
        System.out.println(sum);


    /*
    2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
     */
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(12);
        myList1.add(31);
        myList1.add(7);
        myList1.add(13);
        myList1.add(10);
        int sum1 = 0;
        for (Integer w : myList1) {
            if (w.equals(13)) {
                break;
            }
            sum1 += w;
        }
        System.out.println(sum1);

        //3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(31);
        list.add(7);
        list.add(13);
        list.add(10);
        int carp = 1;
        for (Integer w : list) {
            if (w % 2 == 0) {
                carp *= w;

            }
        }
        System.out.print(carp);

    /*
    4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
    Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
    (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
     */
        List<String> sirala = new ArrayList<>();
        sirala.add("Sarı");
        sirala.add("Mavi");
        sirala.add("Kırmızı");
        sirala.add("Yeşil");
        List<String> sirala2 = new ArrayList<>();
        sirala2.addAll(sirala);
        Collections.sort(sirala2);
        System.out.println(sirala);
        System.out.println(sirala2);
        int count = 0;
        for (int i = 0; i < sirala.size(); i++) {
            if (sirala2.get(i).equals(sirala.get(sirala.size() - 1 - i))) {
                count++;
            }

        }
        if (count == sirala.size()) {
            System.out.println("azalan siirada");
        } else {
            System.out.println("azalan sirada degil");
        }

    /*
    5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
    Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
     */
        List<Integer> mylst = new ArrayList<>();
        mylst.add(12);
        mylst.add(11);
        mylst.add(15);
        mylst.add(34);
        mylst.add(43);
        if (mylst.contains(15)) {
            for (int w : mylst) {
                if (w == 15) {
                    int dgsm = mylst.indexOf(15);
                    mylst.set(dgsm, 51);
                }
            }
            System.out.println(mylst);
        } else {
            System.out.println("15 icermiyor");
        }
        /*
        6) Listede 15 veya 13 varsa, bu elemanları kaldırınız.
           Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
         */
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(31);
        l.add(15);
        l.add(13);
        l.add(54);
        if (l.contains(15) && (l.contains(13))) {
            for (int i = 0; i < l.size(); i++) {


                if (l.get(i) == 15) {
                    int onbes = l.indexOf(15);
                    l.remove(onbes);
                    i--;
                }

                if (l.get(i) == 13) {
                    int onuc = l.indexOf(13);
                    l.remove(onuc);
                    i--;
                }
            }
            System.out.println(l);
        } else {
            if (!l.contains(15) && (!l.contains(13))) {
                System.out.println("liste 13 ve 15 icermiyor");
            }
        }


    /*
    7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
       Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
     */
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(31);
        ls.add(15);
        ls.add(13);
        ls.add(54);
        Collections.sort(ls);
        int minFark = ls.get(2) - ls.get(1);
        for (int i = 1; i < ls.size(); i++) {
            minFark = Math.min(minFark, ls.get(i) - ls.get(i - 1));
            //System.out.println(ls.get(i) + " ve " + ls.get(i - 1)); yakın olan ikilileri yazdirir hepsinde: 13 ve 10;  15 ve 13;  31 ve 15;...gibi
        }
        // System.out.println(minFark);//ikisi arasındaki farkı verir:birb yakın olan;min olan iki deger arasındakı farkı verir :2

        for (int i = 1; i < ls.size(); i++) {
            if (ls.get(i) - ls.get(i - 1) == minFark) {
                System.out.println(ls.get(i) + " ve " + ls.get(i - 1));
            }
        }

    /*
    8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
       Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
     */
        List<Integer> lst = new ArrayList<>();
        lst.add(12);
        lst.add(31);
        lst.add(7);
        lst.add(13);
        lst.add(10);
        for (int w : lst) {
            if (w == 7 || w == 10) {
                continue;
            }
            lst.set(lst.indexOf(w), w + 2);
        }
        System.out.println(lst);

    /*
    9) String bir listede verilen tüm fiyatların toplamını bulunuz.
       Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
     */
        List<String> myListm = new ArrayList<>();
        myListm.add("$12.99");
        myListm.add("$23.60");
        myListm.add("$54.45");
        double top = 0;
        for (String w : myListm) {
            Double dlr = Double.valueOf(w.replace("$", ""));
            top += dlr;
        }
        System.out.println(top);

    /*
    10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
     */
        List<String> my = new ArrayList<>();
        my.add("$12.99");
        my.add("$23.60");
        my.add("$54.45");
        double toplam = 0;
        List<Double> myd = new ArrayList<>();
        for (String w : my) {
            Double d = Double.valueOf(w.replace("$", ""));
            myd.add(d);
        }
        Collections.sort(myd);
        toplam = myd.get(0) + myd.get(myd.size() - 1);
        System.out.println(toplam);

        /*
    11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        olup olmadığını kontrol ediniz.
         */
        List<Integer> myListYeni = new ArrayList<>();
        myListYeni.add(10);
        myListYeni.add(31);
        myListYeni.add(15);
        myListYeni.add(7);
        myListYeni.add(15);
        myListYeni.add(23);
        int counter = 0;
        for (int w : myListYeni) {
            for (int k : myListYeni) {
                if (w == k) {
                    counter++;
                }
            }
        }
        if (counter == myListYeni.size()) {
            System.out.println("tekrarlanan oge yok");
        } else {
            System.out.println("en az bir oge tekrarlanmıstır");
        }

            /*
            12) Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod yazınız.

                Not:
                Mountain Array ==> [0, 2, 5, 3, 1]
                Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
                Mountain Array Değil ==> [5, 2, 7, 1, 4]
                Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa M
             */
        int arr[] = {0, 2, 5, 3, 1};
        int arr2[] = {5, 2, 7, 1, 4};
       mountainArray(arr);
        mountainArray(arr2);
    }
public static void mountainArray(int[] arr){
    int max = arr[0];
    int index = 0;
    boolean result = true;

    for (int i = 1; i < arr.length; i++) {//0 bizim max. eleman old icin 1den basladı
        if (arr[i] > max) {//max. degerin hangisi oldugunu buluyoruz ve 0. index o olsun diyoruz
            max = arr[i];
            index = i;
        }
    }
    for (int i = 0; i < index; i++) {//artan olup olmadıgına bakıcaz; max. indexdeki elemanların artarak gelip gelmedi kont
        if (arr[i] < arr[i + 1]) {
       continue;
        } else {
            result = false;//sart saglanmıyorsa
            break;
        }
    }
    if (result) {//true ise islemi yap; indexten sonraki elemanlar azalıyor mu
        for (int i = index; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
               continue;
            } else {
                result = false;
                break;
            }
        }
    }
    if (result) {
        System.out.println(Arrays.toString(arr) + " Mountain Arraydir");
    } else {
        System.out.println(Arrays.toString(arr) + " Mountain Array degildir");
    }
         /*
         kitaptaki cozum:
         int a[] = { 0, 2, 5, 3, 1 };
     List<Integer> list = new ArrayList<>();
     Arrays.stream(a).forEach(t -> list.add(t));
     int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
     int idxOfMax = list.indexOf(max);
     List<Integer> part1 = new ArrayList<>();
     list.stream().filter(t -> list.indexOf(t) <= idxOfMax).forEach(t -> part1.add(t));
     List<Integer> sortedPart1 = new ArrayList<>();
     part1.stream().forEach(t -> sortedPart1.add(t));
     Collections.sort(sortedPart1);
     List<Integer> part2 = new ArrayList<>();
     list.stream().filter(t -> list.indexOf(t) >= idxOfMax).forEach(t -> part2.add(t));
     List<Integer> reverseSortedPart2 = new ArrayList<>();
     part2.stream().forEach(t -> reverseSortedPart2.add(t));
     Collections.sort(reverseSortedPart2);
     Collections.reverse(reverseSortedPart2);
     if (part1.equals(sortedPart1) && part2.equals(reverseSortedPart2)) {
     System.out.println(list + " Mountain Arraydir");
     } else {
     System.out.println(list + " Mountain Array degildir");
     }
     */
}

}








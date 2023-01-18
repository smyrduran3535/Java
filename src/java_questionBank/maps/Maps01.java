package java_questionBank.maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
        /*
        1) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
          bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        int toplam = 0;
        String s = "";
        Collection<Integer> numofProduc = product.values();
        for (Integer w : numofProduc) {
            toplam += w;
        }
        System.out.println(toplam);

        Collection<String> wordoffProduct = product.keySet();
        for (String w : wordoffProduct) {
            s += w + " ";
        }
        System.out.println(s);

        /*
        2) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
           bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
           yazınız.
         */
        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 12);
        products.put("TV", 53);
        products.put("Refrigerator", 12);
        products.put("Music System", 87);

        String aProducts = "Laptop";
        if (products.containsKey(aProducts)) {
            System.out.println(aProducts + " kelimesi vardır");
        } else {
            System.out.println("kelimesi yoktur = " + aProducts);
        }

    /*
    3) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
       bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
     */
        Map<String, Integer> urun = new HashMap<>();

        urun.put("Laptop", 82);
        urun.put("TV", 53);
        urun.put("Refrigerator", 12);
        urun.put("Music System", 87);
        urun.put("Mobile Phone", 53);
        Object[] yeniUrun = urun.values().toArray();
        Arrays.sort(yeniUrun);
        System.out.println(Arrays.toString(yeniUrun));

    /*
    4) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
       bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
     */
        Map<String, Integer> product01 = new HashMap<>();
        product01.put("Laptop", 82);
        product01.put("TV", 53);
        product01.put("Refrigerator", 12);
        product01.put("Music System", 87);
        product01.put("Mobile Phone", 53);

        Object[] alfabetik = product01.keySet().toArray();
        Arrays.sort(alfabetik);
        System.out.println(Arrays.toString(alfabetik));//aynı sıralamayı yapıyor

        Set<String> st = product01.keySet();
        List<String> siralama = new ArrayList(st);
        Collections.sort(siralama);
        System.out.println(siralama);//sıralama yapıyor

        /*
        5) Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
           (Büyük/küçük harfe duyarlı değil)
       */
         String str = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        str = str.replaceAll("\\p{Punct}", "").toLowerCase();
        Map<String, Integer> m = new HashMap<>();

        String[] astr = str.split(" ");
        for (String w : astr) {
            Integer numO = m.get(w);
         if (numO == null) {
             m.put(w,1);
         }else {
            m.put(w,numO+1);
         }
        }
        System.out.println(m);


    /*
    6) Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
     */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer,Integer> map=new HashMap<>();
       for (Integer w:myList) {
           Integer grnm = map.get(w);
           if (grnm == null) {
               map.put(w, 1);
           } else {
               map.put(w, grnm + 1);
           }
       }
          Collection<Integer> myValue=map.values();
int counter=0;
for (int w:myValue){
    if (w>1){
        counter++;
    }

}
        System.out.println("tekrarlanan oge sayısı "+counter+ "adettir");


    }
}







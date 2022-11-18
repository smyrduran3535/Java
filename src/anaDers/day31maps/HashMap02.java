package anaDers.day31maps;

import java.util.HashMap;

public class HashMap02 {
     /*
            1)Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi olusturur ve
              bu yapidaki herbir kutuya index verir. Index'ler 0 dan 15 e kadaradir.
            2)Siz "salaries.put("QA", 110000.00);" kodunu yazdiginizda Java, key icin bir HashCode olusturur bu HashCode'u 15 e boler ve kalani index olarak kullanir.
              Ve bu elemani o index'e yerlestirir.
            3)Yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u, ikinci bolumune "Key" i, ucuncu bolumune "Value" u ve dorduncu bolumune
              "pointer" i koyar. Bu cok bolumlu yapi LinkedList'lerdeki "Node" dur. Yani HashMap bucket'lari koydugu data'yi LinkedList olarak depolar.
            4)Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda
              eleman ilk bucket'a yerlestirilir. Bundan dolayi key'si null olan elemanlar Map in icinde
              genellikle ilk sirada gozukurler.
            5)Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin
              ayni HashCode uretilebilir. Buna "Hash Collision" denir. Hash Collision meshur bir
              Java Development peoblemidir. Bu problemle karsilasildiginda developer'lar bu problemi cozmek icin kodlar yazarlar, ama bu
              Core Java nin konusu degildir.
     */


    public static void main(String[] args) {
        HashMap<String,Double> salaries=new HashMap<>();//bu kodu yazınca java 16 tane kutu indexliyor 0 dan baslayarak 15 e kadar
        salaries.put("QA",110000.00);//key daki degerlere bakarak hash olusturuyo. bu hash i15 e boluyor sonra cıkan sonucu ındex oalrak alıp o ındexe bakıyor
        /*
        QA=33 DİYELİM
        33/15=2;kalan 3=index :eleman bu index konulur pointer bi sonraki elemanı gosterecek ve boooylelikle bır buckeda birden cok yerlestirme yapılır
        |33|QA|110K|.|
        hashmap demekki listlerin icine birden fazla bucked koyabiliyor
        key null oldugunda hash kodu hep 0 verir o yuzden ilk eleman null olur
         */
        salaries.put("Dev",130000.00);
        salaries.put("Salecforce",125000.00);




    }
}

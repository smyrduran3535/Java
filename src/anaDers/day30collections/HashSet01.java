package anaDers.day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        //Hash bir tekniktr. birbirine benzemeyen code lar uretmeye yarar.Bu code lar datayı unique saglar
        // Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
        //hashSetler eklenen elemanlaarın sıralaması ile ugrasmaz.java hashset in hızlı olması icin sıralama ile ugrasma deer. o yuzden cok hızlı calısır
        //HASHSET NE ZAMAN KULLANILIR: hız cok onemli ise tekrarsız elemanlarda kullanılır,sıralama onmli onemli degilse.
        //hashsetler index kullanmazlar.Cunku; sıralamayı random yaptıkları icin.index manalı olmaz,fakat biz kod yazarken index kullanıyormusuz gibi yazarız

        HashSet<String> emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]:random order yaptı kafasına gore sıraaldı.
        //tekralı data koyalım
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange] var olan elemanı eklerseniz hata vermez :
        // son ekleneni var olan datanın ustune yazar; "ovewrite" diyoruz: ustune yazar cunku:SORARLAR
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange] : nulları ust uste yazdırdı:overwrite
/*
 Set --> HashSet :
 * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.
 * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
 * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
 * Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
 * 3) HashSet "null" object'ini eleman olarak kullanabilir.
 * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.
 */




























    }
}

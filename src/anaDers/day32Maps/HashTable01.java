package anaDers.day32Maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1-HashTable bir mapdir
    2- HashTable enrySet leri herhangi bir siralamaya tabi tutmaz
    3-HashTable, HashMaplerden daha yavastir.cunku HashTable lar thread-safe ve synchoronize dir
     */
    /*
    toString() metodu objeleri konsolda detayları ile gorebilmek icin classların icinde kullanılır
    toString() metodu olusturmadan objecti yazdırırsanız java onun adresini verir
     */
    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations= new Hashtable();
        countryPopulations.put("USA",40000000);
        countryPopulations.put("Germany",8300000);
        countryPopulations.put("Turkey",9000000);
        System.out.println(countryPopulations);
       // countryPopulations.put(null,90000000);//hashtablerda key null olamaz
        //countryPopulations.put("France",null);//hasahtablerda value null olamaz nullpoiınter exc. atar

      //hashmap ile hashtable farkı nedir ? interw.sorusu

      Hashtable<String,Students> myStudents=new Hashtable<>();
      myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);  //valueyu toString metodu yazdırır.tostripgi kaldırırsak hashmapi bize verir okunur olmaz .
//toString varsa istedigin gibi gorursun. kaldırınsan; staek memory deki adresi gorursun
//sadece ismi gormek istiyorsak;
       Students name= myStudents.get("name");
        System.out.println(name);//null : cunku get metcd key ile calısır. burda key map sadece. o zaman Math i kullaırsak tamamını verir
        String name1= myStudents.get("Math").name;
        System.out.println(name1);//Tom Hanks

Integer age =myStudents.get("Math").age;//hashtable yerlestirilen dataları teker teker alabilirsiniz
        System.out.println(age);






    }
}

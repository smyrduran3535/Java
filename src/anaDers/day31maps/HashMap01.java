package anaDers.day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1)Map'ler key-value structure kullanir
2)Key'ler unique'dir
3)Value'lar tekrarli data icerebilir
4)Map'lerde eleman degil EntrySet kullaniriz.
5)Key'ler null kabul etmez
6)Value'lar null kabul eder.
7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
 */
public class HashMap01 {
     /*
    mapler; key-value structure'ini kullanirlar. mapler'de key kismi tekrarsiz (unique) data barindirir.
    value kismi ise; unique olmak zorunda degildir (non-unique). key kisminda "null" kullanilamaz. ancak value'larda
    "null" mumkundur.
    value kısmında null bircok kere kullanılabilir

    Cat           =            Kedi  ======> EntrySet :
    key                        value
    uniqe                      non.unique
    null tekrarsız           null bircok kez kullanılabilir
    olarak kullanılır
     */
    //metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
    //Maplar key value srtuctor ini kullanirlar.
    //Map lerde key kismi tekrarsiz data icerir(unique)
    // value kismi unique olmak zorunda degildir.
    //key lerde null kullanilamaz ama value lerde bu mumkundur.
    //value kisminda null kullanmak munknudur.
    //Null bir cok kere kullanilabilir.
    //coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
    //  bu iki deger depolamaya entry demisler
    //mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz
    ////Hashmap ler entry set leri siralamakla ugrasmazlar,nicin cunku ,
    // siralama zaman ister.bu yuzden hashmap ler superfasttir.
     public static void main(String[] args) {
         //prımitive kullanılmaz hata verir
         HashMap<String,Integer> studentAge=new HashMap<>();
         //entrysetler farklı yapıdır o yuzden add ile eklemeyız; put kullanılırız
         studentAge.put("Ali",13);
         studentAge.put("Tom",21);
         studentAge.put("Brad",12);
         studentAge.put("Ajda",83);
         studentAge.put("Cuneyt",76);
         studentAge.put("Ali",88);//aynı key degerini tekrar kullandıgınızda override yapar
         System.out.println(studentAge);//{Tom=21, Ajda=83, Brad=12, Ali=13}
         System.out.println(studentAge);//{Tom=21, Ajda=83, Brad=12, Cuneyt=75, Ali=13} :rastgele sıralama yapar
         System.out.println(studentAge);//{Tom=21, Ajda=83, Brad=12, Cuneyt=75, Ali=88}
         studentAge.put(null,55);//{null=55, Tom=21, Ajda=83, Brad=12, Cuneyt=75, Ali=88}
         studentAge.put(null,66);//{null=66, Tom=21, Ajda=83, Brad=12, Cuneyt=75, Ali=88}
         studentAge.put("Ayhan Isik",null);//{null=66, Tom=21, Ayhan Isık=null, Ajda=83, Brad=12, Cuneyt=75, Ali=88}
         studentAge.put("Sadri Alısık",null);//{null=66, Tom=21, Ayhan Isık=null, Ajda=83, Brad=12, Cuneyt=75, Sadri Alısık=null, Ali=88}
         System.out.println(studentAge);

         //bazen sadece keylerle calısmak isteriz: o zaman sadece keyleri almalıyız map'den
         studentAge.keySet();//key ler unıqe oldugu icin unıqe lerde setin icinde oldugu icin setlerin icinden verilir
       Set<String> keys=studentAge.keySet();
         System.out.println(keys);//[null, Tom, Ayhan Isık, Ajda, Brad, Cuneyt, Sadri Alısık, Ali]

         //Map'den sadece value ları almak istiyorsak;
         Collection<Integer> values=studentAge.values();
         System.out.println(values);//[66, 21, null, 83, 12, 75, null, 88] en son guncellenmıs degerlerini verir

         //belli bir key e ait value nasıl alınır
         int cuneytAge=studentAge.get("Cuneyt");//verilen key e ait degeri verir get metodu; int oldugu icin int olusturulr
         System.out.println(cuneytAge);//75

         //example 1:tum integer yasların ortalamasını hesaplayan kodu yazınız
         Collection<Integer> ages=studentAge.values();
         int sum=0;
        double counter=0;
         for (Integer w:ages){
             if (w!=null){
              sum+=w;
              counter++;
             }
         }
         System.out.println("Ortalama yas :"+(sum/counter));//57.666666666666664

         //example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yazınız
         Set<String> key=studentAge.keySet();
         int sum1=0;
        for (String w: key){
            if (w!=null){
                if (w!=null && !w.startsWith("A")){
                    sum1+=w.length();
                }
            }
            System.out.println(sum1);
        }


        boolean sonuc=studentAge.remove("Ajda",76);//key ve value kullanııyor....remove(object ) sadece key kısmını yazıp sil diyorsun fakat inr return eder
         System.out.println(sonuc);//false dedi 83 oldugu icin ajda
         boolean sonuc1=studentAge.remove("Ajda",83);
         System.out.println(sonuc1);//true;EntrySet i siler ve size boolean return eder
         System.out.println(studentAge);//{null=66, Tom=21, Ayhan Isık=null, Brad=12, Cuneyt=76, Sadri Alısık=null, Ali=88}
         int result1=studentAge.remove(null);
         System.out.println(result1);//66 : ben key i null olanı sildim onunda value su bu der bize int verir
         System.out.println(studentAge);//{Tom=21, Ayhan Isık=null, Brad=12, Cuneyt=76, Sadri Alısık=null, Ali=88}

         //key varsa value'u ver , key yoksa bana bir mesaj ver
         int result2=studentAge.getOrDefault("Brad",0);//brad varsa bradin degerini verecek yoksa 0 verecek. int return eder
         System.out.println(result2);//12 bradin degeri
         int result3=studentAge.getOrDefault("Bradon",0);
         System.out.println(result3);//0 : yok cunku key;o yuzden bizim belirttigimiz degeri (0) verir

         //key yoksa key e ekle varsa map'e herhangi bir ekleme diyelim;
         //ekleme put ile yapılır. ekleegeryoksa:putIfAbsent()
        Integer result4=studentAge.putIfAbsent("Ayhan Isik",100);
         System.out.println(result4);//null verdi degeri nulldı

         //value null ise ekleme yapar value null degilse ekleme yapmaz
        studentAge.putIfAbsent("Ayhane Isik",100);
         System.out.println(studentAge);//{Tom=21, Ayhan Isık=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Ali=88, Ayhane Isık=100}

         Integer result5=studentAge.putIfAbsent("Brad",100);
         System.out.println(result5);//12
         System.out.println(studentAge);//{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Ali=88}

//key yoksa ekelme yapar
         Integer result6=studentAge.putIfAbsent("Acun Ilicali",200);
         System.out.println(result6);//ekelemeden once degeri yoktu null verir
         System.out.println(studentAge);//{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Acun Ilıcalı=200, Brad=12, Cuneyt=76, Sadri Alısık=null, Ali=88}

         //replace metodu value ları degistirmek icin kullanılır
         studentAge.replace("Acun Ilicali",49);
         System.out.println(studentAge);//{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Acun Ilicali=49, Ali=88}

         studentAge.replace("Acun Ilicali",49,53);//eski deger degisiyor ama yası 49 ise degisiyor
         System.out.println(studentAge);//{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Acun Ilicali=53, Ali=88}
         studentAge.replace("Acun Ilicali",47,53);//key ve value yu kontrol eder once sonra degistirir.
         System.out.println(studentAge);//{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Acun Ilicali=53, Ali=88}

//example 3:
         //map'teki herbir Entry i ekrana farklı bir satirda olacak sekilde yazdırın
         //{Ayhan Isik=100, Tom=21, Ayhane Isik=100, Brad=12, Cuneyt=76, Sadri Alısık=null, Acun Ilicali=53, Ali=88}
         //maplerde EntrySet metodu herbir eleman demek..bu metod setin ıcıne koyacak;unique olacak
         //EntrySet metodu map tekielemanları bir setin icine koyarak size verir booylece loopları kullanırız. yoksa kullanamayız.
         Set<Map.Entry<String,Integer>> entries=studentAge.entrySet();
         for (Map.Entry<String,Integer> w: entries){
             System.out.println(w);

         }


















     }

}

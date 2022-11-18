package anaDers.day32Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    //tree yi duyunca natural order aklına gelsin. sıralama yapar
    //natural mapte sıralamak cok uzun is. o yuzden tremapler yavastır
    //treemapler tread-safe ve syncronized degiildir
    public static void main(String[] args) {
        TreeMap<String,Double> salaries=new TreeMap<>();
        salaries.put("Tom Hanks",3000.00);
        salaries.put("Mary Star",1000.00);
        salaries.put("Jimmy Jones",5000.00);
        salaries.put("Kevin Bridgeman",6000.00);

        System.out.println(salaries);//{Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}:alfabetik sıralama

        SortedMap<String,Double> map1=salaries.tailMap("Kevin Bridgeman=6000.0");
        System.out.println(map1);//yazılan key in baslar alfabetik olarak sonuna kadar tum entryleri verır. tail kuyruk demek zaten.Jımmey vermez cunku kevinden basl

        NavigableMap<String,Double> map2=salaries.tailMap("Kevin Bridgeman=6000.0",false);
        System.out.println(map2);//true ise yazdır false dersen haric turar. {Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String,Double> map3=salaries.subMap("Kevin Bridgeman=6000.0",true,"Tom Hanks",false);
        System.out.println(map3);//kevin mary

        Map.Entry<String,Double>map4=salaries.lowerEntry("Mary Star");
        System.out.println(map4);//bir oncekini verirKevin Bridgeman=6000.0

        //lowerentry paris hıltondan bir oncekini verir paris hilton olmasa da varmis gibi davranır
        Map.Entry<String,Double>map5=salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//paristen onceki de mary . sanki varmıs gibi dusunup yıne key i verir.Mary Star=1000.0

        Map.Entry<String,Double>map6=salaries.ceilingEntry("Mary Star");
        System.out.println(map6);//ceiling catı demek: Mary Star=1000.0

        Map.Entry<String,Double>map7=salaries.higherEntry("Mary Star");//bir sonrakini verir
        System.out.println(map7);//Tom Hanks=3000.0

        Map.Entry<String,Double>map8=salaries.ceilingEntry("Paris Hiton");
        System.out.println(map8);//Tom Hanks=3000.0:var olan key ile kullanılırsa o keyi verir var olmayan ile kullanılırsa bir sonrakini verir

        Map.Entry<String,Double>map9=salaries.floorEntry("Mary Star");
        System.out.println(map9);//var olunca veriyor Mary Star=1000.0
//ceiling ile floor zıttıdır





















































    }
}

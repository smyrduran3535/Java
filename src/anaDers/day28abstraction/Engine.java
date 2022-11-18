package anaDers.day28abstraction;
/*
1-) Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

"multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
bu yapida "multiple inheritance" a musaade etti.
bunun icin javada :interface olunca multi-inheritance mumkun oluyor
interface olusturmak icin;new class da interface i tıklıyoruz

2-) interface deki tum method'lar "absract" oldugu icin "interface'lere "fully abstraction" denir.
"Abstract Class" larda abstract method ve "concrete method" bir arada kullanildigi icin
"Abstract Class"  lara "fully absraction" denmez.
3-)java interface in icinde concreat method olusturmus,uretmis
*/
/*ABSTRACT vs INTERFACE
        1) Abstract :
        1.1 - Class`dir.
        1.2 - Abstract ve concrete method`lar konabilir.
        1.3 - Kismi olarak abstraction saglar.
        1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
        1.5 - Hiz acisindan avantajlidir
        1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
        1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
        1.8 - Abstract class constructor`a sahiptir

        2) Interface :
        2.1 - Class degildir.
        2.2 - Sadece abstract method`lar konabilir.
        2.3 - Tam abstraction (soyutluk) saglar
        2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
        2.5 - Hiz acisindan abstract class`a gore yavastir.
        2.6 - Icindeki tum nesnelerin public olmasi gerekir.
        2.7 - Method'lar static olamaz
        2.8 - Abstract class constructor`a sahiptir    */
public interface Engine {
//public void eco(){};//interface lerde metodlara body konulmaz. tum methodlar "abstract" olmak zorundadır.
void eco();//interface lerdeki tum metodlar abstract olmak zorundadır
           // interface lerde abstract method olustururken; abstract kullanmaya gerek yoktur. cunku java onun abstract oldugunu bilir.yazarsakda sıkıntı olmaz
           //interfacelerdeki metodlar otomatik olarak publictir. bu yuzden o methodlar icin public yazmaya gerek yoktur. yazarsak da yazmasak da method olusur.
           //public abstract void eco() ile "void eco();"

//"public abstract void eco()"=="void eco()"=======>>>>>ayni anlamda



    void gas();
void tsi();
//default keyword kullanarak interface'lerin içinde body'si olan methodlar üretebilirsiniz.

public default int add(int a,int b){//default oldugu icin sikayet etmiyor.burdaki default Access Modifier degil;
    //interfacelerin icinde return keywordlari olusturmak interfacelerin icinde concirit method olusturmak istendigin
    return  a+b;
}





}

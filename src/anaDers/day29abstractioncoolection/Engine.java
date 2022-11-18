package anaDers.day29abstractioncoolection;

public interface Engine extends Vahicle{
    //Child         Parent
    //Class------> Interface===>implements
    //Class------> Class=====>  extends
    //Interface--->Interfaec==> extends
    //Interface--->Class===>    Mumkun degil

    int price=2000;//interfacelerein icine variabele konulabilir.icine accsees modifier yazılmaz cunku otomatık olarak(default) puplictir
     //variable olusturunca deger atamasan sikayet eder; interfacelerda degerler otomatik olarak final dir.

     //interfacelerda tum degerler otomatik olarak static dir. YANİ: STATİC-PUPLİC-FİNAL
     //farklı data tipi ile aynı degeri cagırabiliyoruz
     //interfacelerde consturactor olmadıgı icin interfacelerden obje olusturulamaz
     // abstract class oldukları icin constractor vardır.ama consturactorlar abstractorlar classlarda obje olusturamazlar
     //java 2 yerden obje olusturulmaz: interface- abstractlar
    void run();
double weight=23.5;
}

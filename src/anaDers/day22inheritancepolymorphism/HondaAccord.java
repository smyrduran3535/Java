package anaDers.day22inheritancepolymorphism;
/*

    1)Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir Constructor verir, çünkü
      Java Class'ın bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve Object oluşturmak için
      Constructor'ın şart olduğunu bilir.
    2)Java'nın otomatik olarak oluşturduğu bu görünmez Constructor'a "default constructor" denir.
    3)Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java "default constructor" ı siler.
    4)Bir Class'da birden fazla Constructor olabilir.Fakat bu Consracturların parametreleri farklı olmalıdır
    5)"this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'daki "price" isimli variable demektir.
      "this.price" syntax'i constructor'ların içinde kullanılır.
    Constuructur kullanarak variable uzerşnde yapılan degisiklikler sadece Object uzerındeki degerleri degistirebilir.
    Class daki variable degerlerlerini degistiremez.
 */



public class HondaAccord extends honda {
    public int price;//deger atamazsak 0dır degeri
    public int year;
    public String make;
    public String model;
    public HondaAccord(){//gorunmez consturactur ı gorunur hale getirıyoruz. gorunmeyen ıptal olur

    }
    public HondaAccord(int price ){
        this.price=price;
    }
    public HondaAccord(int price ,int year){

this.price=price;
        this.year=year;
        this.price=price;
        System.out.println("Honda Accord Constuructor");
    }
    public HondaAccord(int price,int year,String make,String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;
    }
}

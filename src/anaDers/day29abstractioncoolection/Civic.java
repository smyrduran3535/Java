package anaDers.day29abstractioncoolection;
/*
   "abstract method"lar sadece ne yapacagını soyler(what to do)
   "concrete method"lar ne yapılacagı ile birlikte nasıl yapılacagını da soyler (how to do)
   "interface"ler yapılacak isler listesidir. (To do list)
"Multple Parent interface kullandıgınız da aynı method ismi ile
birden fazla method olusturursanız bu methodların return typeları aynı olmalıdır.
aksi taktirde hata veriirreturn type lar farklı olacaksa aynı metod ismini kullanamazsın hata verir.
 */
/*
/*
   İNTW:SORU: Abstract Class ile interface farklari nedir?
 1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

             SORU:Object Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction
 */















public class Civic implements Engine,Ac{
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }



    }


package anaDers.day23inheritancepolymorphism;

public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats meow");
    }
//Asagıdakı metod overridig edilmis metod
    @Override
    public void eat() {//animal yazmasını ıstemedik cat eat yapmak ıcın overrıde yaptık parent class dan alarak.
        // @override annotation ını kullanarak;javanın yaptıgımız overrıde islemini kontrol etmesini saglarız
        // super.eat();//parenta git eate kullan demek o yuzden kullanmıycaz bunu
        System.out.println("Cats eat");

        /*
        override yaparken metodun body si degistirilir..yani uygulama degistirilir

        2-overrşde yaparken asla method signature ı (isim ve parametre)asla degistirilemez

        3-override yaparken inheritance olmak zorundadır

        4-override yaparken acces modifierlar belli kurallara gore farklılastırılabilirler
                  i-private methodlar override edilemez
                  ii-Child class daki "override edilen" metodun acces modifier'ı Parent class daki
                  metodun access modifier'ı ile aynı veya genis olmalıdır.
                  Note: Child class daki metodun access modifier ı daha dar olamaz
                  iii- default metodlar aynı package icinde iseler overide edilirler. farklı package den override edilemezler
         5-Parent class daki metodun "return type" ı void ise "return "type i degistirilemez.

         6-Parent class daki metodun "return type" ı primitive ise "return "type i degistirilemez.

         7-Parent class daki metodun "return type" ı Wrapper class ise "return "type i degistirilemez.

         8-Parent class daki metodun "return type" ı Child class ise "return "type i childlardan biri olabilir

         Note:Child Classs daki return type Parent Class dakşnden genis olamaz
         Note:Aralarında Parent child iliskisi olmayan Classlar Overriding de Return type degisimide kullanılamazlari
             "Short", "Integer" dan kucuktur fakat aralarında Parent Child iliskisi olmadıgında Integer yerine Short kullanamazsınız
         Note: Child daki metodun return type ından Parent taki metodun return type ına giside "IS-A" Relationship olmalı.
              aralarında IS-A Relationship olan data tyoelara "Covariant" denir.

         9-Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

         10-"Final" methodlar override edilemezler cunku overriding de method body degistirilir.
          fakat fınal metod body degistirilmesine musade etmez.

         11-Polymorphism(coklu yapı) =Overloading()+ Overriding(body degisir)
         Note:Polymorphism nedir derlerse overloadig ve overriding 'ı anlatın.
         Note:Overloading ile Overrindig arasındaki farklar nelerdir

               1-overloading(tek class da yapılır) icin inheritance gerekmez-overriding de inheritance gerekir
               2- private metodlar overload edilir;override edilemezler
               3-"final" metodlar overload edilir; override edilemezler
               4-"Overloading" static polymorphism olarak adlandırılır,Overriding dynamic polymorphismmolarak adlandırılır.
                 cunku static metodlar overload edilir override edilemez.
               5-"Overloading"de method signature degisir fakat "Overriding"method signature a dokunulmaz.

         Note: Eğer aynı isimli farklı parametreli method'lar oluşturursanız buna "method overloading" denir
               =>>>>method overloading yapmak için yollar:
                 A) Parametrelerin sayısını değiştirmek
                 B) Parametrelerin data type'ini değiştirmek
                 C) Parametrelerin data type'lari farklı ise yerlerini değiştirmek
         */
        }

    @Override
    public Integer multiple(int a, int b) {
        return a+b;
    }

    @Override
    public int add(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal creatae() {
        return new Mammal();
    }

}

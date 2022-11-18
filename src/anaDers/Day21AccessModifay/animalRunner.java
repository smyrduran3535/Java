package anaDers.Day21AccessModifay;

public class animalRunner {
    public static void main(String[] args) {
/*
1-  "inheritance" sayesinde
    *kod tekrarlarından kurtulmus oluruz
    *kod tamiri(maintenance) kolay olur
    *child classları daha atomic yapmıs oluruz
2-  bir clası baska bir classın child classı yapmak icin extents keyword kullanılır. ilk yazılan class child ,
    ikinci yazılan class parent olur
3-  child class objectleri parent class dan method ve variable leri kullanabilirler
4-  Parent class objectleeri child class dan method ve variable kullanamazlar
5-  Object Class her classın parentıdır
    javada Object Class HARİC her class ın parentı vardır
    Javada parent ı olmayan tek class Object class tır
6-  "Private" metod ve variabler child class tarafından kullanılamaz
    "Protected" metodu metod ve variabler child class tarafından kullanılabilir
    "default" method ve variabler aynı package de  Child Classlar tarafından kullanılabilir
    "public" method ve variabler Child Classlar tarafından kullanılabilir
     Child Classlar tarafından kullanılabilir olmak ;"inherit edilebilir" demektir

8-    4 tip inharitance vardır . bunlar;
      1-Multilevel:java bunu destekler kabul eder
      2-hierarchical ınheritance:bir parent icin coklu child ;java bunu destekler
      3-Multiple Inheritance:bir child  a coklu parent,java bunu desteklemez.
      4-singal ınheritance: bir child a bir parent class demektir.java bunu destekler.
 */
        cat c1=new cat();
        c1.eat();
        c1.meaw();
        c1.drink();

        Dog c2=new Dog();
        c2.bark();
        c2.eat();
        c2.drink();
animal a1=new animal();

    }
}

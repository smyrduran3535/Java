package anaDers.day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {
        //inheritance da variable lar secilirken java objenin data tipine bakar.
        // oncelikle istediginiz variable ı Objeden data type olan Class ında arar
        //o class da bulamazsa Parent Classa bakar
        //hicbir Class da bulamazsa hata verir
        Cat cat1 = new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45

        Mamal cat2 = new Cat();
        System.out.println(cat2.a);//13
        System.out.println(cat2.b);//34

        Animal cat3 = new Cat();
        System.out.println(cat3.a);//12
        System.out.println(cat3.c);//45

        Cat cat4 = new Cat();
        //ınharetenca da varıabler secilirken Java constractera(new Cat) bakar.
        // oncelilke ıstedıgınız metodu constracture kullanılan Class dan alır.
        //o class da bulamazsa parent class lara bakar
        // hic biryerde Parentte bulamazsa hata verir

        cat4.eat();//animal eat
        cat4.drink();//drink cat de yok mamal dan alır : animal drink yazar

        //object olusturulurken objectın data typr ı child class lardan secilemez
        //Cat cat4=new Mamal();
        Mamal cat5 = new Mamal();
        cat5.eat();//animal eat

        Animal cat6=new Animal();
        cat6.eat();//animal eat

    }
}
